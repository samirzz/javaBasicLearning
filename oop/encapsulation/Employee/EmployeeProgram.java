package oop.encapsulation.Employee;

import oop.encapsulation.Employee.Employee;
import oop.encapsulation.Employee.EmployeeIO;

public class EmployeeProgram {
    public static void main(String[] args) {
        EmployeeIO empIo = new EmployeeIO();
        Employee employee = empIo.readEmployeeInfo();
       empIo.display(employee);


    }
}
