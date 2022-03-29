package org.apache.jsp.protectePage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Anunciante;
import controle.AnuncianteControle;

public final class centralAnunciante_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estiloAll.css\" />\n");
      out.write("        <title>.::Palavra Chave::.</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topAll\">\n");
      out.write("            Central de Anunciante - [ <strong><a href=\"centralAnunciante.jsp\">");
 out.println(request.getSession().getAttribute("nomeAnunciante"));
      out.write("</a></strong> ] [ Bem - Vindo ]\n");
      out.write("            <div id=\"logoTipo\">\n");
      out.write("                <a href=\"index.jsp\">\n");
      out.write("                    <img src=\"imagens/logoTypeMix.png\" alt=\"Palavra Chave\" />\n");
      out.write("                </a>\n");
      out.write("            </div><!--Fim Logotipo -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"espacoAll\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"corpoAll\">\n");
      out.write("\n");
      out.write("            <div id=\"menu_base\">\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <a href=\"centralAnunciante.jsp\">Inicio</a>\n");
      out.write("                    <a href=\"anuncios.jsp\">Anuncios</a>\n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("                <div id=\"menu1\">\n");
      out.write("                    <a href=\"index.jsp\">SAIR</a>\n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"conteudoAnuncios\">\n");
      out.write("                <div id=\"foto\">\n");
      out.write("                    <img src=\"imagens/semfoto.jpg\" alt=\"Palavra Chave\" />\n");
      out.write("                </div><!--Fim do foto-->\n");
      out.write("                <div id=\"anuncio\">\n");
      out.write("                    ");

                        Anunciante anunciante = new Anunciante();
                        AnuncianteControle anuncianteCtrl = new AnuncianteControle();
                        long idAnunciante = Long.parseLong(request.getSession().getAttribute("idAnunciante").toString());
                        anunciante = anuncianteCtrl.getAnunciante(idAnunciante);
                    
      out.write("\n");
      out.write("                    <form id=\"formentrar\" method=\"POST\" action=\"\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <label>\n");
      out.write("                                <span>ID</span>\n");
      out.write("                                <input type=\"text\" name=\"id\" value=\"");
 out.println(request.getSession().getAttribute("idAnunciante"));
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Nome do Anunciante</span>\n");
      out.write("                                <input type=\"text\" name=\"nomeAnunciante\" value=\"");
 out.println(anunciante.getNomeAnunciante());
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Morada</span>\n");
      out.write("                                <input type=\"text\" name=\"morada\" value=\"");
 out.println(anunciante.getMorada());
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Telefone</span>\n");
      out.write("                                <input type=\"text\" name=\"telefone\" value=\"");
 out.println(anunciante.getTelefone());
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>e-Mail</span>\n");
      out.write("                                <input type=\"text\" name=\"email\" value=\"");
 out.println(anunciante.getEmail());
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Conta Criada</span>\n");
      out.write("                                <input type=\"text\" name=\"datacriada\" value=\"");
 out.println(anunciante.getDatacriado());
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <span>Estado da Conta</span>\n");
      out.write("                                <input type=\"text\" name=\"estado\" value=\"");
 out.println(anunciante.getEstado());
      out.write("\" disabled=\"true\"/>\n");
      out.write("                            </label>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div><!--Fim do anuncio -->\n");
      out.write("            </div><!--Fim conteudoAnuncios -->\n");
      out.write("\n");
      out.write("            <div id=\"footAcoes\">\n");
      out.write("                <div id=\"accoes\">\n");
      out.write("                    <a href=\"alterarAnunciante.jsp\">ALTERAR CONTA</a>        \n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("                <div id=\"accoes\">\n");
      out.write("                    <a href=\"alterarSenhaAnunciante.jsp\">ALTERAR SENHA</a>      \n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("                <div id=\"accoes\">\n");
      out.write("                    <a href=\"SeverletBloquearAnunciante\" onclick=\"return confirm('Deseja Realmente Bloquear a Conta?');\">BLOQUEAR CONTA</a>        \n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("            </div><!--Fim do footAction -->\n");
      out.write("        </div>\n");
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
