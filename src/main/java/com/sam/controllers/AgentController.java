package com.sam.controllers;

import com.sam.models.Agent;
import com.sam.services.AgentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/agents")
public class AgentController {
    @Autowired
    private AgentService agentService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Agent> agents = agentService.getAll();
        log.info("What is returned {}", agentService.getAll());
        model.addAttribute("agents", agents);
        return "agents";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Agent> getOne(@RequestParam Integer id) {
        log.info("What is returned {}", agentService.getOne(id));
        return agentService.getOne(id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(Agent agent) {
        agentService.addNew(agent);
        return "redirect:/agents/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Agent agent) {
        agentService.update(agent);
        return "redirect:/agents/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(@RequestParam Integer id) {
        agentService.delete(id);
        return "redirect:/agents/getAll";
    }
}
