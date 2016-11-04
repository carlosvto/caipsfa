<%@ include file="/top-tags.jsp"%>
<section class="wrapper">
    <br>
    <a class="btn btn-success" href="#" style="float: right"><i class="fa fa-plus"></i></a>
    <h3><i class="fa fa-angle-right"></i> Art&iacute;culos</h3>    
                  <div class="col-md-12">
                      <div class="content-panel">
                            <display:table name="listproductos" pagesize="5" requestURI="formarticulos.do?method=getArtic" class="table table-striped table-advance table-hover" decorator="caipsfa.app.decorator.ProductosDecorator">
                                    <display:column property="codigoProducto" title="Codigo Producto"/>
                                    <display:column property="proveedores.nombreProveedor" title="Nombre Proveedor"/>
                                    <display:column property="nombre" title="Nombre"/>
                                    <display:column property="descripcion" title="Descripción"/>
                                    <display:column property="unidades.prefijo" title="Unidades"/>
                                    <display:column property="existencia" title="Existencia"/>                                    
                                    <display:column property="fechaVencimiento" title="Fecha de Vencimiento"/>
                                    <display:column property="actualizar" title="Actualizar"/>
                                    <display:column property="eliminar" title="Eliminar"/>
                            </display:table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
            </div><!-- /row -->
</section>
