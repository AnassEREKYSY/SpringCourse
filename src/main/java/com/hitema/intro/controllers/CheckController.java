package com.hitema.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class CheckController {
    @GetMapping(value = {"/check", "/hello"})
    public String serverUp() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        String style = "text-align: center; color: green;";
        return "<h2 style=\"" + style + "\">Server Up " + formattedDateTime+"</h2>";
    }
}
