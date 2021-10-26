package com.sam.repositories;

import com.sam.models.Agent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentRepository extends CrudRepository<Agent, Integer> {

    //Crud extends the @Entity and Primary Key


}
