package com.javatechie.es.api.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javatechie.es.api.model.Practice;

public interface PracticeRepository extends ElasticsearchRepository<Practice, String>{

	List<Practice> findBypracticename(String practiceName);

}
