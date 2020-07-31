package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

int n=19,count=0;
String prime="",p="";

    for(int i=2;i<n;i++) {
        if(n%i==0)
        {
            // System.out.println("not prime");
            count++;
            break;

        }



    }
    if(count==0)
    {
        System.out.println("number is prime");
    }else{
        System.out.println("not prime");
    }








    }
}
