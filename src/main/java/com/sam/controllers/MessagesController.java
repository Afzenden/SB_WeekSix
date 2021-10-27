package com.sam.controllers;

import com.sam.models.Messages;
import com.sam.services.MessagesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping(value = "/messages")
public class MessagesController {

    @Autowired
    private MessagesService messagesService;

    @RequestMapping(value = "/getAll")
    public String getAll(Model model) {
        List<Messages> messages = messagesService.getAll();
        log.info("List? {}", messagesService.getAll());
        model.addAttribute("Messages", messages);
        return "messages";
    }

    @RequestMapping(value = "/getOne")
    @ResponseBody
    public Optional<Messages> getOne(@RequestParam Integer id) {
        return messagesService.getOne(id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Messages messages) {
        messagesService.addNew(messages);
        return "redirect:/messages/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Messages messages) {
        messagesService.update(messages);
        return "redirect:/messages/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete( @RequestParam Integer id) {
        messagesService.delete(id);
        return "redirect:/messages/getAll";
    }
}
