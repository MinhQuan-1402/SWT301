package quanpm.example;

public class OvercatchingExceptionExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array access: " + e.getMessage());
        }
    }
}
