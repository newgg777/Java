package com.company.abstract_classes_and_Interfaces;

public interface MyInterface {
    public void sayName();

    public default void sayHello(){
        System.out.println("Hi, I am default method in interface");
    }


}
