package com.hitema.intro.services;

import com.hitema.intro.models.City;
import com.hitema.intro.models.Country;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CityServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CityServiceTest.class);

    @Autowired
    CityService cityService;

    @Test
    void create() {
        City city = new City();
        city.setCountry(new Country());
        city.setCity("Bracknell");
        city.setLastUpdate(java.time.LocalDateTime.now());

        City createdCity=cityService.create(city);
        assertNotNull(createdCity, "The created city should not be null");
        boolean deletedCity=cityService.delete(createdCity.getId());
        assertTrue(deletedCity);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void read() {
    }

    @Test
    void readAll() {
        cityService.readAll().forEach(c->log.info((Supplier<String>) c));
    }
}