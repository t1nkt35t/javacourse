package com.example.javacourse2.regex;

import lombok.AllArgsConstructor;
import lombok.Data;

public class PrintfEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Lol", "Kekov", 1000, 0.12);
        Employee emp2 = new Employee(33, "Rofl", "Poopin", 2500, 0.15);
        Employee emp3 = new Employee(112, "Kek", "Noobenko", 1750, 0.1);
        empInfo(emp1);
        empInfo(emp2);
        empInfo(emp3);

    }

    static void empInfo(Employee employee){
//        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary*(1+ employee.bonusPct));
        String newS = String.format("%03d \t %-12s \t %-12s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary*(1+ employee.bonusPct));
        System.out.println( newS);
    }
}
@Data
@AllArgsConstructor
class Employee{
    int id;
    String name;
    String surname;
    int salary;
    Double bonusPct;

}
