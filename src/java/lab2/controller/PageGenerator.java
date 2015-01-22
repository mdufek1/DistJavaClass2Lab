/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mdufek1
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String color = request.getParameter("color");
            String fname = ", "+request.getParameter("fname");
            String lname = request.getParameter("lname")+"!";
            if(fname.equals(", null")){
                fname="!";
            }
            if(lname.equals("null!")){
                lname="";
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Generated Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2><a href='index.html'>&#8592; Go back to index.</a></h2>");
            out.println("<center>");
            out.println("<h1 style='color:"+color+";'>Lab 2 Activity - Generated on: "+new Date()+"</h1>");
            out.println("<h1 style='color:"+color+";'>Welcome"+fname+" "+lname+"</h1>");
            out.println("<table border='1' style='margin-top:20%; position:relative;'>");
            for(int i = 0; i<3 ;i++){
                out.println("<tr>");
                for(int o = 0; o<3 ;o++){
                    out.println("<td>This is Column "+(o+1)+" of Row "+(i+1)+" !</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
