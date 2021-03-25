package com.example.springserverlesshelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class SpringServerlessHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServerlessHelloWorldApplication.class, args);
	}

	@Bean
	public Function<Flux<String>, Flux<String>> uppercase(){
		return flux -> flux.map(value -> value.toUpperCase());
	}

}
