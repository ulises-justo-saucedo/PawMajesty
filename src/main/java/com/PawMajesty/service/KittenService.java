package com.PawMajesty.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.PawMajesty.entity.Kitten;
import com.PawMajesty.repository.KittenRepository;
import com.PawMajesty.urls.URL;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Part;

public class KittenService {
	@Autowired
	private KittenRepository kittenRepository;
	public void save(Kitten kitten, Part imagePart, ServletContext servletContext) {
		try {
			InputStream imageInputStream = imagePart.getInputStream();
			String imageName = imagePart.getSubmittedFileName().toString();
			String imageFilePathFolder = servletContext.getRealPath("/images/") + imageName;
			String imageServerPath = URL.IMAGES + imageName;
			File imageLocalImagesFolder = new File(servletContext.getRealPath("/images/"));
			if(!imageLocalImagesFolder.exists()) {
				imageLocalImagesFolder.mkdir();
			}
			Files.copy(imageInputStream, new File(imageFilePathFolder).toPath());
			kitten.setImage(imageServerPath);
			kittenRepository.save(kitten);
			imageInputStream.close();
			imagePart.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<Kitten> selectAll(){
		return kittenRepository.selectAll();
	}
}
