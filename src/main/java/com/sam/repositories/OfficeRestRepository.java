package com.sam.repositories;

import com.sam.models.Agent;
import com.sam.models.Office;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeRestRepository extends CrudRepository<Office, Integer> {

}
