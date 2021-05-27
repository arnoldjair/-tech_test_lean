package com.leantech.user;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/user")
@SpringBootApplication
public class UserApplication {

	@RequestMapping(value = "/user")
	public List<User> listAll() {
		return List.of(User.builder().firstName("Alejandra").lastName("Marín").build(),
				User.builder().firstName("Arnold").lastName("Jiménez").build());
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}

@Data
@Builder
class User {
	private String firstName;
	private String lastName;
}
