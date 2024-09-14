package your.package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostCommentController {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/virtual_classroom";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "your_password";

    public void postComment(int lectureId, String userName, String comment) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "INSERT INTO comments (lecture_id, user_name, comment) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, lectureId);
            pstmt.setString(2, userName);
            pstmt.setString(3, comment);

            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
