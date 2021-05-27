package com.intarray.processor;

import java.util.Scanner;

public class IntArrayInputBean {
    public int[] getInputIntArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int arrLength = sc.nextInt();
        int[] inIntArray = new int[arrLength];
        for (int index = 0; index < arrLength; index++) {
            System.out.println("Enter the " + (index + 1) + "  element of an Integer Array");
            inIntArray[index] = sc.nextInt();
        }
        return inIntArray;
    }
    public void displayIntArray(int[] intArray){
        System.out.print("[");
        for (int index = 0; index < intArray.length; index++) {
            System.out.print(intArray[index]+"  " );
        }
        System.out.print("]");
    }
}
