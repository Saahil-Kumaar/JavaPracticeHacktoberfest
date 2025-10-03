// Person.java
// Simple Java class example

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }

    // Main method to run example
    public static void main(String[] args) {
        Person p = new Person("John Doe", 25);
        System.out.println(p.getDetails());
    }
}
