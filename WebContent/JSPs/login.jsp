<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda Telefónica</title>
  <link rel="stylesheet" href="../CSS/estiloIndex.css">

</head>
<body>
<h1>Agenda Telefónica UPS</h1>

	<div class="login-page">
  <div class="form">
    <form class="login-form" action="/Telefonos/LoginServlet"	method="post">
      <input type="text" name="usuario" placeholder="Usuario"/>
      <input type="password" name="password" placeholder="Contrasena"/>
      <button> Log In</button> 
        <p class="message">¿No registrado? <a href="../HTMLs/registrar_usuario.html">Registrarse</a></p>
    </form>
  </div>
</div>
</body>
</html>