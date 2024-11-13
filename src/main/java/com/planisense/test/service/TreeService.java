package com.planisense.test.service;

import com.planisense.test.dto.Summary;
import com.planisense.test.entity.Tree;
import com.planisense.test.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {
    @Autowired
    private TreeRepository treeRepository;

    public Page<Tree> find(int page, int size){
        return treeRepository.findAll(PageRequest.of(page,size, Sort.by("id")));
    }
    public List<Summary> countByDistrict(){
        return treeRepository.countByDistrict();
    }
    public List<Summary> countByType(){
        return treeRepository.countByType();
    }
}
