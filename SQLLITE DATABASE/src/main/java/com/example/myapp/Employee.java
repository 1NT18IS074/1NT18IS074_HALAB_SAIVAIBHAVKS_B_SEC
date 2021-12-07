package com.example.myapp;

public class Employee {
    private String employeeName;
    private String employeeDesign;
    private int employeeSalary;

   public Employee()
   {
   }
   public Employee(String employeeName,String employeeDesign,int employeeSalary) {
    this.employeeName=employeeName;
    this.employeeDesign=employeeDesign;
    this.employeeSalary=employeeSalary;
   }

    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeDesign()
    {
        return employeeDesign;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDesign(String employeeDesign) {
        this.employeeDesign = employeeDesign;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
