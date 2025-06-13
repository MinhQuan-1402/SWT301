package quanpm.example;

import java.sql.*;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String userInput = "' OR '1'='1"; // Đầu vào độc hại

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {

            stmt.setString(1, userInput); // ✅ Truyền tham số an toàn
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("User found: " + rs.getString("username"));
            }

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
