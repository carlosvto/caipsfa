<%@ include file="/top-tags.jsp"%>
        <script type="text/javascript" language="JavaScript">
            function nuevo(){
                document.DiagnosticoForm.method.value="Agregar";
                document.DiagnosticoForm.submit();
            }
            function editar(){
                document.DiagnosticoForm.method.value="Editar";
                document.DiagnosticoForm.submit();
            }
        </script>
            <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> Diagnosticos</h3>
          	<div class="row mt">
                    <div class="col-lg-12">
                        <div class="form-panel">
                            <h4 class="mb"><i class="fa fa-angle-right"></i> Datos del diagnostico</h4>
                            <html:form action="/mantodiagnostico" styleClass="form-horizontal style-form" method="post">
                                <div class="form-group">
                                    <logic:present name="editar">
                                        <html:hidden property="codigoDiagnostico"/>
                                    </logic:present>
                                    <logic:notPresent name="editar">
                                        <html:hidden property="codigoDiagnostico" value="0"/>
                                    </logic:notPresent>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Nombre Diagnostico</label>
                                    <div class="col-sm-10">
                                        <html:text property="nombre" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Descripci&oacute;n</label>
                                    <div class="col-sm-10">
                                        <html:textarea property="descripcion" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div style="float:right;">
                                    <logic:notPresent name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="nuevo()">Agregar Diagnostico</html:button>
                                    </logic:notPresent>
                                    <logic:present name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="editar()">Modificar Diagnostico</html:button>
                                    </logic:present>
                                    <html:hidden property="method" value=""/>
                                </div>
                            </html:form>
                        </div>
                    </div><!-- col-lg-12-->      	
          	</div><!-- /row -->
            </section>