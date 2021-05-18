<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GestiÃ³n de personas en la Web</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway:400,700" rel="stylesheet"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="../CSS/estiloIndex.css">
</head>
<body>
<div id="login" class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="login well well-small">
                        <div class="center">
	<h1>Actualizar Teléfono</h1>
                        </div>	
	<form action="/Telefonos/ActualizarTelefonoController" method="post">
	<label for="codigo"> Ingresar código: </label>
		<input type="text" name="codigo" placeholer="ingrese el numero..."/>
		<br/>
		<label for="numero"> Actualizar número: </label>
		<input type="text" name="numero" placeholer="ingrese el numero..."/>
		<br/>
		<label for="tipo"> Actualizar tipo: </label>
		<input type="text" name="tipo" placeholer="ingrese el tipo..."/>
		<br/>
		<label for="operadora"> Actualizar operadora: </label>
		<input type="text" name="operadora" placeholer="ingrese la operadora..."/>
		<br/>
		<input type="submit" value="Aceptar"/>
		<input type="reset" value="Cancelar"/>
	
		
	</form>
	
</body>
</html>