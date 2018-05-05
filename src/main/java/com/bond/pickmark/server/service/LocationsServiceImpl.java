package com.bond.pickmark.server.service;

import com.bond.pickmark.server.entity.Locations;
import com.bond.pickmark.server.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationsServiceImpl implements LocationsService {

    @Autowired
    private LocationsRepository repository;

    public List<Locations> getAll() {
        return repository.findAll();
    }
}
