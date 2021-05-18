<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuario Encontrado</title>
</head>
<body>







<c:set var="u" scope="request" value="${usuario}" />
	<h1>Usuario encontrado</h1>		
	<p >Cedula: ${u.cedula}</p>
	<p >Nombre: ${u.nombre}</p>
	<p >Apellido: ${u.apellido}</p>
	<label for="correo">Contacte a este usuario por su correo: </label>
	<a class="d-block" href="mailto:contact@yourwebsite.com">${u.correo}</a>
	
	<c:set var="lista" scope="request" value="${telefonos}" />

	<table>
		<tr>
			<td><strong>Codigo</strong></td>
			<td><strong>Numero</strong></td>
			<td><strong>Tipo</strong></td>
			<td><strong>Operadora</strong></td>
			
		</tr>
		<c:forEach var="t" items="${lista}">
			<tr>
				<td>${t.codigo}</td>
			<td><a href="tel:+${t.numero}">${t.numero}</a></td>
				<td>${t.tipo}</td>
				<td>${t.operadora}</td>
				
			</tr>
		</c:forEach>
	</table>
	<a href="/Telefonos/JSPs/indexInterno.jsp">Regresar al index</a>

</body>
</html>

