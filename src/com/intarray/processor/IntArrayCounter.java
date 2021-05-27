package com.intarray.processor;

import java.util.ArrayList;

//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers
public class IntArrayCounter {
    private void printUniqueNumbers(int[] intArr) {
        if (intArr.length <= 0)
            throw new IllegalArgumentException("The integer array is Empty");
//        ArrayList<Integer> myResultArrList=new ArrayList<Integer>();
        System.out.println("Unique numbers in the array : ");
        for (int index = 0; index < intArr.length; index++) {
            int index2;
            for (index2 = 0; index2 <index ; index2++) {
                if (intArr[index] == intArr[index2])
                    break;
            }
                if(index==index2) {
                    System.out.print(intArr[index] + " ");
                    countDuplicateOccurrance(intArr,intArr[index]);
                }
          }
    }
    public void countDuplicateOccurrance(int[] inArray,int currentArrElement){
        if (inArray.length <= 0)
            throw new IllegalArgumentException("The integer array is Empty");
               //for (int index = 0; index <inArray.length ; index++) {
            int countOfNum=0;
            for (int index2 = 0; index2 <inArray.length ; index2++) {
                if (currentArrElement == inArray[index2]) {
                    countOfNum++;
                }
            }
                if(countOfNum>1)
                    System.out.println(currentArrElement+" is repeating "+countOfNum+"  times");
            }
            public void countDuplicateOccurrance2(int[] intArray) {
                if (intArray.length <= 0)
                    throw new IllegalArgumentException("The integer array is Empty");
                for (int index = 0; index < intArray.length; index++) {
                    int countOfNum = 0;
                        for (int index2 = 0; index2 < intArray.length; index2++) {
                            if (intArray[index] == intArray[index2]) {
                                countOfNum++;
                            }
                        }
                        if (countOfNum > 1)
                            System.out.println(intArray[index] + " is repeating " + countOfNum + "  times");
                    }
                }

    public static void main(String[] args) {
        IntArrayInputBean inputBeanObj=new IntArrayInputBean();
        IntArrayCounter intArrayCounterObj=new IntArrayCounter();
        int[] inputArray=inputBeanObj.getInputIntArray();
        intArrayCounterObj.printUniqueNumbers(inputArray);
        intArrayCounterObj.countDuplicateOccurrance2(inputArray);
    }
}
