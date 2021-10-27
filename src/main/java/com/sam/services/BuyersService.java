package com.sam.services;

import com.sam.models.Buyers;
import com.sam.repositories.BuyersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BuyersService {

    @Autowired
    private BuyersRepository buyersRepository;

    public List<Buyers> getAll() {
        return (List<Buyers>) buyersRepository.findAll();
    }

    public Optional<Buyers> getOneBuyer(Integer id) {
        return buyersRepository.findById(id);
    }

    public Buyers addNew(Buyers buyers) {
        return buyersRepository.save(buyers);
    }

    public Buyers update(Buyers buyers) {
        return buyersRepository.save(buyers);
    }

    public void delete(Integer id) {
        buyersRepository.deleteById(id);
    }

}
