package quanpm.example;

import java.io.*;

public class PathTraversalExample {
    public static void main(String[] args) {
        String userInput = "data.txt"; // Đầu vào hợp lệ giả lập
        File baseDir = new File("safe_directory"); // Thư mục gốc an toàn
        File file = new File(baseDir, userInput);

        try {
            String canonicalBase = baseDir.getCanonicalPath();
            String canonicalPath = file.getCanonicalPath();

            if (!canonicalPath.startsWith(canonicalBase)) {
                throw new SecurityException("Attempt to access file outside allowed directory!");
            }

            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    System.out.println("Reading file: " + file.getPath());
                }
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException | SecurityException e) {
            System.out.println("Access denied: " + e.getMessage());
        }
    }
}
