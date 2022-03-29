/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controle.UtilizadorControle;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Utilizador;

/**
 *
 * @author fernandojoao
 */
public class SeverletEntrarUtilizador extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        UtilizadorControle controle = new UtilizadorControle();
        UtilizadorControle controle1 = new UtilizadorControle();
        String nomeUtilizador = request.getParameter("nomeUtilizador");
        String senhaUtilizador = request.getParameter("senhaUtilizador");
        try {
            if (controle.validUsernameAndPassword(nomeUtilizador, senhaUtilizador)) {
                long idUtilizador = controle1.getUtilizadorID(nomeUtilizador);

                UtilizadorControle controle2 = new UtilizadorControle();
                Utilizador utilizador = new Utilizador();
                utilizador = controle2.getUtilizador(idUtilizador);
                
                request.getSession().setAttribute("entrarUtilizador", true);
                request.getSession().setAttribute("nomeUtilizador", utilizador.getNomeCompleto());
                request.getSession().setAttribute("idUtilizador", idUtilizador);
                response.sendRedirect("protectePageUser/centralUtilizador.jsp");
            } else {
                response.sendRedirect("errorEntrarUtilizador.jsp");
            }
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SeverletEntrarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SeverletEntrarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
