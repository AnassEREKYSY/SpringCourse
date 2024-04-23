package com.hitema.intro.controllers;

import com.hitema.intro.models.City;
import com.hitema.intro.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/cities")
public class CityController {

    final private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping({"/all","/"})
    public List<City> readAll(){
        return cityService.readAll();
    }

    @GetMapping("/city/{id}")
    public City read(@PathVariable long id){
        return cityService.read(id);
    }
}
