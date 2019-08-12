package com.javatechie.es.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Document(indexName="javatechie",type="customer",shards=2)
@Data
public class Customer {
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private int age;

}
