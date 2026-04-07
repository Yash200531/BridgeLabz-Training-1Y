package com.gla.classesobjects.level1;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Spice Hub", "Downtown", new String[]{"Pizza", "Burger", "Pasta"});
        Restaurant restaurant2 = new Restaurant("Green Bowl", "City Mall", new String[]{"Salad", "Soup", "Sandwich"});

        restaurant1.displayDetails();
        System.out.println("Is Pasta available? " + restaurant1.isFoodAvailable("Pasta"));
        System.out.println();

        restaurant2.displayDetails();
        System.out.println("Is Soup available? " + restaurant2.isFoodAvailable("Soup"));
        System.out.println();

        Student student = new Student("Aman", 101, 88.5);
        student.displayStudentDetails();
        System.out.println();

        Employee employee = new Employee(1, "Riya", 55000.0);
        employee.displayEmployeeDetails();
        System.out.println();

        Book book = new Book("Clean Code", "Robert C. Martin", 450.0);
        book.displayBookDetails();
        System.out.println();

        Car car = new Car("Toyota", "Corolla", 1800000.0);
        car.displayCarDetails();
    }
}
