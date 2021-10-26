package com.sam.controllers;

import com.sam.models.MessageBoard;
import com.sam.services.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/messageboard")
public class MessageBoardController {

    @Autowired
    private MessageBoardService messageBoardService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<MessageBoard> messageBoard = messageBoardService.getAll();
        model.addAttribute("MessageBoard", messageBoard);
        return "messageboard";
    }

    @RequestMapping(value = "/getOne")
    @ResponseBody
    public Optional<MessageBoard> getOne(@RequestParam Integer id) {
        return messageBoardService.getOne(id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(MessageBoard messageBoard) {
        messageBoardService.addNew(messageBoard);
        return "redirect:/messageboard/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(MessageBoard messageBoard) {
        messageBoardService.update(messageBoard);
        return "redirect:/messageboard/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete( @RequestParam Integer Id) {
        messageBoardService.delete(Id);
        return "redirect:/messageboard/getAll";
    }
}
