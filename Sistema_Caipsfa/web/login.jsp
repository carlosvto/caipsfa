<%-- 
    Document   : login
    Created on : 10-19-2016, 12:58:35 PM
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

        <title>Dashboard CAIPSFA</title>

        <!-- Bootstrap core CSS -->
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/style-responsive.css" rel="stylesheet">

        <script type="text/javascript">
            function nuevo(){
                    document.LoginForm.method.value="ingresar";
                    document.LoginForm.submit();
            }
    </script>
    </head>
    <body>
        <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
                    <html:form styleClass="form-login" action="/Login" method="post">
                        <h2 class="form-login-heading">Ingrese sus datos</h2>
		        <div class="login-wrap">
                            <div class="form-group">
                                <label class="control-label">Usuario</label>
                                <html:text styleClass="form-control" title="Usuario" property="nombre_usuario"/>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Contraseña</label>
                                <html:password styleClass="form-control" title="Contraseña" property="password"/>
                            </div>
                            <html:button onclick="nuevo()" property="login" styleClass="btn btn-theme btn-block">
                                Ingresar 
                            </html:button>
                            <html:hidden property="method" value=""/>
		            <hr>
		
		        </div>
		
		          <!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Forgot Password ?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Enter your e-mail address below to reset your password.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                          
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
                    </html:form>
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("assets/img/login-bg.jpg", {speed: 500});
    </script>
    </body>
</html>
