<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="#" style="float: right"><i class="fa fa-plus"></i></a>
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
                                    <display:column property="telefono" title="Teléfono"/>
                                    <display:column property="email" title="Correo Electrónico"/>
                                    <display:column property="dependencia" title="Dependencia"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>
