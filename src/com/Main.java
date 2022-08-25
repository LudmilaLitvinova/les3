package com;

import com.Car.Car;

public class Main {
    public static void main(String[] args) {

        Employee em1 = new Employee("Лущенко Василь Петрович", "Інженер", "Petr@gmail.com", "3456778", 35);
        System.out.println(em1.getFullName());
        System.out.println("----------------");

        com.package_1.SameName sn1 = new com.package_1.SameName();
        com.package_2.SameName sn2 = new com.package_2.SameName();
        sn1.greeting();
        sn2.greeting();
        System.out.println("----------------");

        Car fiat = new Car();
        fiat.start();

    }
}
