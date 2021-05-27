package com.intarray.processor;

import com.basic.operation.InputTypeProcessor;

import java.util.Scanner;

//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements. *
public class BinarySearchProcessor {
    public int searchBinary(int[] intArr,int target){
        if(intArr.length<=0|| target<0)
            throw new IllegalArgumentException("The input integer array or target is invalid ");
        int startIndex=0,endIndex=intArr.length-1,targetIndex=-1;
        while (startIndex<=endIndex){
           int midIndex=(startIndex+endIndex+1)/2;
        if(target<intArr[midIndex]){
        endIndex=midIndex-1;
        }
        else  if(target>intArr[midIndex]){
            startIndex=midIndex+1;
        }
        else if (target==intArr[midIndex]){
            targetIndex=midIndex;
            break;
        }
        }
       return targetIndex;
    }

    public static void main(String[] args) {
        BinarySearchProcessor binarySearchObj=new BinarySearchProcessor();
        IntArrayInputBean intArrayInputObj=new IntArrayInputBean();
        Scanner sc=new Scanner(System.in);
        int[] intArray=intArrayInputObj.getInputIntArray();
        System.out.println("The given integer array : ");
        intArrayInputObj.displayIntArray(intArray);
        System.out.println("Enter the element of an integer array  to be found ");
        int target=sc.nextInt();
        int targetIndex=binarySearchObj.searchBinary(intArray,target);
        if(targetIndex<0)
            System.out.println("The target value " + target + "  is  not found ");
        else
            System.out.println("the target value "+target+"  is found in "+(targetIndex+1)+"  th position ");
    }
}
