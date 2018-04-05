<!DOCTYPE HTML>
<!--
	Typify by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>GoLang</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  		<script src="assets/js/isEmpty.js"></script>
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
	</head>
	<body>

		<!-- Banner -->
			<section id="banner">
				<h2><strong>Go Platform Application</strong></h2>
				<p>Utilice nuestro servicio de manera gratuita.</p>
			</section>

		<!-- One -->
			<section id="one" class="wrapper special">
				<div class="inner">
					<header class="major">
						<h2>Elija la opcion que desee.</h2>
					</header>
					<div class="features">
						<div class="feature">
							<i class="fa fa-plus"></i>
							<h3>Crear proyecto nuevo.</h3>
							<p>Con esta opcion nosotros lo guiaremos a crear su aplicacion.</p>
 							<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">RULISFIRE</button>
						</div>
						<div class="feature">
							<i class="fa fa-folder-open"></i>
							<h3>Seleccionar proyecto.</h3>
							<p>Con esta opcion seleccionaremos un proyecto ya creado por usted..</p>
							<a href="#" class="button">Boton</a>
						</div>
					</div>
				</div>
			</section>


		<!-- Modal -->

		<div class="modal fade" id="myModal" role="dialog">
    		<div class="modal-dialog">
    
      		<!-- Modal content-->
      			<div class="modal-content">
        			<div class="modal-header">
          				<h4 class="modal-title">Titulo del proyecto.</h4>
        			</div>
        			<div class="modal-body">
        				<form id="myForm" action="/login" method="post">
        					<input type="text" name="appName" placeholder="Ingrese el nombre del proyecto..." id="texto">
        					<input type="submit" value="Login">
        				</form>
        			</div>
        			<div class="modal-footer">
          				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          				<button type="button" class="btn btn-default" id="aceptar" onclick="return isEmpty();">Aceptar</button>
        			</div>
      			</div>
      
    			</div>
  			</div>


		<!-- Footer -->
			<footer id="footer">
				<div class="copyright">
					&copy; Untitled. Design: <a href="http://templated.co/">TEMPLATED</a>.
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>