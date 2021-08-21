package com.calvin.Val.Pass;

import com.calvin.Val.Pass.user.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController //makes the class below serve restful endpoints
public class ValPassApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValPassApplication.class, args);
	}

	@GetMapping
	public List<User> hello(){
		return List.of(
				new User(
						1,
						"joe",
						"secretlogin",
						"joe@mail.com",
						0
				)
		);
	}

}
