package com.hitema.intro.services;

import com.hitema.intro.models.Staff;
import com.hitema.intro.repositories.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl  implements StaffService{

    StaffRepository staffRepository;
    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public Staff create(Staff staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public Staff update(Staff staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public boolean delete(long id) {
        this.staffRepository.deleteById(id);
        return (read(id)==null);
    }

    @Override
    public Staff read(long id) {
        return this.staffRepository.findById(id).orElse(null);
    }

    @Override
    public List<Staff> readAll() {
        return this.staffRepository.findAll();
    }
}
