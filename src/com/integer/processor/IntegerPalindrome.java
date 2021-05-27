package com.integer.processor;
//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string? *

import java.util.Scanner;

public class IntegerPalindrome {
    public boolean isPalindromeNumber(int inNum) {
        if (inNum < 0)
            throw new IllegalArgumentException("The input number should be greater than 0 ");
        int revInNum = 0, tempInNum = inNum, count = 1;
        while (tempInNum > 0) {
            revInNum = (tempInNum % 10) + (revInNum * 10);
            //count = count * 10;
            tempInNum = tempInNum / 10;
        }
        if (inNum == revInNum) {
            System.out.println("The given number " + inNum + "  is palindrome ");
            return true;
        } else {
            System.out.println("The given number " + inNum + "  is  not palindrome ");
            return  false;
        }
    }

    public static void main(String[] args) {
        IntegerPalindrome intPalindObj=new IntegerPalindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose palindrome has to check");
        int inNum=sc.nextInt();
        intPalindObj.isPalindromeNumber(inNum);



    }
}
