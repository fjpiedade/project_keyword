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
import javax.swing.JOptionPane;
import model.Utilizador;

/**
 *
 * @author fernandojoao
 */
public class SeverletAlterarUtilizador extends HttpServlet {

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
        boolean resultado = false;
        Utilizador user = new Utilizador();
        UtilizadorControle ctrl = new UtilizadorControle();
        
        user.setIdUtilizador(Long.parseLong(request.getSession().getAttribute("idUtilizador").toString()));
        user.setBi(request.getParameter("bi"));
        user.setNomeUtilizador(request.getParameter("nomeUtilizador"));
        user.setNomeCompleto(request.getParameter("nomeCompleto"));
        user.setSexo(request.getParameter("genero"));
        user.setDataNascimento(request.getParameter("dataNascimento"));
        user.setTelefone(request.getParameter("telefone"));
        user.setMorada(request.getParameter("morada"));
        user.setEmail(request.getParameter("email"));
        
        try {
            resultado = ctrl.alterarUtilizador(user);
        } catch (SQLException ex) {
            Logger.getLogger(SeverletAlterarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (resultado == true) {
            request.getSession().setAttribute("nomeUtilizador", user.getNomeCompleto());
            response.sendRedirect("protectePageUser/centralUtilizador.jsp");
        } else {
            response.sendRedirect("protectePageUser/alterarUtilizador.jsp");
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
            Logger.getLogger(SeverletAlterarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SeverletAlterarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
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
