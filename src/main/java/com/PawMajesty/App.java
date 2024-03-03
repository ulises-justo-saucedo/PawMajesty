package com.PawMajesty;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/app")
public class App extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.getWriter().println("Hello, PawMajesty!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
