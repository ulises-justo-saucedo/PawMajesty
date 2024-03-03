package com.PawMajesty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.PawMajesty.database.Database;

@Configuration
@ComponentScan(basePackages = {"com.PawMajesty.database"})
public class AppConfig {
	@Bean
	public Database database() {
		return new Database();
	}
}
