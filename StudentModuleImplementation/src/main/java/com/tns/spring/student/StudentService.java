package com.tns.spring.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public Student get(Integer id) {
		return repository.findById(id).get();
	}




	public void delete(Integer id) {
		repository.deleteById(id);

	}



	public void save(Student student) {
		repository.save(student);
		
	}




	public List<Student> listAll() {
		return repository.findAll();
	}

	}

