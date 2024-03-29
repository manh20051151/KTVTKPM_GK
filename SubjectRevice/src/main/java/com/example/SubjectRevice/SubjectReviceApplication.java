package com.example.SubjectRevice;

import com.example.SubjectRevice.models.Subject;
import com.example.SubjectRevice.repositories.SubjectRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SubjectReviceApplication {

	@Autowired
	private SubjectRepositoty subjectRepositoty;
	public static void main(String[] args) {
		SpringApplication.run(SubjectReviceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				for (int i=1; i<=10;i++){
					subjectRepositoty.save(new Subject(i,"order"+i, "Credit"+i));
				}
			}
		};
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
