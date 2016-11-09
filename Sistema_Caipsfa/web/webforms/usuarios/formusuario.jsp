<%@ include file="/top-tags.jsp"%>
        <script type="text/javascript" language="JavaScript">
            function nuevo(){
                document.UsuariosForm.method.value="Agregar";
                document.UsuariosForm.submit();
            }
            function editar(){
                document.UsuariosForm.method.value="Editar";
                document.UsuariosForm.submit();
            }
        </script>
            <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> Usuarios</h3>
          	<div class="row mt">
                    <div class="col-lg-12">
                        <div class="form-panel">
                            <h4 class="mb"><i class="fa fa-angle-right"></i> Datos del usuario</h4>
                            <html:form action="/mantousuarios" styleClass="form-horizontal style-form" method="post">
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Código del usuario</label>
                                    <div class="col-sm-10">
                                        <logic:present name="editar">
                                            <html:text property="idUsuario" styleClass="form-control" readonly="true"/>
                                        </logic:present>
                                        <logic:notPresent name="editar">
                                            <html:text property="idUsuario" styleClass="form-control"/>
                                        </logic:notPresent>
                                    <span class="help-block">El codigo debe constar de 8 números.</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Nombre  de Usuario</label>
                                    <div class="col-sm-10">
                                        <html:text property="nombreUsuario" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Contraseña</label>
                                    <div class="col-sm-10">
                                        <html:password property="password" styleClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Tipo de Usuario</label>
                                    <div class="col-sm-10">
                                        <html:select property="idTipo" styleClass="form-control tipoUsuario">
                                            <html:options collection="tipoUsuarios" property="idTipo" labelProperty="descripcion"/>
                                        </html:select>
                                    </div>
                                </div>
                                <div style="float:right;">
                                    <logic:notPresent name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="nuevo()">Agregar Usuario</html:button>
                                    </logic:notPresent>
                                    <logic:present name="editar">
                                        <html:button property="Ingresar" styleClass="btn btn-theme" onclick="editar()">Modificar Usuario</html:button>
                                    </logic:present>
                                    <html:hidden property="method" value=""/>
                                </div>
                            </html:form>
                        </div>
                    </div><!-- col-lg-12-->      	
          	</div><!-- /row -->
            </section>
        <script>
            <logic:present name="idTipo">
                $(".tipoUsuario").val(<%=request.getAttribute("idTipo")%>);
            </logic:present>
        </script>