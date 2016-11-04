<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="#" style="float: right"><i class="fa fa-plus"></i></a>
    <h3><i class="fa fa-angle-right"></i> Proveedores</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                            <display:table name="listproveedores" pagesize="5" requestURI="formproveedores.do?method=getProvs" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.ProveedoresDecorator">
                                    <display:column property="codigoProveedor" title="Codigo Proveedor"/>
                                    <display:column property="nombreProveedor" title="Nombre Proveedor"/>
                                    <display:column property="direccion" title="Dirección"/>
                                    <display:column property="contacto" title="Contacto"/>
                                    <display:column property="numeroTelefono" title="Teléfono"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>
