package com.PawMajesty.servlets;

import java.io.IOException;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.PawMajesty.entity.Kitten;
import com.PawMajesty.service.KittenService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/app/uploadkitten")
public class UploadServlet extends HttpServlet {
	private KittenService kittenService;

	@Override
	public void init() {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		kittenService = (KittenService) context.getBean("kittenService");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/upload.jsp").forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		kittenService.save(new Kitten(req.getParameter("kitten_name"), req.getParameter("wealth"), req.getParameter("story")));
		try {
			res.sendRedirect("kittenlist");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
