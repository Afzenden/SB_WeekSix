package com.sam.services;

import com.sam.models.Messages;
import com.sam.repositories.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessagesService {
    @Autowired
    private MessagesRepository messagesRepository;

    public List<Messages> getAll() {
        return (List<Messages>) messagesRepository.findAll();
    }

    public Optional<Messages> getOne(Integer id) {
        return messagesRepository.findById(id);
    }

    public Messages addNew(Messages buyers) {
        return messagesRepository.save(buyers);
    }

    public Messages update(Messages buyers) {
        return messagesRepository.save(buyers);
    }

    public void delete(Integer id) {
        messagesRepository.deleteById(id);
    }

}
