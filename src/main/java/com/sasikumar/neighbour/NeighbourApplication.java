package com.sasikumar.neighbour;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NeighbourApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeighbourApplication.class, args);
	}
	@GetMapping("/login")
	public String login(String userId)
	{
		return String.format("Login Successful for: " + userId);
	}

}

