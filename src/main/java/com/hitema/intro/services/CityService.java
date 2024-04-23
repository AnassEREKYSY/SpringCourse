package com.hitema.intro.services;

import com.hitema.intro.models.City;

import java.util.List;

public interface CityService {
    public City create(City city);
    public City update(City city);
    public boolean delete(long id);
    public City read(long id);
    public List<City> readAll();
}
