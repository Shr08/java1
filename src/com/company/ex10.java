package com.company;

import javax.xml.soap.SOAPPart;
import java.net.StandardSocketOptions;

class oper{
    void add(int a, int b){
        System.out.println("Sum of 2 integers is "+ (a+b));
    }
    void add(float a,float b)
    {
        System.out.println("Sum of 2 floats "+ (a+b));
    }
    void mulp(float a, float b)
    {
        System.out.println("Multiplication of 2 float "+ (a*b));
    }
    void mulp(int a,int b)
    {
        System.out.println("Multiplication of 2 int "+ (a*b));
    }
    void stri(String str1, String str2){
        System.out.println("Strings are "+str1+str2);
    }
    void stri(String str1, String str2, String str3){
        System.out.println("Strings are "+str1+str2+str3);
    }
}
public class ex10 {
    public static void main(String[] args) {
          int i1=3,i2=5;
          float f1=2.5f, f2=3.4f;
          String str1="hi", str2="hello", str3="bye";
          oper op = new oper();
          op.add(i1,i2);
          op.add(f1,f2);
          op.mulp(f1,f2);
          op.mulp(i1,i2);
          op.stri(str1,str2);
          op.stri(str1,str2,str3);
    }
}
