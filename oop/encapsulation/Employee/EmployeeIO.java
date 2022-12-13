package oop.encapsulation.Employee;

import oop.encapsulation.Employee.Employee;

import java.util.Scanner;

public class EmployeeIO {
    Scanner sc = new Scanner(System.in);

    public String readData(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    public Employee readEmployeeInfo() {
        String Name = readData("enter  name");
        String email = readData("enter email");
        String address = readData("enter address");
        int age = Integer.parseInt(readData("enter age"));
        int salary = Integer.parseInt(readData("enter salary"));
        String gender = readData("enter gender");
        Employee employee = new Employee(Name, email,
                address, salary, age, gender);
        return employee;
    }

    public void display (Employee emp) {
        System.out.println("Details ");
        System.out.println(" name" + "::" + emp.getName());
        System.out.println(" email" + "::" + emp.getEmail());
        System.out.println(" address" + "::" + emp.getAddress());
        System.out.println(" salary" + "::" + emp.getSalary());
        System.out.println(" age " + "::" + emp.getAge());
        System.out.println(" Gender " + "::" + emp.getGender());
    }
}
