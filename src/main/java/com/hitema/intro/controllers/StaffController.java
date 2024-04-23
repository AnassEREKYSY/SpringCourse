package com.hitema.intro.controllers;

import com.hitema.intro.models.Country;
import com.hitema.intro.models.Staff;
import com.hitema.intro.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/staffs")
public class StaffController {

    final  private StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping({"/all","/"})
    public List<Staff> readAll(){
        return staffService.readAll();
    }

    @GetMapping("/staff/{id}")
    public Staff read(@PathVariable long id){
        return staffService.read(id);
    }

    @GetMapping("/staff/{id}/image")
    public Staff readImage(@PathVariable long id){
        return staffService.read(id);
    }


    @DeleteMapping("/staff/delete/{id}")
    public boolean delete(@PathVariable long id){
        return staffService.delete(id);
    }

    @PostMapping("/staff/create")
    public Staff create(@RequestBody Staff staff){
        return staffService.create(staff);
    }

    @PutMapping("/staff/update")
    public Staff update(@RequestBody Staff staff){
        return staffService.update(staff);
    }

}
