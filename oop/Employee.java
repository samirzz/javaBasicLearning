package oop;

public class Employee {
    private int id;
    private String fullName;
    private String designation;
    private float salary;

    public Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(float salary) {

        this.salary =  (salary>50000)? 50000:salary;
    }

    public float getSalary() {
        return salary;
    }
    public void display(){
        System.out.println("enter name = " + fullName);
        System.out.println("enter salary = " + id);
        System.out.println("enter designation = " + designation);



    }
}
