package com.string.processor;

import java.util.Scanner;

//Q22. WJP to convert  string to int
public class BasicStringClass {
    public int convertStringToInt(String inString){
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The given input string  is empty/invalid");
        int intVal=Integer.parseInt(inString);
        return  intVal;
       }

    public static void main(String[] args) {
        BasicStringClass basicStringObj=new BasicStringClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String inString=sc.next();
        System.out.println("The integer value  :  "+basicStringObj.convertStringToInt(inString));
    }
}
