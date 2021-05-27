package com.basic.operation;

import com.string.processor.BasicStringClass;

import java.util.Scanner;

public class MyIntBasicClass {
    public String convertIntToString(int  inNum){
     String strVal=String.valueOf(inNum);
        return  strVal;
    }

    public static void main(String[] args) {
        MyIntBasicClass intBasicObj=new MyIntBasicClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer value ");
        int inNum=sc.nextInt();
        System.out.println("The String value  :  "+intBasicObj.convertIntToString(inNum));
    }
}

