/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controle.AnuncianteControle;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class SeverletApagarAnunciante extends HttpServlet {

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
        AnuncianteControle ctrlAnunciante1 = new AnuncianteControle();
        boolean resultado = false;
        boolean resultado1 = false;
        
        long idAnunciante=Long.parseLong(request.getParameter("idAnunciante").toString());
        
        try {
            AnuncianteControle ctrl2=new AnuncianteControle(); 
            if(ctrl2.isThereAnuncio(idAnunciante)!=0){
                resultado1 = ctrlAnunciante1.apagarAnuncioAnunciante(idAnunciante);
                resultado = ctrlAnunciante.apagarAnunciante(idAnunciante);
            }else{
                resultado = ctrlAnunciante.apagarAnunciante(idAnunciante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeverletApagarAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (resultado == true && resultado1 == true ) {
            response.sendRedirect("protectePageUser/utilizadorAnunciante.jsp");
        } else {
            response.sendRedirect("protectePageUser/utilizadorAnunciante.jsp");
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
