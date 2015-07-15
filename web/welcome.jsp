<%@ page import="sw1.model.AccesoEntity" %>
<%@ page import="sw1.connector.DataBaseController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html class="no-js" lang="en">
<head>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Bienvenido</title>
  <link rel="stylesheet" href="css/foundation.css"/>
  <link rel="stylesheet" href="css/main.css">
  <script src="js/vendor/modernizr.js"></script>
</head>
<body>
<div class="contain-to-grid contenedor-superior">
  <nav class="top-bar barra-superior" data-topbar role="navigation">
    <div class="small-6 medium-9 large-10 column" style="margin-top: 1em!important;">ACCESOSPRIMA</div>
    <img class="small-6 medium-3 large-2 column" src="img/prima.jpg" align="right">
  </nav>

</div>
<br>

<div class="row">
  <div class="column small-12 large-8 large-offset-2">
    <h2 class="textito">Bienvenido S47116</h2>
  </div>
</div>

<div class="row">
  <form action="autorizadores.html" method="get">
    <div class="column small-12 large-8 large-offset-2">
      <br>

      <div class="row">
        <div class="large-12 columns">
          <label class="textito">Acceso:
            <select class="textito" id="seleccion" name="seleccion">
              <option value="none" disabled selected>Seleccione una Opcion</option>

              <option value="Internet" name="internet">Internet</option>
              <%
                for (AccesoEntity c: DataBaseController.getInstance().getAllAccesos()){
                  System.out.println(c);
                }
              %>

            </select>
          </label>
        </div>

      </div>
      <br>



      <div class="row">
        <div class="large-6 columns textito">
          Comentarios Adicionales:
        </div>
        <div class="large-6 columns">
          <input id="nombAcceso" type="text" name="nombAcceso" class="textito">
        </div>
      </div>
      <br>

      <div class="row">
        <div class="small-4 large-centered columns">
          <input type="submit" value="Enviar" class="postfix botones" onclick="guardar()">
        </div>
      </div>
    </div>
  </form>
</div>

<script src="js/vendor/jquery.js"></script>
<script src="js/foundation.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>