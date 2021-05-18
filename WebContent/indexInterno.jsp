<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido</title>
  <link rel="stylesheet" href="CSS/estiloIndex.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  
</head>
<body>
<ul>
 
	<li><h1>Bienvenido <%=request.getSession().getAttribute("nombre") %></h1>
	<li><a class="btn btn-primary"href="/Telefonos/CerrarSesionServlet" role="button">Cerrar Sesion</a></li>
	<li><a class="btn btn-primary"href="/Telefonos/HTMLs/registrar_telefono.html" role="button">Registrar Teléfonos</a></li>
	<li><a class="btn btn-primary" href="/Telefonos/HTMLs/buscar_telefono.html"role="button">Buscar Teléfono</a></li>
	<li><a class="btn btn-primary" href="/Telefonos/ListarTelefonoController" role="button">Listar Teléfonos</a></li>
	<li><a class="btn btn-primary" href="/Telefonos/HTMLs/buscar_usuario.html" role="button">Buscar Usuarios</a></li>
	<li><a class="btn btn-primary" href="/Telefonos/HTMLs/eliminar_telefono.html" role="button">Eliminar número registrado</a></li>
	
</ul> 
<H2>Bienvenido a la página central de su cuenta.</H2>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>

