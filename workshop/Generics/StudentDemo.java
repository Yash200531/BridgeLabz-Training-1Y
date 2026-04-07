package workshop.Generics;

class Student {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Yash");
        System.out.println("Student name: " + student.getName());
    }
}
