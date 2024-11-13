package com.planisense.test.service;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.planisense.test.dto.TreeApiDto;
import com.planisense.test.entity.Tree;
import com.planisense.test.repository.TreeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
@Service
public class FeedDbService {

    private final TreeRepository treeRepository;

    public FeedDbService(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    @Transactional
    public List<Tree> loadData() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("les-arbres.json");
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new InputStreamReader(is));
        TreeApiDto[] data = gson.fromJson(reader, TreeApiDto[].class); // contains the whole reviews list
        List<Tree> trees = new ArrayList<>();
        for (TreeApiDto tree : data) {
            if(tree.getIdbase()>0){
                var dbTree = mapTreeToDb(tree);
                trees.add(dbTree);
                treeRepository.save(dbTree);
            }
        }
        return trees;
    }

    public Tree mapTreeToDb(TreeApiDto tree) {
        var dbTree  = new Tree();
        dbTree.setId(tree.getIdbase());
        dbTree.setLocationType(tree.getTypeemplacement());
        dbTree.setDomain(tree.getDomanialite());
        dbTree.setDistrict(tree.getArrondissement());
        dbTree.setAdditionalAddress(tree.getComplementadresse());
        dbTree.setNumber(tree.getNumero());
        dbTree.setAddress(tree.getAdresse());
        dbTree.setLocationId(tree.getIdemplacement());
        dbTree.setLabelFr(tree.getLibellefrancais());
        dbTree.setType(tree.getGenre());
        dbTree.setSpace(tree.getEspece());
        dbTree.setVarietyOrCultivar(tree.getVarieteoucultivar());
        dbTree.setCircumference(tree.getCirconferenceencm());
        dbTree.setHeight(tree.getHauteurenm());
        dbTree.setDevelopmentStage(tree.getStadedeveloppement());
        dbTree.setRemarkable(tree.getRemarquable()!=null? tree.getRemarquable().equals("OUI"):null);
        dbTree.setGeoPoint(tree.getGeo_point_2d());
        return dbTree;
    }
}
