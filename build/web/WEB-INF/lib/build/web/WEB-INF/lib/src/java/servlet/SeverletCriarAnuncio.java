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
public class SeverletCriarAnuncio extends HttpServlet {

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
        long idAnunciante = Long.parseLong(request.getSession().getAttribute("idAnunciante").toString());
        AnuncioControle ctrlAnuncio=new AnuncioControle();
        Anuncio anuncio=new Anuncio();
        boolean resultado = false;
        
        anuncio.setFrasePromocional(request.getParameter("frasePromocional"));
        anuncio.setUrl(request.getParameter("url"));
        anuncio.setTitulo(request.getParameter("titulo"));
        anuncio.setPalavraChave(request.getParameter("palavraChave"));
        anuncio.setCustoClique(Double.parseDouble(request.getParameter("custoClique")));
        anuncio.setNumeroClique(Long.parseLong(request.getParameter("numClique")));
        anuncio.setNumCliqueValido(Long.parseLong(request.getParameter("numClique")));
        anuncio.setIdAnunciante(idAnunciante);
        anuncio.setEstado("Activo");
        try {
            resultado=ctrlAnuncio.inserirAnuncio(anuncio);
        } catch (SQLException ex) {
            Logger.getLogger(SeverletCriarAnunciante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(resultado==true)
                response.sendRedirect("protectePage/anuncios.jsp");
            else
                response.sendRedirect("protectePage/criarAnuncio.jsp");
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
