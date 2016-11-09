<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="units.do?method=redirectUnits" style="float: right"><i class="fa fa-plus"></i></a>
    <h3><i class="fa fa-angle-right"></i> Unidades</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                          <display:table requestURIcontext="false" name="listunidades" pagesize="5" requestURI="formunidades.do?method=getUnidades" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.UnidadesDecorator">
                                    <display:column property="codigoUnidad" title="Codigo Unidad"/>
                                    <display:column property="nombre" title="Nombre"/>
                                    <display:column property="prefijo" title="Prefijo"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>
<div id="dialog-confirm" title="Eliminación de Unidad">
	<p class="enunciado"><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;"></span>Estás seguro que deseas eliminar la Unidad:</p>
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
    var codigoUnidad;
    var nombre;
    jQuery(function($){
        $( "#dialog-confirm" ).dialog({
	autoOpen: false,
	width: 400,
	buttons: [
		{
			text: "Borrar",
			click: function() {
                                $.ajax({
                                    url: 'mantounidades.do?method=Eliminar',
                                    type: 'POST',
                                    data: {codigoUnidad: codigoUnidad},
                                    success: function(){
                                        alert("Unidad Eliminada con éxito");
                                        document.location = "formunidades.do?method=getUnidades";
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
    codigoUnidad = $(this).attr("codigoUnidad");
    nombre = $(this).attr("nombre");
    $(".enunciado").append(" "+ nombre + "?");
    $("#dialog-confirm").dialog("open");
    event.preventDefault();
});

    });
</script>

