package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_title_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_styleClass_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleClass_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_title_styleClass_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_password_title_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_styleClass_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleClass_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_title_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_password_title_styleClass_property_nobody.release();
    _jspx_tagPool_html_button_styleClass_property_onclick.release();
    _jspx_tagPool_html_form_styleClass_method_action.release();
    _jspx_tagPool_html_text_title_styleClass_property_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Dashboard\">\n");
      out.write("        <meta name=\"keyword\" content=\"Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\n");
      out.write("\n");
      out.write("        <title>Dashboard CAIPSFA</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!--external css-->\n");
      out.write("        <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function nuevo(){\n");
      out.write("                    document.LoginForm.method.value=\"ingresar\";\n");
      out.write("                    document.LoginForm.submit();\n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- **********************************************************************************************************************************************************\n");
      out.write("      MAIN CONTENT\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("\n");
      out.write("\t  <div id=\"login-page\">\n");
      out.write("\t  \t<div class=\"container\">\n");
      out.write("                    ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t  \t</div>\n");
      out.write("\t  </div>\n");
      out.write("\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--BACKSTRETCH-->\n");
      out.write("    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/jquery.backstretch.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $.backstretch(\"assets/img/login-bg.jpg\", {speed: 500});\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleClass_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setStyleClass("form-login");
    _jspx_th_html_form_0.setAction("/Login");
    _jspx_th_html_form_0.setMethod("post");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <h2 class=\"form-login-heading\">Ingrese sus datos</h2>\n");
        out.write("\t\t        <div class=\"login-wrap\">\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <label class=\"control-label\">Usuario</label>\n");
        out.write("                                ");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"form-group\">\n");
        out.write("                                <label class=\"control-label\">Contraseña</label>\n");
        out.write("                                ");
        if (_jspx_meth_html_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                            ");
        if (_jspx_meth_html_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_html_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t            <hr>\n");
        out.write("\t\t\n");
        out.write("\t\t        </div>\n");
        out.write("\t\t\n");
        out.write("\t\t          <!-- Modal -->\n");
        out.write("\t\t          <div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" tabindex=\"-1\" id=\"myModal\" class=\"modal fade\">\n");
        out.write("\t\t              <div class=\"modal-dialog\">\n");
        out.write("\t\t                  <div class=\"modal-content\">\n");
        out.write("\t\t                      <div class=\"modal-header\">\n");
        out.write("\t\t                          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
        out.write("\t\t                          <h4 class=\"modal-title\">Forgot Password ?</h4>\n");
        out.write("\t\t                      </div>\n");
        out.write("\t\t                      <div class=\"modal-body\">\n");
        out.write("\t\t                          <p>Enter your e-mail address below to reset your password.</p>\n");
        out.write("\t\t                          <input type=\"text\" name=\"email\" placeholder=\"Email\" autocomplete=\"off\" class=\"form-control placeholder-no-fix\">\n");
        out.write("\t\t\n");
        out.write("\t\t                      </div>\n");
        out.write("\t\t                      <div class=\"modal-footer\">\n");
        out.write("\t\t                          <button data-dismiss=\"modal\" class=\"btn btn-default\" type=\"button\">Cancel</button>\n");
        out.write("                                          \n");
        out.write("\t\t                      </div>\n");
        out.write("\t\t                  </div>\n");
        out.write("\t\t              </div>\n");
        out.write("\t\t          </div>\n");
        out.write("\t\t          <!-- modal -->\n");
        out.write("                    ");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_title_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyleClass("form-control");
    _jspx_th_html_text_0.setTitle("Usuario");
    _jspx_th_html_text_0.setProperty("nombre_usuario");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_title_styleClass_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_title_styleClass_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_title_styleClass_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(_jspx_page_context);
    _jspx_th_html_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_password_0.setStyleClass("form-control");
    _jspx_th_html_password_0.setTitle("Contraseña");
    _jspx_th_html_password_0.setProperty("password");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_password_title_styleClass_property_nobody.reuse(_jspx_th_html_password_0);
      return true;
    }
    _jspx_tagPool_html_password_title_styleClass_property_nobody.reuse(_jspx_th_html_password_0);
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
    _jspx_th_html_button_0.setOnclick("nuevo()");
    _jspx_th_html_button_0.setProperty("login");
    _jspx_th_html_button_0.setStyleClass("btn btn-theme btn-block");
    int _jspx_eval_html_button_0 = _jspx_th_html_button_0.doStartTag();
    if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_button_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_button_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_button_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                Ingresar \n");
        out.write("                            ");
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
