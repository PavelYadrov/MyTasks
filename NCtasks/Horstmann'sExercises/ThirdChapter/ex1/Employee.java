package com.exercises.ex1;

public class Employee implements Measurable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    /*
    @Override
    public String largest(Measurable[] objects) {
        int index=0;
        double sal=0;
        for(int i=0;i<objects.length;i++){
            if (objects[i].getMeasure()>sal){
                sal=objects[i].getMeasure();
                index=i;
            }
        }
        Employee emp = (Employee) objects[index];
        return emp.getName();
    }
    */

    public double getSalary() {
        return salary;
    }
}
