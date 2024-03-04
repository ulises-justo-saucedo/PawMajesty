package com.PawMajesty.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/app/uploadkitten")
public class UploadServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/upload.jsp").forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Formulario recibido!");
		req.getParameter("kitten_name");
		req.getParameter("wealth");
		req.getParameter("story");
		try {
			res.sendRedirect("kittenlist");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
