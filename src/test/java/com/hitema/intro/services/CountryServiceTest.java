package com.hitema.intro.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CountryServiceTest {


    private static final Logger log = LoggerFactory.getLogger(CountryServiceTest.class);
    
    @Autowired
     CountryService countryService;

    @Test
    void create() {
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
        countryService.readAll().forEach(c->log.info((Supplier<String>) c));
    }
}