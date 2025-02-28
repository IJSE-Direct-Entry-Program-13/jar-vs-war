package lk.ijse.dep13.springbootapp.lk.ijse.dep13.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 0)
public class HelloServlet extends HttpServlet {

    static {
        System.out.println("Servlet class is being loaded");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("I am in a Spring Boot application");
    }
}
