package com.bond.pickmark.server.controller;

import com.bond.pickmark.server.entity.Categories;
import com.bond.pickmark.server.entity.Locations;
import com.bond.pickmark.server.entity.Places;
import com.bond.pickmark.server.service.CategoriesService;
import com.bond.pickmark.server.service.LocationsService;
import com.bond.pickmark.server.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class PickMarkController {

    @Autowired
    private PlacesService placesService;

    @Autowired
    private LocationsService locationsService;

    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping(value = "/places", method = RequestMethod.GET)
    @ResponseBody
    public List<Places> getAllPlaces() {
        return placesService.getAll();
    }

//    @RequestMapping(value = "/places/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public Places getPlace(@PathVariable("id") long place_id) {
//        return placesService.getById(place_id);
//    }

    @RequestMapping(value = "/placesAdd", method = RequestMethod.POST)
    @ResponseBody
    public Places savePlace(@RequestBody Places places) {
        return placesService.save(places);
    }

    @RequestMapping(value = "/places/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePlace(@PathVariable long place_id) {
        placesService.remove(place_id);
    }

    //*******************                                                                     *******************//
    //*************************************************LOCATIONS*************************************************//
    //*******************                                                                     *******************//

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    @ResponseBody
    public List<Locations> getAllLocations() {
        return locationsService.getAll();
    }

    //*******************                                                                      *******************//
    //*************************************************CATEGORIES*************************************************//
    //*******************                                                                      *******************//

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    @ResponseBody
    public List<Categories> getAllCategories() {
        return categoriesService.getAll();
    }

}
