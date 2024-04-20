package com.builder.casa.service;

import com.builder.casa.patternsBuilder.IBuilderCasa;
import com.builder.casa.modelo.Casa2Quartos;
import com.builder.casa.modelo.Casa2Quartos2BanheirosChurrasqueira;
import com.builder.casa.modelo.Casa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasaApplication.class, args);
		IBuilderCasa builderCasa = new Casa2Quartos();
		builderCasa.buildQuartos();
		builderCasa.buildBanheiros();
		builderCasa.buildChurrasqueira();
		Casa casa = builderCasa.getCasa();

		System.out.println("Casa 1");
		System.out.println("Quartos: " + casa.getQuartos());
		System.out.println("Banheiros: " + casa.getBanheiros());
		System.out.println("Churrasqueira: " + casa.getChurrasqueira());

		System.out.println("-------------------------------");

		IBuilderCasa builderCasa1 = new Casa2Quartos2BanheirosChurrasqueira();
		builderCasa1.buildQuartos();
		builderCasa1.buildBanheiros();
		builderCasa1.buildChurrasqueira();
		Casa casa1 = builderCasa1.getCasa();

		System.out.println("Casa 2");
		System.out.println("Quartos: " + casa.getQuartos());
		System.out.println("Banheiros: " + casa.getBanheiros());
		System.out.println("Churrasqueira: " + casa.getChurrasqueira());
	}

}
