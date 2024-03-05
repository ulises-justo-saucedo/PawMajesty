package com.PawMajesty.servlets;

import java.io.IOException;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.PawMajesty.service.KittenService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/app/kittenlist")
public class KittenListServlet extends HttpServlet {
	private KittenService kittenService;

	@Override
	public void init() {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		kittenService = (KittenService) context.getBean("kittenService");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("kittens", kittenService.selectAll());
		try {
			req.getRequestDispatcher("/kittenlist.jsp").forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
