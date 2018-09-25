package com.company;


 class Demo{
    static String FirstName;
    static String LastName;
    static int age = 21;

    static {
        FirstName = "Shreya";
        LastName = "Girdhar";
    }

    public static void agee() {
        System.out.println(age);
    }

}
public class ex7 {
    public static void main(String[] args) {
        Demo ee=new Demo();
        System.out.println("First Nme is "+ee.FirstName);
        System.out.println("Last Name is "+ee.LastName);
        ee.agee();
    }

}
