package com.bond.pickmark.server.service;

import com.bond.pickmark.server.entity.Categories;
import com.bond.pickmark.server.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository repository;

    public List<Categories> getAll() {
        return repository.findAll();
    }
}

