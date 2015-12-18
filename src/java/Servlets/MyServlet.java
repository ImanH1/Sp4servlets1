
package Servlets;

import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MyServlet", urlPatterns = {"/api/quote/*"})
public class MyServlet extends HttpServlet {

    // Implement the map in the Servlet class to hold the data for the Exercise
//    private Map<Integer, String> quotes = new HashMap() {
//        {
//            put(1, "Friends are kisses blown to us by angels");
//            put(2, "Do not take life too seriously. You will never get out of it alive");
//            put(3, "Begind every great man, is a woman rolling her eyes");
//        }
//    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse repsonse)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse repsonse)
            throws ServletException, IOException {
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
