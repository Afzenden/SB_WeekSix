package com.sam.services;

import com.sam.models.Agent;
import com.sam.repositories.AgentRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentRestService {
    @Autowired
    private AgentRestRepository agentRestRepository;

    public List<Agent> getAllTest() {
        return (List<Agent>) agentRestRepository.findAll();
    }

    public Optional<Agent> getOneTest(Integer id) {
        return agentRestRepository.findById(id);
    }
}
