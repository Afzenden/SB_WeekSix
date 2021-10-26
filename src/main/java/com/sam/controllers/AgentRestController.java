package com.sam.controllers;

import com.sam.models.Agent;
import com.sam.services.AgentRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AgentRestController {

    @Autowired
    private AgentRestService agentRestService;

    @RequestMapping("/getAllTest")
    public List<Agent> getAllTest() {

        return agentRestService.getAllTest();
    }

    @RequestMapping("/getOneTest/{id}")
    public Optional<Agent> getOneTest(@PathVariable("id") Integer id) {
        return agentRestService.getOneTest(id);
    }


}
