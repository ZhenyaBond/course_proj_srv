package com.bond.pickmark.server.service;

import com.bond.pickmark.server.entity.Places;
import com.bond.pickmark.server.repository.PlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacesServiceImpl implements PlacesService {

    @Autowired
    private PlacesRepository repository;

    public List<Places> getAll() {
        return repository.findAll();
    }

    public Places getById(long id) {
        return repository.getOne(id);
    }

    public Places save(Places places) {
        return repository.saveAndFlush(places);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
