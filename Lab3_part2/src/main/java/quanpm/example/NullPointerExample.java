package quanpm.example;

public class NullPointerExample {
    public static void main(String[] args) {
        String text = null; // giả lập đầu vào

        if (text != null && !text.isEmpty()) {
            System.out.println("Text is not empty");
        } else {
            System.out.println("Text is null or empty");
        }
    }
}
