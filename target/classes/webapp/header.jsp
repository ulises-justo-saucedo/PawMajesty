<%@page import="com.PawMajesty.urls.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<ul>
	<li><a href="<%= URL.ROOT %>">Home page!</a></li>
	<li><a href="<%= URL.KITTEN_LIST %>">See most famous kittens!</a></li>
	<li><a href="<%= URL.UPLOAD_KITTEN %>">Upload your kitten!</a></li>
</ul>