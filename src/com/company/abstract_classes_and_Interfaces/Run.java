package com.company.abstract_classes_and_Interfaces;

public class Run {

    public static void main(String[] args) {

        GetAllMethods getAllMethods = new GetAllMethods();

        //  Abstract methods of abstract Class
        getAllMethods.malibu();
        getAllMethods.nexia();

        //  Not Abstract method of abstract class;
        getAllMethods.matiz();

        //  Impemented methods of interface in one class
        getAllMethods.sayName();
        getAllMethods.yourName();

        // Default method with body inside interface
        getAllMethods.sayHello();

    }

}

