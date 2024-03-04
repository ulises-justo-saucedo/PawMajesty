package com.PawMajesty.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.PawMajesty.entity.Kitten;
import com.PawMajesty.repository.KittenRepository;

public class KittenService {
	@Autowired
	private KittenRepository kittenRepository;
	public void save(Kitten kitten) {
		kittenRepository.save(kitten);
	}
}
