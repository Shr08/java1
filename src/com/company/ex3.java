package com.company;

public class ex3
{
    public static void main(String[] args)
    {
        StringBuilder strbldr=new StringBuilder("EVENT-EVENT");
        String str="E";
        int c=0;
        int count=findoccur(strbldr,str,c);
        System.out.println(count);

    }
    public static int findoccur(StringBuilder sb, String s,int x)
    {
        if(sb.charAt(0) == s.charAt(0))
        {
            x++;
        }
        sb.deleteCharAt(0);
        if(sb.length()>0)
        {
            x=findoccur(sb,s, x);
        }

        return x;
    }
}