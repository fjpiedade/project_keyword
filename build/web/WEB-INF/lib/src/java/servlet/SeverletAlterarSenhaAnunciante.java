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
public class SeverletAlterarSenhaAnunciante extends HttpServlet {

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
        AnuncianteControle ctrlAnunciante = new AnuncianteControle();
        boolean resultado = false;

        long idAnunciante = Long.parseLong(request.getSession().getAttribute("idAnunciante").toString());
        String newSenha = request.getParameter("newSenha").toString();
        
        AnuncianteControle anuncianteCtrl = new AnuncianteControle();
        Anunciante anunciante = new Anunciante();
        anunciante = anuncianteCtrl.getAnunciante(idAnunciante);
        String beforSenha = anunciante.getSenhaAnunciante();
        
        try {
            if(beforSenha.equals(request.getParameter("beforSenha"))){
                resultado = ctrlAnunciante.alterarSenhaAnunciante(idAnunciante, newSenha);
            }
            else{
                response.sendRedirect("protectePage/alterarSenhaAnunciante.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeverletCriarAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (resultado == true) {
            response.sendRedirect("protectePage/centralAnunciante.jsp");
        } else {
            response.sendRedirect("protectePage/alterarSenhaAnunciante.jsp");
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
            Logger.getLogger(SeverletAlterarSenhaAnunciante.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SeverletAlterarSenhaAnunciante.class.getName()).log(Level.SEVERE, null, ex);
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
