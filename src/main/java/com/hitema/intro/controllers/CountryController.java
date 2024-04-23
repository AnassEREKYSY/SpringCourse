package com.hitema.intro.controllers;

import com.hitema.intro.models.Country;
import com.hitema.intro.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/country/delete/{id}")
    public boolean delete(@PathVariable long id){
        return countryService.delete(id);
    }

    @PostMapping("/country/create")
    public Country create(@RequestBody Country country){
        return countryService.create(country);
    }

    @PutMapping("/country/update")
    public Country update(@RequestBody Country country){
        return countryService.update(country);
    }
}
