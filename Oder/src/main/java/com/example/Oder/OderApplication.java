package com.example.Oder;

import com.example.Oder.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.example.Oder.repositories.OrderRepositoty;

@SpringBootApplication
public class OderApplication {

	@Autowired
	private OrderRepositoty orderRepositoty;
	public static void main(String[] args) {
		SpringApplication.run(OderApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				for (int i=1; i<=10;i++){
					orderRepositoty.save(new Order(i,"order"+i));
				}
			}
		};
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
