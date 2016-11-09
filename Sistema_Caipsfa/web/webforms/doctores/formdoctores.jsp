<%@ include file="/top-tags.jsp"%>
        <script type="text/javascript" language="JavaScript">
            function nuevo(){
                document.DoctoresForm.method.value="Agregar";
                document.DoctoresForm.submit();
            }
            function editar(){
                document.DoctoresForm.method.value="Editar";
                document.DoctoresForm.submit();
            }
        </script>
            <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> Doctores</h3>
          	<div class="row mt">
                    <div class="col-lg-12">
                        <div class="form-panel">
                            <h4 class="mb"><i class="fa fa-angle-right"></i> Datos del doctor</h4>
                            <html:form action="/mantodoctores" styleClass="form-horizontal style-form" method="post">
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Codigo Doctor</label>
                                    <div class="col-sm-10">
                                        <logic:present name="editar">
                                            <html:text property="codigoDoctor" styleClass="form-control" readonly="true"/>
                                        </logic:present>
                                        <logic:notPresent name="editar">
                                            <html:text property="codigoDoctor" styleClass="form-control"/>
                                        </logic:notPresent>
                                    <span class="help-block">El codigo debe constar de 8 números.</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Nombres Doctor</label>
                                    <div class="col-sm-10">
                                        <html:text property="nombres" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Apellidos Doctor</label>
                                    <div class="col-sm-10">
                                        <html:text property="apellidos" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Especialidad del Doctor</label>
                                    <div class="col-sm-10">
                                        <html:text property="especialidad" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">DUI</label>
                                    <div class="col-sm-10">
                                        <html:text property="dui" styleClass="form-control"/>
                                        <span class="help-block">El DUI debe estar en este formato 12345678-9.</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">NIT</label>
                                    <div class="col-sm-10">
                                        <html:text property="nit" styleClass="form-control"/>
                                        <span class="help-block">El NIT debe estar en este formato: 0123-012345-678-9</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Tel&eacute;fono</label>
                                    <div class="col-sm-10">
                                        <html:text property="telefono" styleClass="form-control"/>
                                        <span class="help-block">El tel&eacute;fono debe estar en este formato: 1234-5678</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">E-mail</label>
                                    <div class="col-sm-10">
                                        <html:text property="email" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Dependencia</label>
                                    <div class="col-sm-10">
                                        <html:text property="dependencia" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div style="float:right;">
                                    <logic:notPresent name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="nuevo()">Agregar Doctor</html:button>
                                    </logic:notPresent>
                                    <logic:present name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="editar()">Modificar Doctor</html:button>
                                    </logic:present>
                                    <html:hidden property="method" value=""/>
                                </div>
                            </html:form>
                        </div>
                    </div><!-- col-lg-12-->      	
          	</div><!-- /row -->
            </section>