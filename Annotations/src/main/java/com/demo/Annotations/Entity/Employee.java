package com.demo.Annotations.Entity;

public class Employee {
    private int EmployeeId;
    private String name;
    private String department;

    //default parameter
    public Employee(){

    }
    public Employee(int EmployeeId,String name,String department){
        this.EmployeeId = EmployeeId;
    }
}
