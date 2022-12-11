<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FoodMamba Menu</title>
</head>
<body>
<h1 align="center" color="red">FoodMamba Menu Chart :-</h1>
	<div display="flex" align="center">
	<table border="1px" width="40%" height="50%" >
		<tr>
			<th>Item Code</th>
			<th>Item Name</th>
			<th>Item Price</th>
		</tr>
		<c:forEach var="items" items="${foodItems}">
			<tr>
				<td>${items.id}</td>
				<td>${items.itemName}</td>
				<td>${items.itemPrice}</td>
			</tr>
		</c:forEach>
	</table>
	</div>








</body>
</html>