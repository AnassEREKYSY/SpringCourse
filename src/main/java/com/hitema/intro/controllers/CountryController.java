package com.hitema.intro.controllers;

import com.hitema.intro.models.Country;
import com.hitema.intro.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/countries")
public class CountryController {

    final private CountryService countryService;

    @Autowired
    public CountryController(CountryService service) {
        this.countryService = service;
    }

    @GetMapping({"/all","/"})
    public List<Country> readAll(){
        return countryService.readAll();
    }

    @GetMapping("/country/{id}")
    public Country read(@PathVariable long id){
        return countryService.read(id);
    }
}
