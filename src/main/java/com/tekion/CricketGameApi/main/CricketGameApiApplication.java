package com.tekion.CricketGameApi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CricketGameApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketGameApiApplication.class, args);
	}
}
