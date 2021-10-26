package com.sam.services;

import com.sam.models.Agent;
import com.sam.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public List<Agent> getAll() {
        return (List<Agent>) agentRepository.findAll();
    }

    public Optional<Agent> getOne(Integer Id) {
        return agentRepository.findById(Id);
    }

    public Agent addNew(Agent agent) {
        return agentRepository.save(agent);
    }

    public Agent update(Agent agent) {
        return agentRepository.save(agent);
    }

    public void delete(Integer Id) {
        agentRepository.deleteById(Id);
    }
}
