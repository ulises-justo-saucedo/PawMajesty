<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1>Upload your own kitten!</h1>
	<p>Save relevant information about it and how it got it's wealth!</p>
	<form action="uploadkitten" method="POST" enctype="multipart/form-data">
		<label>Name: </label><input type="text" name="kitten_name" /><br>
		<label>Image (How the kitten looks like?): </label><input type="file" name="image" /><br>
		<label>Wealth (How much money it has?): </label><input type="number" name="wealth" /><br>
		<label>Story (Tell us how it got it's money!): <textarea name="story"></textarea></label><br>
		<input type="submit" />
	</form>
</body>
</html>