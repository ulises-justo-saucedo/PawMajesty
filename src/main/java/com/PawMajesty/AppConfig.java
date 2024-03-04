package com.PawMajesty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.PawMajesty.database.Database;
import com.PawMajesty.repository.KittenRepository;
import com.PawMajesty.service.KittenService;

@Configuration
@ComponentScan(basePackages = {"com.PawMajesty"})
public class AppConfig {
	@Bean(name = "database")
	public Database database() {
		return new Database();
	}
	@Bean(name = "kittenRepository")
	public KittenRepository kittenRepository() {
		return new KittenRepository();
	}
	@Bean(name = "kittenService")
	public KittenService kittenService() {
		return new KittenService();
	}
}
