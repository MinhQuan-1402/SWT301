package quanpm.example;

// Interface định nghĩa hành vi vẽ
interface Drawable {
    void draw();
}

// Lớp Circle triển khai đầy đủ phương thức từ interface Drawable
class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

