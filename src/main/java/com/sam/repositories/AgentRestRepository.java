package com.sam.repositories;

import com.sam.models.Agent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRestRepository extends CrudRepository<Agent, Integer> {
}
