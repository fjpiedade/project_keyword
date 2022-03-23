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
public class SeverletCriarUtilizador extends HttpServlet {

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

        /*
         * boolean resultado = false; Utilizador user = new Utilizador();
         * UtilizadorControle ctrl = new UtilizadorControle();
         *
         * user.setBi(request.getParameter("bi"));
         * user.setNomeUtilizador(request.getParameter("nomeUtilizador"));
         * user.setSenhaUtilizador(request.getParameter("senha"));
         * user.setNomeCompleto(request.getParameter("nomeCompleto"));
         * user.setSexo(request.getParameter("genero"));
         * user.setDataNascimento(request.getParameter("dataNascimento"));
         * user.setTelefone(request.getParameter("telefone"));
         * user.setMorada(request.getParameter("morada"));
         * user.setEmail(request.getParameter("email"));
         */

        Utilizador user = new Utilizador();
        UtilizadorControle ctrl = new UtilizadorControle();
        boolean resultado = false;

        user.setBi(request.getParameter("bi"));
        user.setNomeUtilizador(request.getParameter("nomeUtilizador"));
        user.setSenhaUtilizador(request.getParameter("senha"));
        user.setNomeCompleto(request.getParameter("nomeCompleto"));
        user.setSexo(request.getParameter("genero"));
        user.setDataNascimento(request.getParameter("dataNascimento"));
        user.setTelefone(request.getParameter("telefone"));
        user.setMorada(request.getParameter("morada"));
        user.setEmail(request.getParameter("email"));

        if (!ctrl.isValidBiUtilizador(request.getParameter("bi"))) {
            UtilizadorControle ctrl1 = new UtilizadorControle();
            if (!ctrl1.isValidTelefoneUtilizador(request.getParameter("telefone"))) {
                UtilizadorControle ctrl2 = new UtilizadorControle();
                if (!ctrl2.isValidEmailUtilizador(request.getParameter("email"))) {
                    UtilizadorControle ctrl3 = new UtilizadorControle();
                    if (!ctrl3.isValidNomeUtilizador(request.getParameter("nomeUtilizador"))) {
                        UtilizadorControle ctrl4 = new UtilizadorControle();
                        resultado = ctrl4.inserirUtilizador(user);
                    }
                }
            }
        }
        if (resultado == true) {
            response.sendRedirect("protectePageUser/utilizadores.jsp");
        } else {
            response.sendRedirect("protectePageUser/criarContaUtilizador.jsp");
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
            Logger.getLogger(SeverletCriarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SeverletCriarUtilizador.class.getName()).log(Level.SEVERE, null, ex);
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
