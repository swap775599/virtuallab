package your.package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/virtual_classroom";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "your_password";

    public String handleLogin(String userId, String password, String role) {
        String redirectPage = null;

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String query = "SELECT * FROM users WHERE user_id = ? AND password = ? AND role = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
            pstmt.setString(3, role);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                if ("student".equals(role)) {
                    redirectPage = "class.jsp";
                } else if ("instructor".equals(role)) {
                    redirectPage = "edit.jsp";
                }
            } else {
                redirectPage = "login.jsp?error=Invalid credentials or role";
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            redirectPage = "login.jsp?error=An error occurred";
        }

        return redirectPage;
    }
}
