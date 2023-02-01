import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/page1","/page2"})
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page = request.getRequestURI();
        System.out.println(page);
        if (page.equals("/page1")) {
            request.getRequestDispatcher("/page1.html").forward(request, response);
        } else if (page.equals("/page2")) {
            response.getWriter().println("<h1>Page 2</h1>");
        }

    }
}

