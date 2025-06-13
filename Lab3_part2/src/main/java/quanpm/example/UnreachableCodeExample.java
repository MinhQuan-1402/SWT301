package quanpm.example;

public class UnreachableCodeExample {
    public static int getNumber() {
        return 42;  // Giá trị trả về hợp lệ
    }

    public static void main(String[] args) {
        System.out.println(getNumber());  // Output: 42
    }
}
