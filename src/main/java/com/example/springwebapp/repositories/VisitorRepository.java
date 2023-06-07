package com.example.springwebapp.repositories;

import com.example.springwebapp.models.VisitorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<VisitorModel, Long> {
}
