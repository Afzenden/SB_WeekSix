package com.sam.controllers;

import com.sam.models.Listings;
import com.sam.services.ListingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/listings")
public class ListingsController {

    @Autowired
    private ListingsService listingsService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Listings> listings = listingsService.getAll();
        model.addAttribute("listings", listings);
        return "listings";
    }

    @RequestMapping(value = "/getOneListing")
    @ResponseBody
    public Optional<Listings> getOneListing(@RequestParam Integer id) {
        return listingsService.getOneListing(id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Listings listings) {
        listingsService.addNew(listings);
        return "redirect:/listings/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Listings listings) {
        listingsService.update(listings);
        return "redirect:/listings/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@RequestParam Integer id) {
        listingsService.delete(id);
        return "redirect:/listings/getAll";
    }
}
