package com.company;

public class ex6 {
    public static void main(String[] args) {
        int arr[]={2,2,3,5,6,4,4,6,5,8,3};
        int ans = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans = ans^arr[i];
        }

        System.out.println(ans);
    }
}
