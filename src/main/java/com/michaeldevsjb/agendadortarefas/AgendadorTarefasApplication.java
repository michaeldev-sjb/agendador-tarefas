package com.michaeldevsjb.agendadortarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AgendadorTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendadorTarefasApplication.class, args);
	}

}
