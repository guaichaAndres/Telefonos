<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido</title>
  <link rel="stylesheet" href="../CSS/estiloIndex.css">
</head>
<body>
	<a href="/Telefonos/index.html">Regresar al Inicio</a>
	<h1>Bienvenido <%=request.getSession().getAttribute("nombre") %></h1>
	<a href="/Telefonos/CerrarSesionServlet">Cerrar Sesion</a>
	<a href="/Telefonos/HTMLs/registrar_telefono.html">Registrar Tel�fonos</a>
	<a href="/Telefonos/HTMLs/buscar_telefono.html">Buscar Tel�fono</a>
	<a href="/Telefonos/ListarTelefonoController">Listar Tel�fonos</a>
	
</body>
</html>

