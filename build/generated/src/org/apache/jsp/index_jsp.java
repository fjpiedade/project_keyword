package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\"/>\n");
      out.write("        <script language=\"JavaScript\" src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script language=\"JavaScript\" src=\"js/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script language=\"JavaScript\" src=\"js/jquery.entrarApp.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>.::Palavra Chave::.</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topAll\">\n");
      out.write("            Anúncio por Palavra Chave!\n");
      out.write("            <div id=\"logoTipo\">\n");
      out.write("                <a href=\"index.jsp\">\n");
      out.write("                    <img src=\"imagens/logoTypeMix.png\" alt=\"Palavra Chave\"/>\n");
      out.write("                </a>\n");
      out.write("            </div><!--Fim Logotipo -->\n");
      out.write("        </div>\n");
      out.write("        <div id=\"principal\">\n");
      out.write("            \n");
      out.write("            <div id=\"corpo\">\n");
      out.write("                <h1>Bem-vindo ao Anúncio por Palavra Chave</h1>\n");
      out.write("                <h4>Entra na Aplicação, para gerir seus Anúncios e Palavra Chave</h4>\n");
      out.write("                <div id=\"formulario\">\n");
      out.write("                    <form id=\"frmEntrar\" method=\"POST\" action=\"SeverletEntrarAnunciante\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <label for=\"emailAnunciante\">\n");
      out.write("                                <span>e-Mail do Anunciante *</span>\n");
      out.write("                                <input type=\"text\" id=\"emailAnunciante\" name=\"emailAnunciante\" />\n");
      out.write("                            </label>\n");
      out.write("                            <label for=\"senhaAnunciante\">\n");
      out.write("                                <span>Senha do Anunciante *</span>\n");
      out.write("                                <input type=\"password\" id=\"senhaAnunciante\" name=\"senhaAnunciante\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"submit\" value=\"Entrar\" name=\"entrar\" class=\"send\" /> <h1>ou <a href=\"criarContaAnunciante.jsp\">Criar Sua Conta de Anunciante</a></h1>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form> \n");
      out.write("                    <h2><a href=\"seleccao.jsp\">Selecção de Anúncios</a></h2> <h3><a href=\"entrarUtilizador.jsp\">Utilizadores</a></h3>\n");
      out.write("                </div><!--Fim do Formulario -->\n");
      out.write("                \n");
      out.write("            </div><!--Fim do Corpo -->\n");
      out.write("            \n");
      out.write("        </div><!--Fim do Principal -->\n");
      out.write("        \n");
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
}
