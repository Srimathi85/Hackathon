package com.integer.processor;

import java.util.Scanner;

public class FactorialCalculator {
    public int calculateFactorialNonRec(int inNum) {
        if(inNum<0)
            throw new IllegalArgumentException("The number should be >= 0  ");
        int result=1;
        if(inNum==0)
            return 1 ;
        for(int index=1;index<=inNum;index++){
        result=result*index;}
        return  result;
    }
    public int calculateFactorialRec(int inNum) {
        if(inNum<0)
            throw new IllegalArgumentException("The number should be >= 0  ");
        int result=1;
        if(inNum==0)
          return  1;
        else
            result=inNum*calculateFactorialNonRec(inNum-1);
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be calculated");
        int inNum=sc.nextInt();
        FactorialCalculator factCalObj=new FactorialCalculator();
        System.out.println("Factorial of "+inNum+"  is   :"+factCalObj.calculateFactorialNonRec(inNum)+"  Using Non Recursive method");
        System.out.println("Factorial of "+inNum+"  is   :"+factCalObj.calculateFactorialRec(inNum)+"  Using  Recursive method");
    }
    }

