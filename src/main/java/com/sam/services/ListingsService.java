package com.sam.services;

import com.sam.models.Listings;
import com.sam.repositories.ListingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListingsService {
    @Autowired
    private ListingsRepository listingsRepository;

    public List<Listings> getAll() {
        return (List<Listings>) listingsRepository.findAll();
    }

    public Optional<Listings> getOneListing(Integer id) {
        return listingsRepository.findById(id);
    }

    public Listings addNew(Listings buyers) {
        return listingsRepository.save(buyers);
    }

    public Listings update(Listings buyers) {
        return listingsRepository.save(buyers);
    }

    public void delete(Integer id) {
        listingsRepository.deleteById(id);
    }

}
