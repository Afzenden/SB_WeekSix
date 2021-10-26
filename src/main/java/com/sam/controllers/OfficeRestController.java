package com.sam.controllers;

import com.sam.models.Office;
import com.sam.services.OfficeRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OfficeRestController {

    @Autowired
    private OfficeRestService officeRestService;

    @RequestMapping("/getAllOfficeTest")
    public List<Office> getAllTest() {

        return officeRestService.getAllOfficeTest();
    }

    @RequestMapping("/getOneOfficeTest/{id}")
    public Optional<Office> getOneTest(@PathVariable("id") Integer id) {
        return officeRestService.getOneOfficeTest(id);
    }


}
