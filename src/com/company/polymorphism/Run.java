package com.company.polymorphism;

import com.company.abstract_classes_and_Interfaces.GetAllMethods;

public class Run {
    public static void main(String[] args){
        GetAllMethods getAllAbstractMethod = new GetAllMethods();

        //   abstract methods
        getAllAbstractMethod.nexia();
        getAllAbstractMethod.malibu();
        //   Not abstract method but in abstract class
        getAllAbstractMethod.matiz();

        // implemented interface methods
        getAllAbstractMethod.sayName();
        getAllAbstractMethod.yourName();

        // default method in interface implemented but not initialyzed
        getAllAbstractMethod.sayHello();
    }
}
