package com.company;
import java.lang.String;
public class ex8
{
    public static void main(String[] args) {
        String str = "WelcomeHome";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        StringBuffer buff = new StringBuffer(rev);
        buff.delete(4, 9);
        System.out.println(buff);
    }

}
