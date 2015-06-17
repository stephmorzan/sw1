<%--
  Created by IntelliJ IDEA.
  User: smorzán
  Date: 16/06/2015
  Time: 05:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Autorizadores</title>
    <link rel="stylesheet" href="css/foundation.css"/>
    <script src="js/vendor/modernizr.js"></script>
</head>
<body>

<div class="contain-to-grid contenedor-superior">
    <nav class="top-bar barra-superior" data-topbar role="navigation">
        PRIMAACCESS
    </nav>
</div>

<div class="row">
    <form action="accessAuth" method="post">
        <div class="column small-12 large-8 large-offset-2">
            <br>
            <div class="row">
                <div class="large-12 columns">
                    <label>Acceso:
                        <select>
                            <option value="none" disabled selected>Seleccione una Opcion</option>
                            <option value="Internet">Internet</option>
                            <option value="Buzon">Buzón</option>
                            <option value="Compartida">Carpeta Compartida</option>
                            <option value="USB">USB</option>
                            <option value="Directory">Active Directory</option>
                        </select>
                    </label>
                </div>

                <div class="large-4 columns">
                </div>
                <div class="large-4 columns large-offset-4">
                    <input type="submit" value="Enviar" class="postfix">
                </div>
                <div class="large-4 columns">
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
