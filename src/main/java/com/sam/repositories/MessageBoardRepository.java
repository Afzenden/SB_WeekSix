package com.sam.repositories;

import com.sam.models.MessageBoard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageBoardRepository extends CrudRepository<MessageBoard, Integer> {
}
