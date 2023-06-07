package com.example.springwebapp.repositories;

import com.example.springwebapp.models.VisitorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends CrudRepository<VisitorModel, Long> {
}
