/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import javax.servlet.RequestDispatcher;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.model.Login;
import com.module.LoginModule;
import java.io.IOException;
import java.io.PrintWriter;
import static java.net.Proxy.Type.HTTP;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author naeem
 */
public class indexservlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet indexservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet indexservlet at " + request.getContextPath() + "</h1>");
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
        //String usercredential=request.getParameter("data");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        PrintWriter out= null;
        JsonObject retval=new JsonObject();
        boolean msg=false;
        try {
            msg = new LoginModule().checkModule(request);
        } catch (Exception ex) {
            Logger.getLogger(indexservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        Gson g = new Gson();
        JsonObject usercredential =new JsonObject();
        usercredential.addProperty("username",username);
        usercredential.addProperty("password",password);
        System.out.print(usercredential);
        String usercredentialtostring=usercredential.toString();
        Login userobj=g.fromJson(usercredentialtostring,Login.class);
        int userid=userobj.getUsername();
        HttpSession session=request.getSession(true);
        session.setAttribute("userid",userid);
        System.out.println(userid);
        if(msg==true){
            System.out.println("User exist");
            request.setAttribute("user",userid);
            try{
              response.sendRedirect("FrmEmpReg.jsp?userid="+userid);
            }
            catch(IOException e){
                System.out.println(e);
            }
            
        }
        
        else{
            System.out.println("User does not exist");
            response.sendRedirect("index.jsp");
            
        }
        //out=response.getWriter();
        //retval.addProperty("savj",msg);
          //  out.print(retval);
        //System.out.println("i am here");
        
    //System.out.println(usercredential); 
        
        
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
