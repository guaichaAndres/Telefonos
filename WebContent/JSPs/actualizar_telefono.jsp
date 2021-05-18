<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GestiÃ³n de personas en la Web</title>
</head>
<body>
	<h1>Actualizar TelÃ©fono</h1>
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