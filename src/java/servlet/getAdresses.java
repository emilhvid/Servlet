/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Client.ButikSøgning;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Emil
 */
public class getAdresses extends HttpServlet {
// getAddress giver en liste over adresser over det du har søgt, getRoute en rute fra start-slut location, ConverAddress(ArrayList) en list over mulige stoppesteder, ConvertAddress(Returerne en String)
    // login returnere en boolean
    //sethome address and a gethome address
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
            out.println("<title>Servlet getAdresses</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet getAdresses at " + request.getContextPath() + "</h1>");
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
        private ButikSøgning bs;
       private String name, city;

      @Override
    public void doGet(HttpServletRequest request, 
	                  HttpServletResponse response) throws IOException
	{
            
        response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head><title>Soap interface - fra en servlet</title></head>");
	out.println("<body>");
	out.println("<p>Der er adgang til Soap metoderne:<br>");
        URL url;
        
        try {
            url = new URL("http://52.37.83.173:9901/amazonConnection?wsdl");
            QName qname = new QName("http://amazonconnection/", "ButikSøgningImplService");
            Service service = Service.create(url, qname);
            bs = service.getPort(ButikSøgning.class);    } 
        catch (MalformedURLException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       name = request.getParameter("name");
       city= request.getParameter("city");
        
        List<String> add = bs.getAdresses("Lyngby","Netto");
	           for (String string : add) {
               out.println(string+"<br>"); 
            }
        
        
	out.println("</body>");
	out.println("</html>");
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
