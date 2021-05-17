<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar Teléfono</title>
</head>
<body>
	<c:set var="t" scope="request" value="${telefono}" />
	<h1>Teléfono encontrado</h1>		
		
	<p>Id: ${t.codigo}</p>
	<p>Número: ${t.numero}</p>
	<p>Tipo: ${t.tipo}</p>
	<p>Operadora: ${t.operadora}</p>
	
	<a href="/Telefonos/JSPs/indexInterno.jsp">Regresar al index</a>
	
</body>
</html>
