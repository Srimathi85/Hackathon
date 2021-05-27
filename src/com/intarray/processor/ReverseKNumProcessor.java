package com.intarray.processor;

import java.util.Scanner;

//Q 62. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers,
// the number will be based on var k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
public class ReverseKNumProcessor {
    public int[] reverseKNumInIntArray(int kVal,int[] inIntArr){
        if(kVal>inIntArr.length||kVal<0||inIntArr.length<0)
            throw new IllegalArgumentException("The K value and intArray length  should be greater than 0 and k value <= array length");
        int repCount= inIntArr.length/kVal;
        int count=0;
        while(repCount>0){
        for (int index = 0; index < kVal/2; index++) {
            int temp=inIntArr[index+count];
            inIntArr[index+count]=inIntArr[count+kVal-(1+index)];
            inIntArr[kVal+count-(1+index)]=temp;
            }
            count=count+kVal;
        repCount--;
        }
       return inIntArr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseKNumProcessor reverseKNumObj=new ReverseKNumProcessor();
        IntArrayInputBean intArrayInputBeanObj=new IntArrayInputBean();
        int[] inIntArray=intArrayInputBeanObj.getInputIntArray();
        System.out.println("The given integer array  : ");
        intArrayInputBeanObj.displayIntArray(inIntArray);
        System.out.println("\nEnter the value of k (ie) the number of elements to be reversed");
        int kValue=sc.nextInt();
        System.out.println("After Reversing "+kValue+" element :");
        intArrayInputBeanObj.displayIntArray(reverseKNumObj.reverseKNumInIntArray(kValue,inIntArray));

    }
}
