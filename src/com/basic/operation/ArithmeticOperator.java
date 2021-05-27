package com.basic.operation;

import java.util.Scanner;

public class ArithmeticOperator {
    public int multiplyUsingPlus(int inNum1, int inNum2) {
        int result = 0;
        for (int index = 0; index < inNum2; index++) {
            result = result + inNum1;
        }
        return result;
    }

    public int negative(int inNum) {
        int result = 0;
        int temp = inNum < 0 ? 1 : -1;
        while (inNum != 0) {
            inNum += temp;
            result += temp;
        }
        return result;
    }

    public int subtractUsingPlus(int inNum1, int inNum2) {
        int negatVal=negative(inNum2);
        int result=inNum1+negatVal;
        return result;
    }
public  int divideThroughAddition(int inNum1,int inNum2){
        if(inNum2==0)
            throw new IllegalArgumentException("The second number should not be zero");
        int product=0,result=0;
        while(product+inNum2<=inNum1) {
            product+=inNum2;
            result+=1;
        }
        return result;
}
    public static void main(String[] args) {
        ArithmeticOperator arithmeticObj=new ArithmeticOperator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1=sc.nextInt();
        System.out.println("Enter the first number ");
        int num2=sc.nextInt();
        System.out.println(num1+" * "+num2+" = "+arithmeticObj.multiplyUsingPlus(num1,num2));
        System.out.println(num1+" - "+num2+" = "+arithmeticObj.subtractUsingPlus(num1,num2));
        System.out.println(num1+" / "+num2+" = "+arithmeticObj.divideThroughAddition(num1,num2));

    }
}