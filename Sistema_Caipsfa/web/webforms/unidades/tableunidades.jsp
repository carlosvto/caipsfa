<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="#" style="float: right"><i class="fa fa-plus"></i></a>
    <h3><i class="fa fa-angle-right"></i> Unidades</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                            <display:table name="listunidades" pagesize="5" requestURI="formunidades.do?method=getUnidades" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.UnidadesDecorator">
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
