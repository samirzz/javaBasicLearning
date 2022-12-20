package oop.InheritanceSurName;

public class Father extends GrandFather{
    String name= "resham";
    public void fatherInfo(){
        System.out.println("Full name :: "+name+" "+super.surname);
    }


}
