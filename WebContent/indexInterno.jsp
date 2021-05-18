<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway:400,700" rel="stylesheet"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="CSS/estiloIndex.css">
 
</head>
<body>
<div class="panel panel-default">
  <div class="panel-body">
  
<h1>Bienvenido <%=request.getSession().getAttribute("nombre") %> <span class="add-on"><i class="fa fa-user-circle" aria-hidden="true"></i></span></h1>  </div>

<a class="btn btn-outline-primary" href="/Telefonos/CerrarSesionServlet" role="button">Cerrar Sesion</a>
</div>

<ul>
 
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

