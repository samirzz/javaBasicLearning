package oop;

import java.util.Scanner;

public class EmployeeProgram extends UserIo {
    public static void main(String[] args) {
        UserIo userIo = new UserIo();
        int id = Integer.parseInt(userIo.readData("Enter id"));
        String fullName = userIo.readData("Enter full name");
        float salary = Float.parseFloat(userIo.readData("enter salary"));
        Employee employee=new Employee(id,fullName);
        String designation= userIo.readData("designation");
        employee.setDesignation(designation);
        employee.setSalary(salary);

        employee.display();

    }

}
