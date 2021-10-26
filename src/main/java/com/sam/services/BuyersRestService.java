package com.sam.services;

import com.sam.models.Agent;
import com.sam.models.Buyers;
import com.sam.repositories.AgentRestRepository;
import com.sam.repositories.BuyersRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuyersRestService {
    @Autowired
    private BuyersRestRepository buyersRestRepository;

    public List<Buyers> getAllBuyersTest() {
        return (List<Buyers>) buyersRestRepository.findAll();
    }

    public Optional<Buyers> getOneBuyersTest(Integer id) {
        return buyersRestRepository.findById(id);
    }


}
