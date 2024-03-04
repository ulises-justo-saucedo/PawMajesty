package com.PawMajesty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.PawMajesty.database.Database;

@Configuration
@ComponentScan(basePackages = {"com.PawMajesty"})
public class AppConfig {
	@Bean(name = "database")
	public Database database() {
		return new Database();
	}
}
