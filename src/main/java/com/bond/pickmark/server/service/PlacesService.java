package com.bond.pickmark.server.service;

import com.bond.pickmark.server.entity.Places;

import java.util.List;


public interface PlacesService {

    List<Places> getAll();
    Places getById(long id);
    Places save(Places places);
    void remove(long id);

}
