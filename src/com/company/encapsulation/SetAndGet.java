package com.company.encapsulation;


public class SetAndGet {
    // init object
    DataFields dataFields = new DataFields();


    // Setting a data to our private fields
    public void setForAllFields(){
        dataFields.setName("Umrbek");
        dataFields.setAge(22);
    }


    // Getting a data from our private fields
    public void getForAllFields(){
        System.out.println("Your name is : " + dataFields.getName());
        System.out.println("And age :" + dataFields.getAge());
    }


}
