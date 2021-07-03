package com.company.polymorphism;

/*     E is child class of B  */
public class E extends B {

    // Overriding Main class A method but in is inside B class
    @Override
    public void aMethod() {
        System.out.printf("Rate: 60");
    }

}
