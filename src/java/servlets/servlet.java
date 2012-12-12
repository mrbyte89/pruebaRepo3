/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author María Galbis
 */
public class servlet extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String url)
            throws ServletException, IOException {
        ServletContext cont = getServletConfig().getServletContext();
        RequestDispatcher reqDispatcher = cont.getRequestDispatcher(url);
        reqDispatcher.forward(request, response);
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
        doPost(request, response);
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
        HttpSession sesion = request.getSession();

        String accion = request.getParameter("accion");
        String url = "/index.jsp";

        if (accion != null) {
            switch (accion) {
                case "login":
                    String user = request.getParameter("user");
                    String pass = request.getParameter("pass");

                    if (validar(user, pass)) {
                        url = "/bienvenido.jsp";
                        sesion.setAttribute("nombre", user);
                    }
                    break;
                case "agenda":
                    String nombre = request.getParameter("nombre");
                    url = "/agenda.jsp";
                    
                    String telefono = agenda(nombre);
                    request.setAttribute("resultado", nombre+" : "+telefono);
                    break;
                case "tablas":
                    String numero = request.getParameter("numero");
                    url = "/tablas.jsp";
                    
                    String tabla = tabla(numero);
                    request.setAttribute("resultado", tabla);
            }
        }




        processRequest(request, response, url);
    }

    protected boolean validar(String usuario, String pass) {
        if (usuario.equals("maria") && pass.equals("maria")) {
            return true;
        } else {
            return false;
        }
    }

    protected String agenda(String nombre) {
        HashMap<String, String> agenda = new HashMap();
        agenda.put("Maria", "666000333");
        agenda.put("Pepe", "612359232");
        agenda.put("Javi", "602849366");
        agenda.put("Carlos", "600390234");
        agenda.put("Pablo", "612195323");
        agenda.put("Marta", "665047558");
        agenda.put("Carmen", "601660233");
        agenda.put("Juan", "672332008");
        agenda.put("Pedro", "698123456");
        agenda.put("Ana", "678901123");
        agenda.put("Estefania", "678312304");
        agenda.put("Raul", "628402094");

        if (agenda.containsKey(nombre)) {
            return agenda.get(nombre);
        } else {
            return "Nombre no encontrado";
        }
    }
    
    protected String tabla(String n){
        String resultado = "La tabla del " + n + ": <br />";
        for(int i=1;i<=10;i++){
            resultado += n +" x "+ i + " = "+ (Integer.parseInt(n)*i) +"<br />";
        }
        return resultado;
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
