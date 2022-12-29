package com.dependancyInjection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Employee {
    private int employeeID;
    private String employeeName;
    private String empDeptName;
    private String empAddress;
   // @Autowired(done with normal autowiring )
    private Technologies technologies;

    //@Autowired
    // this is by constructor injection
    public Employee(Technologies technologies) {
        this.technologies = technologies;
    }

    public Technologies getTechnologies() {
        return technologies;
    }
    @Autowired
    // this is by setter injection
    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
    }

    public Employee(int employeeID, String employeeName, String empDeptName, String empAddress) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.empDeptName = empDeptName;
        this.empAddress = empAddress;
    }

    public Employee() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpDeptName() {
        return empDeptName;
    }

    public void setEmpDeptName(String empDeptName) {
        this.empDeptName = empDeptName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void toDisplay(){
        System.out.println("hello there, I am from village areas 😁😁😁");
        technologies.Totechnologies();
    }
}
