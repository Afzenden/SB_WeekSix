package com.sam.controllers;

import com.sam.models.Buyers;
import com.sam.services.BuyersRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BuyersRestController {

    @Autowired
    private BuyersRestService buyersRestService;

    @RequestMapping("/getAllBuyersTest")
    public List<Buyers> getAllBuyersTest() {

        return buyersRestService.getAllBuyersTest();
    }

    @RequestMapping("/getOneBuyersTest/{id}")
    public Optional<Buyers> getOneBuyersTest(@PathVariable("id") Integer id) {
        return buyersRestService.getOneBuyersTest(id);
    }


}
