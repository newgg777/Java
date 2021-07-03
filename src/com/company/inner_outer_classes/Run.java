package com.company.inner_outer_classes;

public class Run {


    public static void main(String[] args){

        MainClass mainClass = new MainClass();
        Outer_class outer_class = new Outer_class();
        MainClass.InnerClass innerClass = new MainClass.InnerClass();

        // MainClass
        mainClass.className();

        // OuterClass
        outer_class.className();

        // InnerClass
        innerClass.className();


    }
}
