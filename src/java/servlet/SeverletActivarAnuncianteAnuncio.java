/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controle.AnuncioControle;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Anuncio;

/**
 *
 * @author fernandojoao
 */
public class SeverletActivarAnuncianteAnuncio extends HttpServlet {

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
        AnuncioControle ctrlAnuncio=new AnuncioControle();
        AnuncioControle ctrlAnuncio1=new AnuncioControle();
        boolean resultado = false;
        Anuncio anuncio=new Anuncio();
        long idAnuncio = Long.parseLong(request.getParameter("idanuncio").toString());
        anuncio=ctrlAnuncio1.getAnuncio(idAnuncio);
        long idAnunciante = anuncio.getIdAnunciante();
        
        
        try {
            resultado=ctrlAnuncio.activarAnuncio(idAnuncio);
        } catch (SQLException ex) {
            Logger.getLogger(SeverletActivarAnuncianteAnuncio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(resultado==true)
                response.sendRedirect("protectePageUser/utilizadorAnuncios.jsp?idAnunciante="+idAnunciante);
            else
                response.sendRedirect("protectePageUser/utilizadorAnuncios.jsp?idAnunciante="+idAnunciante);
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
            Logger.getLogger(SeverletActivarAnuncianteAnuncio.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SeverletActivarAnuncianteAnuncio.class.getName()).log(Level.SEVERE, null, ex);
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
