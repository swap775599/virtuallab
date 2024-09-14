package your.package;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/postCommentController")
public class PostCommentServlet extends HttpServlet {

    private PostCommentController postCommentController = new PostCommentController();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int lectureId = Integer.parseInt(request.getParameter("lectureId"));
        String userName = request.getParameter("userName");
        String comment = request.getParameter("comment");

        postCommentController.postComment(lectureId, userName, comment);

        response.sendRedirect("class.jsp"); // or the relevant page
    }
}
