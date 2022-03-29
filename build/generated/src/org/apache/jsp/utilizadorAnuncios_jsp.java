package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public final class utilizadorAnuncios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
  //String menuactivo=basename(SERVER['SCRIPT_NAME']); 
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"topAll\">\n");
      out.write("            \n");
      out.write("            Anuncios!\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"espacoAll\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"corpoAll\">\n");
      out.write("            \n");
      out.write("            <div id=\"menu_base\">\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <a href=\"centralUtilizador.jsp\">Inicio</a>\n");
      out.write("                    <a href=\"#\">TTTTTTTTTT</a>\n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("                <div id=\"menu1\">\n");
      out.write("                    <a href=\"utilizadorAnunciante.jsp\">VOLTAR</a>\n");
      out.write("                </div><!--Menu do Site -->\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"conteudoAnuncios\">\n");
      out.write("                \n");
      out.write("                <table border=\"1\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                                    <td><strong><p>ID</p></strong></td><td><strong><p>Frase Promocional</p></strong></td><td><strong><p>Url</p></strong></td><td><strong><p>Título</p></strong></td><td><strong><p>Palavra Chave</p></strong></td><td><strong><p>Custo</p></strong></td><td><strong><p># Cliques</p></strong></td><td><strong><p># Cliques Válido</p></strong></td><td><strong><p>Data</p></strong></td><td colspan=\"2\" class=\"ali\"><strong><p>Opções</p></strong></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

                                        Connection con;
                                        Statement st;
                                        ResultSet rs;

                                        try{

                                            Class.forName("oracle.jdbc.OracleDriver");
                                            con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "palavrachave", "palavrachave");
                                            st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                                            rs = st.executeQuery("SELECT * FROM anuncio ORDER BY idanuncio");

                                            int i=1;
                                            while(rs.next()){
                                
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
 out.println(""+rs.getString("idanuncio")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("frasepromocional")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("url")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("titulo")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("palavrachave")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("custoclique")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("numeroclique")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("numcliquevalido")); 
      out.write("</td>\n");
      out.write("                                        <td>");
 out.println(""+rs.getString("datacriado")); 
      out.write("</td>\n");
      out.write("                                        <td class=\"ali\">\n");
      out.write("                                            <a href=\"utilizadorAnunciante.jsp?idanuncio=");
 out.println(""+rs.getString("idanuncio")); 
      out.write("\">\n");
      out.write("                                                Alterar\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"ali\">\n");
      out.write("                                            <a href=\"utilizadorAnunciante.jsp?idanuncio=");
 out.println(""+rs.getString("idanuncio")); 
      out.write("\">\n");
      out.write("                                                Eliminar\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                    ");

                        i++;
                        }
                                    //out.println("<span class=\"yes\">Login Efectuado Com Sucesso!</span>");

                                    //else
                                    //  out.println("<span class=\"no\">Nome ou Senha do Utilizador Inválida!</span>");

                            }
                            catch(ClassNotFoundException errorCNF){
                                out.println("<span class=\"no\">Houve Erro de Driver = "+errorCNF+".</span>");
                            }
                            catch(SQLException errorSQL){
                                out.println("<span class=\"no\">Houve Erro na Conexão com a BD = "+errorSQL+".</span>");
                            }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div><!--fim do Conteudo de Anuncios -->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"logoTipo\">\n");
      out.write("            <a href=\"index.jsp\">\n");
      out.write("\t        <img src=\"imagens/logoTypeMix.png\" alt=\"Palavra Chave\" />\n");
      out.write("            </a>\n");
      out.write("        </div><!--Menu do Site -->\n");
      out.write("    </body>\n");
      out.write("</html>");
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
