package com.intarray.processor;

public class IntArraySortingProcessor {

    public int[] sortAscendIntArray(int[] inIntArray){
        if(inIntArray.length<=0)
            throw new IllegalArgumentException("The integer array is Empty");
        int temp;
        for (int index = 0; index < inIntArray.length; index++) {
            for (int index2 = index+1; index2 < inIntArray.length; index2++) {
                if(inIntArray[index2]<inIntArray[index]){
                    temp=inIntArray[index];
                    inIntArray[index]=inIntArray[index2];
                    inIntArray[index2]=temp;
                    }
               }
           }
        return inIntArray;
    }

    public static void main(String[] args) {
        IntArraySortingProcessor intArraySortingProcessorObj=new IntArraySortingProcessor();
        IntArrayInputBean intArrayInputBeanObj =new IntArrayInputBean();
        int[] inputIntArray= intArrayInputBeanObj.getInputIntArray();
        System.out.println("The given Integer Array    : ");
        intArrayInputBeanObj.displayIntArray(inputIntArray);
        System.out.println("\nThe Integer Array after sorting in Ascending order   :  ");
       intArrayInputBeanObj.displayIntArray(intArraySortingProcessorObj.sortAscendIntArray(inputIntArray));
    }






}
