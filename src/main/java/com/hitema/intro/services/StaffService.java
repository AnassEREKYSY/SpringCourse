package com.hitema.intro.services;

import com.hitema.intro.models.Staff;

import java.util.List;

public interface StaffService {

    public Staff create(Staff staff);
    public Staff update(Staff staff);
    public boolean delete(long id);
    public Staff read(long id);
    public List<Staff> readAll();
}
