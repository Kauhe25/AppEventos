package com.eventoapp.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.eventoapp"})
@ComponentScan(basePackageClasses= {com.eventoapp.models.Evento.class})
@EntityScan(basePackages = {"com.eventoapp.models"})
@EnableJpaRepositories(basePackages = "com.eventoapp.repository")
public class EventoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoAppApplication.class, args);
	}

}

