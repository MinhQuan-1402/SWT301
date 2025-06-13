package quanpm.example;

class User {
    private String name;
    private int age;

    // Constructor an toàn
    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getter & Setter có kiểm tra
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
