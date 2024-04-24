package com.hitema.intro.services;

import com.hitema.intro.models.City;
import com.hitema.intro.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City create(City city) {
        return this.cityRepository.save(city);
    }

    @Override
    public City update(City city) {
        return this.cityRepository.save(city);
    }

    @Override
    public boolean delete(long id) {
        this.cityRepository.deleteById(id);
        return (read(id)==null);
    }

    @Override
    public City read(long id) {
        return this.cityRepository.findById(id).orElse(null);
    }

    @Override
    public List<City> readAll() {
        return this.cityRepository.findAll();
    }

    @Override
    public List<City> readAllByName(String expr) {
        return cityRepository.findCitiesByNameContaining(expr);
    }

    @Override
    public List<City> readAllCapitals() {
        return cityRepository.findCitiesByCapitalTrue();
    }
}
