package com.PawMajesty.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/app/kittenlist")
public class KittenListServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/kittenlist.jsp").forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
