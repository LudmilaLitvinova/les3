package com.main;

import com.car.Car;
import com.employee.Employee;
import com.package_1.SameName;

public class Main {
    public static void main(String[] args) {

        Employee em1 = new Employee("Лущенко Василь Петрович", "Інженер", "Petr@gmail.com", "3456778", 35);
        System.out.println(em1.getFullName());
        System.out.println("----------------");

        SameName sn1 = new SameName();
        com.package_2.SameName sn2 = new com.package_2.SameName();
        sn1.greeting();
        sn2.greeting();
        System.out.println("----------------");

        Car fiat = new Car();
        fiat.start();

    }
}
