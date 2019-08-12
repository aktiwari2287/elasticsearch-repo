package com.javatechie.es.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.es.api.model.Practice;
import com.javatechie.es.api.repository.PracticeRepository;

@RestController
public class PracticeResource {

	@Autowired
	private PracticeRepository repository;
	
	@PostMapping("/savePractice")
	public int saveCustomer(@RequestBody List<Practice> practices) {
		System.out.println("Anand ..........................." + practices);
		repository.saveAll(practices);
		return practices.size();
	}

	@GetMapping("/findAllPractice")
	public Iterable<Practice> findAllCustomers() {
		return repository.findAll();
	}

	@GetMapping("/findByPracticeName/{practiceName}")
	public List<Practice> findByPracticeName(@PathVariable String practiceName) {
		return repository.findBypracticename(practiceName);
	}
}
