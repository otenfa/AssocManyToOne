package com.SmStudies.assocEntitiesForOne;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssocEntitiesForOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AssocEntitiesForOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("concluída a inicialização do projeto!");
		
	}

}
