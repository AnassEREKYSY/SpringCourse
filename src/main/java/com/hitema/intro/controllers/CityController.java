package com.hitema.intro.controllers;

import com.hitema.intro.models.City;
import com.hitema.intro.models.Country;
import com.hitema.intro.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/city/create")
    public City create(@RequestBody City city){
        return cityService.create(city);
    }

    @DeleteMapping("/city/delete/{id}")
    public boolean delete(@PathVariable long id){
        return cityService.delete(id);
    }

    @PutMapping("/city/update")
    public City update(@RequestBody City city){
        return cityService.update(city);
    }
}
