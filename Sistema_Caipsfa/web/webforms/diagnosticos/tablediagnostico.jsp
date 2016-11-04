<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="#" style="float: right"><i class="fa fa-plus"></i></a>
    <h3><i class="fa fa-angle-right"></i> Diagnosticos</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                            <display:table name="listdiagnostico" pagesize="5" requestURI="formdiagnosticos.do?method=getDiag" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.DiagnosticoDecorator">
                                    <display:column property="codigoDiagnostico" title="Codigo Diagnostico"/>
                                    <display:column property="nombre" title="Nombre"/>
                                    <display:column property="descripcion" title="Descripcion"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>

