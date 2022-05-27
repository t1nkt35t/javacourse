package com.example.javacourse2.reflection;

import lombok.*;

//@Data
@NoArgsConstructor
@RequiredArgsConstructor
//@AllArgsConstructor
@ToString
public class Employee {
    @NonNull
    public int id;
    @NonNull
    public String name;
    @NonNull
    public String department;
    private double salary = 1000;

    private void changeDepartment(String newDep){
        department=newDep;
        System.out.println("new dep is :" + department);
    }

    public void incrSal(){
        salary*=2;
    }
}
