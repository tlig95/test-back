package com.planisense.test.controller;

import com.planisense.test.dto.Summary;
import com.planisense.test.dto.TreeDto;
import com.planisense.test.mapper.TreeMapper;
import com.planisense.test.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tree")
@CrossOrigin(origins = "http://localhost:3000/")
public class TreeController {
    @Autowired
    public TreeService service;
    @Autowired
    public TreeMapper treeMapper;

    @GetMapping
    public List<TreeDto> findAll(@RequestParam final int page, @RequestParam final int size) {
        return treeMapper.toDtos(service.find(page,size).getContent());
    }
    @GetMapping("/countByDistrict")
    public List<Summary> countByDistrict() {
        return service.countByDistrict();
    }
    @GetMapping("/countByType")
    public List<Summary> countByType() {
        return service.countByType();
    }
}
