package com.sam.services;

import com.sam.models.Office;
import com.sam.repositories.OfficeRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeRestService {
    @Autowired
    private OfficeRestRepository officeRestRepository;

    public List<Office> getAllOfficeTest() {
        return (List<Office>) officeRestRepository.findAll();
    }

    public Optional<Office> getOneOfficeTest(Integer id) {
        return officeRestRepository.findById(id);
    }
}
