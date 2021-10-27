package com.sam.repositories;

import com.sam.models.Messages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends CrudRepository<Messages, Integer> {
}
