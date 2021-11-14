package com.RestTemplate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.RestTemplate.client.Response;

@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
int x=10;
		SpringApplication.run(RestTemplateApplication.class, args);
	   RestTemplate rt=new RestTemplate();
	   String url="https://quoters.apps.pcfone.io/api/random";
	   ResponseEntity<Response> responseforEntity = rt.getForEntity(url, Response.class);
		Response body = responseforEntity.getBody();
		System.out.println(body);
System.out.println("completed");

	}

}
