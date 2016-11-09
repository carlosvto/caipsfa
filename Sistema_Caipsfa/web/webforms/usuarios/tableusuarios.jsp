<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="formusers.do?method=addUsers" style="float: right"><i class="fa fa-plus"></i></a>
    <h3><i class="fa fa-angle-right"></i> Usuarios</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                            <display:table name="listusuarios" pagesize="5" requestURI="formusuarios.do?method=getUsers" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.UsuariosDecorator">
                                    <display:column property="idUsuario" title="Id de Usario" media="none"/>
                                    <display:column property="nombreUsuario" title="Nombre"/>
                                    <display:column property="tipoUsuarios.descripcion" title="Tipo de usuario"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>
<div id="dialog-confirm" title="Eliminación de usuario">
	<p class="enunciado"><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span>Estás seguro que deseas eliminar el usuario</p>
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
    var idUsuario;
    var nombreUsuario;
    jQuery(function($){
        $( "#dialog-confirm" ).dialog({
	autoOpen: false,
	width: 400,
	buttons: [
		{
			text: "Borrar",
			click: function() {
                                $.ajax({
                                    url: 'mantousuarios.do?method=Eliminar',
                                    type: 'POST',
                                    data: {idUsuario: idUsuario},
                                    success: function(){
                                        alert("Usuario Eliminado con éxito");
                                        document.location = "formusuarios.do?method=getUsers";
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
    idUsuario = $(this).attr("idUsuario");
    nombreUsuario = $(this).attr("nombreUsuario");
    $(".enunciado").append(" "+ nombreUsuario + "?");
    $("#dialog-confirm").dialog("open");
    event.preventDefault();
});

    });
</script>
