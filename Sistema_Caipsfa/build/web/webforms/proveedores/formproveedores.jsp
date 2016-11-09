<%@ include file="/top-tags.jsp"%>
        <script type="text/javascript" language="JavaScript">
            function nuevo(){
                document.ProveedoresForm.method.value="Agregar";
                document.ProveedoresForm.submit();
            }
            function editar(){
                document.ProveedoresForm.method.value="Editar";
                document.ProveedoresForm.submit();
            }
        </script>
            <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> Proveedores</h3>
          	<div class="row mt">
                    <div class="col-lg-12">
                        <div class="form-panel">
                            <h4 class="mb"><i class="fa fa-angle-right"></i> Datos del diagnostico</h4>
                            <html:form action="/mantoproveedores" styleClass="form-horizontal style-form" method="post">
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Codigo Proveedor</label>
                                    <div class="col-sm-10">
                                        <logic:present name="editar">
                                            <html:text property="codigoProveedor" styleClass="form-control" readonly="true"/>
                                        </logic:present>
                                        <logic:notPresent name="editar">
                                                <html:text property="codigoProveedor" styleClass="form-control"/>
                                        </logic:notPresent>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Nombre Proveedor</label>
                                    <div class="col-sm-10">
                                        <html:text property="nombreProveedor" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Direcci&oacute;n</label>
                                    <div class="col-sm-10">
                                        <html:textarea property="direccion" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Contacto</label>
                                    <div class="col-sm-10">
                                        <html:text property="contacto" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Tel&eacute;fono</label>
                                    <div class="col-sm-10">
                                        <html:text property="numeroTelefono" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div style="float:right;">
                                    <logic:notPresent name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="nuevo()">Agregar Proveedor</html:button>
                                    </logic:notPresent>
                                    <logic:present name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="editar()">Modificar Proveedor</html:button>
                                    </logic:present>
                                    <html:hidden property="method" value=""/>
                                </div>
                            </html:form>
                        </div>
                    </div><!-- col-lg-12-->      	
          	</div><!-- /row -->
            </section>