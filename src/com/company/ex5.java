package com.company;

import sun.awt.geom.AreaOp;

import javax.xml.soap.SOAPPart;
import java.net.SocketOption;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,9,12,10,3};
        int arr2[]={12,5,2,8,7};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                    System.out.println(arr[i]);
            }
        }

    }
}
