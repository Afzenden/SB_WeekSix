package com.sam.controllers;

import com.sam.models.Buyers;
import com.sam.services.BuyersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/buyers")
public class BuyersController {
    @Autowired
    private BuyersService buyersService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Buyers> buyers = buyersService.getAll();
        model.addAttribute("buyers", buyers);
        return "buyers";
    }

    @RequestMapping(value = "/getOneBuyer")
    @ResponseBody
    public Optional<Buyers> getOneBuyer(@RequestParam Integer Id) {
        return buyersService.getOneBuyer(Id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Buyers buyers) {
        buyersService.addNew(buyers);
        return "redirect:/buyers/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Buyers buyers) {
        buyersService.update(buyers);
        return "redirect:/buyers/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@RequestParam Integer Id) {
        buyersService.delete(Id);
        return "redirect:/buyers/getAll";
    }

}