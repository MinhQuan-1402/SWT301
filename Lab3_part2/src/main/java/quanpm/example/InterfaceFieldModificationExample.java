package quanpm.example;

// ✅ Class chứa hằng số: rõ ràng, dễ mở rộng, đúng chuẩn clean code
final class AppConstants {
    public static final int MAX_USERS = 100;

    // private constructor để ngăn tạo đối tượng
    private AppConstants() {
        throw new UnsupportedOperationException("Utility class");
    }
}

public class InterfaceFieldModificationExample {
    public static void main(String[] args) {
        System.out.println("Max users allowed: " + AppConstants.MAX_USERS);
    }
}
