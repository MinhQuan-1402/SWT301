package quanpm.example;

import java.util.Objects;
import java.util.logging.Logger;

public class InsecureLogin {

    private static final Logger logger = Logger.getLogger(InsecureLogin.class.getName());

    public static void login(String username, String password) {
        if (username == null || password == null) {
            logger.warning("Username or password is null");
            return;
        }

        String adminPassword = System.getenv("ADMIN_PASSWORD");
        if (Objects.equals(username, "admin") && Objects.equals(password, adminPassword)) {
            logger.info("Login successful");
        } else {
            logger.warning("Login failed");
        }
    }

    public void printUserInfo(String user) {
        if (user != null && !user.trim().isEmpty()) {
            logger.info("User: [REDACTED]");
        } else {
            logger.warning("User info is empty or null");
        }
    }

    // Removed unused methods
}
