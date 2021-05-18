<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>Login Agenda</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway:400,700" rel="stylesheet"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" type="text/css" href="../CSS/estiloIndex.css">
         <script type="text/javascript" src="/Telefonos/js/validaciones.js"></script>
    </head>
    <body>
        <div id="login" class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="login well well-small">
                        <div class="center">
                            <h1>Bienvenido</h1>                         
                        </div>
                        
        <form action="/Telefonos/LoginServlet" style="" class="login-form" id="UserLoginForm" method="post" accept-charset="utf-8">
          <div class="control-group">
            <div class="input-prepend">
                <hr>
              <h4>Login</h4>  
              <span class="add-on"><i class="fa fa-user-circle" aria-hidden="true"></i></span>
              <input name="usuario" required="required" placeholder="Username" maxlength="255" type="text" id="UserUsername"> 
            </div>
          </div>
          <div class="control-group">
            <div class="input-prepend">
              <span class="add-on"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
              <input name="password" required="required" placeholder="Password" type="password" id="UserPassword"> 
            </div>
          </div>
          <div class="control-group">
              <button class="btn btn-primary btn-large btn-block" type="submit" value="Sign in">Aceptar</button> 
          </div>
        </form>
      </div><!--/.login-->
    </div><!--/.span12-->
  </div><!--/.row-fluid-->
</div><!--/.container-->
</body>
</html>