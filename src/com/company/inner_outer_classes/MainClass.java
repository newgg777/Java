package com.company.inner_outer_classes;


public class MainClass {

    // main class method
    public void className(){
        System.out.println("Hi, I am main class");
    }

    // This is Inner class
    static class InnerClass{
        public void className(){
            System.out.println("Hi, I am inner class");
        }
    }


}


//       This is Outer class
class Outer_class{


    // outer class method
    public void className(){
        System.out.println("Hi, I am outer class");
    }


}