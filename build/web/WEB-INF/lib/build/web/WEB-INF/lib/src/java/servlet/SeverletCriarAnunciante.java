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
import model.Anunciante;

/**
 *
 * @author fernandojoao
 */
public class SeverletCriarAnunciante extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        AnuncianteControle ctrlAnunciante = new AnuncianteControle();
        Anunciante anunciante = new Anunciante();
        boolean resultado = false;

        anunciante.setNomeAnunciante(request.getParameter("nomeAnunciante"));
        anunciante.setMorada(request.getParameter("morada"));
        anunciante.setTelefone(request.getParameter("telefone"));
        anunciante.setEmail(request.getParameter("email"));
        anunciante.setSenhaAnunciante(request.getParameter("senha"));
        anunciante.setEstado("Activa");
        try {
            AnuncianteControle ctrlAnunciante1 = new AnuncianteControle();
            if (!ctrlAnunciante1.isValidTelefoneAnunciante(request.getParameter("telefone"))) {
                AnuncianteControle ctrlAnunciante2 = new AnuncianteControle();
                if (!ctrlAnunciante2.isValidEmailAnunciante(request.getParameter("email"))) {
                    resultado = ctrlAnunciante.inserirAnunciante(anunciante);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeverletCriarAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (resultado == true) {
            response.sendRedirect("criarContaAnuncianteMsn.jsp");
        } else {
            response.sendRedirect("criarContaAnunciante.jsp");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
