package com.basic.operation;

import java.util.Scanner;

//23. WJP to differentiate input as string, int or bool *
public class MyBasicClass {
    public void getAndPrintInputs(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the integer input value : ");
        int intVar=sc.nextInt();       //getting Integer data input from User and stored it in  intVar
        System.out.println("Enter the String input");
        String stringVar=sc1.nextLine();  //getting String data input from user and stored it in stringVar
        System.out.println("Enter the boolean input ");
        boolean booleanVar=sc.nextBoolean(); //getting boolean  type input from user and stored it in booleanVar
        System.out.println("The given boolean data  is "+booleanVar); //displaying the value of boolean variable
        System.out.println("The given String data  is "+stringVar);//displaying the value of String variable
        System.out.println("The given integer data  is "+intVar);//displaying the value of integer variable
    }

    public static void main(String[] args) {
        MyBasicClass myObj=new MyBasicClass();
        myObj.getAndPrintInputs();
    }

}
