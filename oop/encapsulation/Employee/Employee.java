package oop.encapsulation.Employee;

public class Employee {
    private String name;
    private String email;
    private String address;
    private float salary;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Employee(String name, String email, String address, float salary, int age, String gender) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }
}
