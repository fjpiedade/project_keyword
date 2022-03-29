/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controle.AnuncianteControle;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernandojoao
 */
public class SeverletEntrarAnunciante extends HttpServlet {

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
        AnuncianteControle controle = new AnuncianteControle();
        AnuncianteControle controle1 = new AnuncianteControle();
        String emailAnunciante = request.getParameter("emailAnunciante");
        String senhaAnunciante = request.getParameter("senhaAnunciante");
        try {
            if (controle.validUsernameAndPassword(emailAnunciante, senhaAnunciante)) {
                String nomeAnunciante = controle.getAnuncianteNome(emailAnunciante);
                long idAnunciante = controle1.getAnuncianteID(emailAnunciante);

                AnuncianteControle controle2 = new AnuncianteControle();
                if (!controle2.isLockedAnunciante(idAnunciante)) {
                    request.getSession().setAttribute("entrarAnunciante", true);
                    request.getSession().setAttribute("nomeAnunciante", nomeAnunciante);
                    request.getSession().setAttribute("idAnunciante", idAnunciante);
                    response.sendRedirect("protectePage/centralAnunciante.jsp");
                } else {
                    response.sendRedirect("protectePage/lockedContaAnunciante.jsp");
                }

            } else {
                response.sendRedirect("errorEntrarAnunciante.jsp");
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
            Logger.getLogger(SeverletEntrarAnunciante.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SeverletEntrarAnunciante.class.getName()).log(Level.SEVERE, null, ex);
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
