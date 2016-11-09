<%@ include file="/top-tags.jsp"%>
        <script type="text/javascript" language="JavaScript">
            function nuevo(){
                document.UnidadesForm.method.value="Agregar";
                document.UnidadesForm.submit();
            }
            function editar(){
                document.UnidadesForm.method.value="Editar";
                document.UnidadesForm.submit();
            }
        </script>
            <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> Unidades</h3>
          	<div class="row mt">
                    <div class="col-lg-12">
                        <div class="form-panel">
                            <h4 class="mb"><i class="fa fa-angle-right"></i> Datos de la unidad</h4>
                            <html:form action="/mantounidades" styleClass="form-horizontal style-form" method="post">
                                <div class="form-group">
                                    <logic:present name="editar">
                                        <html:hidden property="codigoUnidad"/>
                                    </logic:present>
                                    <logic:notPresent name="editar">
                                        <html:hidden property="codigoUnidad" value="0"/>
                                    </logic:notPresent>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Nombre Unidad</label>
                                    <div class="col-sm-10">
                                        <html:text property="nombre" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Prefijo</label>
                                    <div class="col-sm-10">
                                        <html:text property="prefijo" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div style="float:right;">
                                    <logic:notPresent name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="nuevo()">Agregar Unidad</html:button>
                                    </logic:notPresent>
                                    <logic:present name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="editar()">Modificar Unidad</html:button>
                                    </logic:present>
                                    <html:hidden property="method" value=""/>
                                </div>
                            </html:form>
                        </div>
                    </div><!-- col-lg-12-->      	
          	</div><!-- /row -->
            </section>