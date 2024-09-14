package your.package;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginController")
public class LoginServlet extends HttpServlet {

    private LoginController loginController = new LoginController();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        String redirectPage = loginController.handleLogin(userId, password, role);

        response.sendRedirect(redirectPage);
    }
}
