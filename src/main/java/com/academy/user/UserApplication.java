package com.academy.user;

import com.academy.user.greet.Greet;
import com.academy.user.greet.impl.Afternoon;
import com.academy.user.greet.impl.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication implements ApplicationRunner {
	@Autowired
	private final Greeting greeting;

	private final Greet greet;

	@Value(value="${spring.application.name}")
	private String appName;

	public UserApplication(Greeting greeting, Greet greet) {
		this.greeting = greeting;
		this.greet = greet;

	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(greeting.sayHello("Student"));
		greet.greeting();
		System.out.println(appName);

	}

}
