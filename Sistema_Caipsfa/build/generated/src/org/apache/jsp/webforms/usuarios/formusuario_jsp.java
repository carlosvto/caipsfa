package org.apache.jsp.webforms.usuarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/top-tags.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_styleClass_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_styleClass_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleClass_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_labelProperty_collection_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_select_styleClass_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_styleClass_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_styleClass_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleClass_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_select_styleClass_property.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_html_password_styleClass_property_name_nobody.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_button_styleClass_property_onclick.release();
    _jspx_tagPool_html_form_styleClass_method_action.release();
    _jspx_tagPool_html_text_styleClass_property_name_nobody.release();
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<style media=\"all\" type=\"text/css\">\r\n");
      out.write("@import url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/screen.css\");\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("            function nuevo(){\r\n");
      out.write("                document.UsuariosForm.method.value=\"Agregar\";\r\n");
      out.write("                document.UsuariosForm.submit;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("            <section class=\"wrapper\">\r\n");
      out.write("          \t<h3><i class=\"fa fa-angle-right\"></i> Usuarios</h3>\r\n");
      out.write("          \t<div class=\"row mt\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <div class=\"form-panel\">\r\n");
      out.write("                            <h4 class=\"mb\"><i class=\"fa fa-angle-right\"></i> Datos del usuario</h4>\r\n");
      out.write("                            ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- col-lg-12-->      \t\r\n");
      out.write("          \t</div><!-- /row -->\r\n");
      out.write("            </section>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleClass_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/mantousuarios");
    _jspx_th_html_form_0.setStyleClass("form-horizontal style-form");
    _jspx_th_html_form_0.setMethod("post");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label class=\"col-sm-2 col-sm-2 control-label\">Código del usuario</label>\r\n");
        out.write("                                    <div class=\"col-sm-10\">\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    <span class=\"help-block\">El codigo debe constar de 8 números.</span>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label class=\"col-sm-2 col-sm-2 control-label\">Nombre  de Usuario</label>\r\n");
        out.write("                                    <div class=\"col-sm-10\">\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label class=\"col-sm-2 col-sm-2 control-label\">Contraseña</label>\r\n");
        out.write("                                    <div class=\"col-sm-10\">\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"form-group\">\r\n");
        out.write("                                    <label class=\"col-sm-2 col-sm-2 control-label\">Tipo de Usuario</label>\r\n");
        out.write("                                    <div class=\"col-sm-10\">\r\n");
        out.write("                                        ");
        if (_jspx_meth_html_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div style=\"float:right;\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_html_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_html_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleClass_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_styleClass_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("idUsuario");
    _jspx_th_html_text_0.setName("idUsuario");
    _jspx_th_html_text_0.setStyleClass("form-control");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_name_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("nombreUsuario");
    _jspx_th_html_text_1.setName("nombreUsuario");
    _jspx_th_html_text_1.setStyleClass("form-control");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_styleClass_property_name_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_styleClass_property_name_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_styleClass_property_name_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setProperty("password");
    _jspx_th_html_password_0.setName("passwotd");
    _jspx_th_html_password_0.setStyleClass("form-control");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_styleClass_property_name_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_styleClass_property_name_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("tipoUsuarios");
    _jspx_th_html_select_0.setStyleClass("form-control");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_html_options_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_styleClass_property.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_styleClass_property.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_options_0.setCollection("TipoUsuarios");
    _jspx_th_html_options_0.setProperty("idTipo");
    _jspx_th_html_options_0.setLabelProperty("descripcion");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_0);
      return true;
    }
    _jspx_tagPool_html_options_property_labelProperty_collection_nobody.reuse(_jspx_th_html_options_0);
    return false;
  }

  private boolean _jspx_meth_html_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_0 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_styleClass_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_0.setPageContext(_jspx_page_context);
    _jspx_th_html_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_0.setProperty("Ingresar");
    _jspx_th_html_button_0.setStyleClass("btn btn-theme");
    _jspx_th_html_button_0.setOnclick("nuevo()");
    int _jspx_eval_html_button_0 = _jspx_th_html_button_0.doStartTag();
    if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_button_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_button_0.doInitBody();
      }
      do {
        out.write("Agregar Usuario");
        int evalDoAfterBody = _jspx_th_html_button_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_button_styleClass_property_onclick.reuse(_jspx_th_html_button_0);
      return true;
    }
    _jspx_tagPool_html_button_styleClass_property_onclick.reuse(_jspx_th_html_button_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setProperty("method");
    _jspx_th_html_hidden_0.setValue("");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
      return true;
    }
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }
}
