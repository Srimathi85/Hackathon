package com.intarray.processor;

public class QuickSorterIntArray {
    public void swap(int iEle1,int iEle2){
        int iTemp;
        iTemp=iEle1;
        iEle1=iEle2;
        iEle2=iEle1;
    }
    public int[] sortQuick(int[] inIntArray) {
        if (inIntArray.length <= 0 || inIntArray == null)
            throw new IllegalArgumentException("The input Integer array is empty....!");
       int partitionIndex=partition(inIntArray,0,inIntArray.length-1);
           partition(inIntArray,0,partitionIndex-1);
           partition(inIntArray,partitionIndex+1,inIntArray.length-1);
       return inIntArray;

    }
    public int partition(int[] inIntArray,int startIndex,int endIndex){
        int pivot=inIntArray[endIndex];
        for (int index = startIndex; index < endIndex; index++) {
            if (inIntArray[index] < pivot) {
                int temp = inIntArray[index];
                inIntArray[index] = inIntArray[startIndex];
                inIntArray[startIndex] = temp;
                startIndex++;
            }
        }
        inIntArray[endIndex]=inIntArray[startIndex];
        inIntArray[startIndex]=pivot;
             return startIndex;
    }

    public static void main(String[] args) {
        QuickSorterIntArray quickSortObj=new QuickSorterIntArray();
        IntArrayInputBean inputBeanObj=new IntArrayInputBean();
        int[] inArray=inputBeanObj.getInputIntArray();
        System.out.println("The given array  :  ");
        inputBeanObj.displayIntArray(inArray);
        System.out.println("After sorting :  ");
        inputBeanObj.displayIntArray(quickSortObj.sortQuick(inArray));

    }
}
