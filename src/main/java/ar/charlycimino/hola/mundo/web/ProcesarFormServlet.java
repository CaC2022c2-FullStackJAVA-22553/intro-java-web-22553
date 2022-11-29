
package ar.charlycimino.hola.mundo.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
@WebServlet(name = "procesar", urlPatterns = {"/procesar-saludo"})
public class ProcesarFormServlet extends HttpServlet {
    
    /*
        QUIERO QUE ME MANDE FECHA DE NACIMIENTO Y YO (SERVIDOR) LE CONTESTE SU EDAD
    */
    private Modelo m;
    
    public ProcesarFormServlet() {
        this.m = new Modelo();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fechaNac = req.getParameter("fDeNac");
        int laEdad = m.edad(fechaNac);
        req.setAttribute("laEdadDelUsuario", laEdad);
        req.getRequestDispatcher("saludo.jsp").forward(req, resp);
    } 
    
   
}
