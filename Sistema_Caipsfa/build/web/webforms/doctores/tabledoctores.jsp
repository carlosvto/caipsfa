<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <html:link href="doctor.do?method=redirectDoctor" styleClass="btn btn-success" style="float: right"><i class="fa fa-plus"></i></html:link>
    <h3><i class="fa fa-angle-right"></i> Doctores</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                            <display:table name="listdoctores" pagesize="5" requestURI="formdoctores.do?method=getDoctors" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.DoctoresDecorator">
                                    <display:column property="codigoDoctor" title="Codigo del Doctor"/>
                                    <display:column property="nombres" title="Nombre"/>
                                    <display:column property="apellidos" title="Apelido"/>
                                    <display:column property="especialidad" title="Especialidad"/>
                                    <display:column property="dui" title="Dui"/>
                                    <display:column property="nit" title="NIT"/>
                                    <display:column property="telefono" title="Tel�fono"/>
                                    <display:column property="email" title="Correo Electr�nico"/>
                                    <display:column property="dependencia" title="Dependencia"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>
<div id="dialog-confirm" title="Eliminaci�n de usuario">
	<p class="enunciado"><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span>Est�s seguro que deseas eliminar al Dr./Dra.</p>
</div>
<script src="assets/js/jquery-ui/external/jquery/jquery.js"></script>
<script src="assets/js/jquery-ui/jquery-ui.js"></script>
<link href="assets/js/jquery-ui/jquery-ui.css" rel="stylesheet">
	<style>
	body{
		font-family: "Trebuchet MS", sans-serif;
		margin: 50px;
	}
	.demoHeaders {
		margin-top: 2em;
	}
	#dialog-link {
		padding: .4em 1em .4em 20px;
		text-decoration: none;
		position: relative;
	}
	#dialog-link span.ui-icon {
		margin: 0 5px 0 0;
		position: absolute;
		left: .2em;
		top: 50%;
		margin-top: -8px;
	}
	#icons {
		margin: 0;
		padding: 0;
	}
	#icons li {
		margin: 2px;
		position: relative;
		padding: 4px 0;
		cursor: pointer;
		float: left;
		list-style: none;
	}
	#icons span.ui-icon {
		float: left;
		margin: 0 4px;
	}
	.fakewindowcontain .ui-widget-overlay {
		position: absolute;
	}
	select {
		width: 200px;
	}
	</style>
<script>
    var codigoDoctor;
    var apellidos;
    jQuery(function($){
        $( "#dialog-confirm" ).dialog({
	autoOpen: false,
	width: 400,
	buttons: [
		{
			text: "Borrar",
			click: function() {
                                $.ajax({
                                    url: 'mantodoctores.do?method=Eliminar',
                                    type: 'POST',
                                    data: {codigoDoctor: codigoDoctor},
                                    success: function(){
                                        alert("Doctor Eliminado con �xito");
                                        document.location = "formdoctores.do?method=getDoctors";
                                    }
                                });
                                $( this ).dialog( "close" );                                
			}
		},
		{
			text: "Cancelar",
			click: function() {
				$( this ).dialog( "close" );
			}
		}
	]
});

// Link to open the dialog

$(".delete").click(function(event){
    codigoDoctor = $(this).attr("codigoDoctor");
    apellidos = $(this).attr("apellidos");
    $(".enunciado").append(" "+ apellidos + "?");
    $("#dialog-confirm").dialog("open");
    event.preventDefault();
});

    });
</script>