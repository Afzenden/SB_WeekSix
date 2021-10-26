package com.sam.repositories;

import com.sam.models.Listings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingsRepository extends CrudRepository<Listings, Integer> {
}
