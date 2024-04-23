package com.hitema.intro.services;

import com.hitema.intro.models.Country;
import com.hitema.intro.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

 @Service
public class CountryServiceImpl implements CountryService{

    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country create(Country country) {
        return this.countryRepository.save(country);
    }

    @Override
    public Country update(Country country) {
        return this.countryRepository.save(country);
    }

    @Override
    public boolean delete(long id) {
        this.countryRepository.deleteById(id);
        return (read(id)==null);
    }

    @Override
    public Country read(long id) {
        return this.countryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Country> readAll() {
        return this.countryRepository.findAll();
    }
}
