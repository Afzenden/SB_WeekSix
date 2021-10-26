package com.sam.services;

import com.sam.models.Office;
import com.sam.repositories.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    public List<Office> getAll() {
        return (List<Office>) officeRepository.findAll();
    }

    public Optional<Office> getOneOffice(Integer Id) {
        return officeRepository.findById(Id);
    }

    public Office addNew(Office office) {
        return officeRepository.save(office);
    }

    public Office update(Office office) {
        return officeRepository.save(office);
    }

    public void delete(Integer Id) {
        officeRepository.deleteById(Id);
    }

}
