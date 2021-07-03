package com.company.abstract_classes_and_Interfaces;

public class GetAllMethods extends Vehicle implements MyInterface,YourName {

         /*      Abstract method       */

    @Override
    public void malibu() {
        System.out.println("Malibu abstract method");
    }

    @Override
    public void nexia() {
        System.out.println("Nexia - abstract method");
    }

    /*         Not abstract method in abstract class            */

    @Override
    public void matiz() {
        System.out.println("New not Abstract method");
    }


    /*        Interface Methods          */

    @Override
    public void sayName() {
        System.out.println("Umrbek");
    }

    @Override
    public void yourName() {
        System.out.println("Ulug'bek");
    }


}
