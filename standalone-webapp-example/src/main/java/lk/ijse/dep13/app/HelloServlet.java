package lk.ijse.dep13.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(loadOnStartup =  0, urlPatterns = "/")
public class HelloServlet extends HttpServlet {

    static{
        System.out.println("Hello Servlet is being initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("I am special now I have a container with me");
    }
}
