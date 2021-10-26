package com.sam.services;

import com.sam.models.MessageBoard;
import com.sam.repositories.MessageBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageBoardService {
    @Autowired
    private MessageBoardRepository messageBoardRepository;

    public List<MessageBoard> getAll() {
        return (List<MessageBoard>) messageBoardRepository.findAll();
    }

    public Optional<MessageBoard> getOne(Integer Id) {
        return messageBoardRepository.findById(Id);
    }

    public MessageBoard addNew(MessageBoard buyers) {
        return messageBoardRepository.save(buyers);
    }

    public MessageBoard update(MessageBoard buyers) {
        return messageBoardRepository.save(buyers);
    }

    public void delete(Integer Id) {
        messageBoardRepository.deleteById(Id);
    }

}
