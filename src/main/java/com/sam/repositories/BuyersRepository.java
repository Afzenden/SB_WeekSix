package com.sam.repositories;

import com.sam.models.Buyers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyersRepository extends CrudRepository<Buyers, Integer> {
}
