package com.hitema.intro.services;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CityServiceTest.class);

    @Autowired
    CityService cityService;

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
        cityService.readAll().forEach(c->log.info((Supplier<String>) c));
    }
}