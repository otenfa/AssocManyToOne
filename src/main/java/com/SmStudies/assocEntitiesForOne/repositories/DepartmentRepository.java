package com.SmStudies.assocEntitiesForOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SmStudies.assocEntitiesForOne.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
