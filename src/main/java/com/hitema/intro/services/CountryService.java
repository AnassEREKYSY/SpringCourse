package com.hitema.intro.services;

import com.hitema.intro.models.Country;

import java.util.List;

public interface CountryService {
    public Country create(Country country);
    public Country update(Country country);
    public boolean delete(long id);
    public Country read(long id);
    public List<Country> readAll();
}
