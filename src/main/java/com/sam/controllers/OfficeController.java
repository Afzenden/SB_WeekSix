package com.sam.controllers;

import com.sam.models.Agent;
import com.sam.models.Office;
import com.sam.services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/office")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Office> office = officeService.getAll();
        model.addAttribute("office", office);
        return "office";
    }

    @RequestMapping("/getOneOffice")
    @ResponseBody
    public Optional<Office> getOneOffice(@RequestParam Integer id) {
        return officeService.getOneOffice(id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Office office) {
        officeService.addNew(office);
        return "redirect:/office/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Office office) {
        officeService.update(office);
        return "redirect:/office/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@RequestParam Integer id) {
        officeService.delete(id);
        return "redirect:/office/getAll";
    }
}
