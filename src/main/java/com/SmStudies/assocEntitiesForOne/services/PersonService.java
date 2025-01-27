package com.SmStudies.assocEntitiesForOne.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmStudies.assocEntitiesForOne.dto.PersonDTO;
import com.SmStudies.assocEntitiesForOne.dto.PersonDepartmentDTO;
import com.SmStudies.assocEntitiesForOne.entities.Department;
import com.SmStudies.assocEntitiesForOne.entities.Person;
import com.SmStudies.assocEntitiesForOne.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
		
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dept = new Department();
		dept.setId(dto.getDepartment().getId());
		entity.setDepartment(dept);
				
		entity = personRepository.save(entity);
							
		return new PersonDepartmentDTO(entity); 
		
	}	
	
	public PersonDTO insert(PersonDTO dto) {
		
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
				
		Department dept = new Department();
		dept.setId(dto.getDepartmentId());
		entity.setDepartment(dept);
				
		entity = personRepository.save(entity);
							
		return new PersonDTO(entity); 
		
	}	

}
