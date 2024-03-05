<%@page import="com.PawMajesty.entity.Kitten"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kitten List</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>Look at the most rich and famous kittens!</h1>
	<%
		List<Kitten> kittens = (List<Kitten>)request.getAttribute("kittens");
		for(Kitten kitten : kittens){
			%>
			<h2><%= kitten.getName() %></h2><br>
			<img src="<%= kitten.getImage() %>" height="200" width="230" />
			<h3>Wealth: $<%= kitten.getWealth() %></h3><br>
			<p><%= kitten.getStory() %></p><br>
			<%
		}
	%>
</body>
</html>