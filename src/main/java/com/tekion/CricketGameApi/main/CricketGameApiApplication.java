package com.tekion.CricketGameApi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan({"com.tekion"})
public class CricketGameApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CricketGameApiApplication.class, args);
	}
}
