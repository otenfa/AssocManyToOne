package com.SmStudies.assocEntitiesForOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SmStudies.assocEntitiesForOne.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
