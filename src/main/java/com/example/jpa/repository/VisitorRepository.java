package com.example.jpa.repository;


import com.example.jpa.model.Visitor;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface VisitorRepository extends CrudRepository<Visitor, Integer> {

}
