        <%@ include file="/top-tags.jsp"%>
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">

                        <p class="centered"><a href="#"><img src="assets/img/logo.png" class="img-circle" width="60"></a></p>
                        <h5 class="centered">Caipsfa</h5>

                        <li class="mt">
                            <html:link styleClass="active" forward="inicioEnf">
                                <i class="fa fa-home"></i>
                                <span>Inicio</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formusuarios.do?method=getUsers">
                                <i class="fa fa-users"></i>
                                <span>Usuarios</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formdoctores.do?method=getDoctors">
                                <i class="fa fa-hospital-o"></i>
                                <span>Doctores</span>
                            </html:link>                            
                        </li>
                        <li class="mt">
                            <html:link href="formdiagnosticos.do?method=getDiag">
                                <i class="fa fa-history"></i>
                                <span>Diagnosticos</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formarticulos.do?method=getArtic">
                                <i class="fa fa-tasks"></i>
                                <span>Art&iacute;culos</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formproveedores.do?method=getProvs">
                                <i class="fa fa-desktop"></i>
                                <span>Proveedores</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formunidades.do?method=getUnidades">
                                <i class="fa fa-wrench"></i>
                                <span>Unidades</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formentradas.do?method=getEntries">
                                <i class="fa fa-upload"></i>
                                <span>Entradas</span>
                            </html:link>
                        </li>
                        <li class="mt">
                            <html:link href="formsalidas.do?method=getOuts">
                                <i class="fa fa-download"></i>
                                <span>Salidas</span>
                            </html:link>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;" >
                                <i class=" fa fa-bar-chart-o"></i>
                                <span>Reportes</span>
                            </a>
                            <ul class="sub">
                                <li><html:link href="#">Fechas</html:link></li>
                                <li><html:link href="#">Prodcutos</html:link></li>
                            </ul>
                        </li>

                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>