package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


//database seeding (popular o banco de dados)
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//resolver a independencia automaticamente
	@Autowired
	private UserRepository userRepository;

	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
