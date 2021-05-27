package com.intarray.processor;
//Q6. WJP to perform ascending order Selection sort
public class SelectionSortProcessor {
    public int[] sortSelection(int[] intArray){
        int minIndex,temp;
        for (int index = 0; index < intArray.length; index++) {
            minIndex=index;
            for (int index2 = index+1; index2 <intArray.length; index2++) {
              if(intArray[index2]<intArray[minIndex])
                  minIndex=index2;
            }
            temp=intArray[index];
            intArray[index]=intArray[minIndex];
            intArray[minIndex]=temp;
        }
        return intArray;
    }

    public static void main(String[] args) {
        SelectionSortProcessor mySelectionSortObj=new SelectionSortProcessor();
        IntArrayInputBean intArrayInputBean=new IntArrayInputBean();
        int[] inIntArray=intArrayInputBean.getInputIntArray();
        System.out.println("The  Entered Integer Array  : ");
        intArrayInputBean.displayIntArray(inIntArray);
        System.out.println("\nThe Sorted Array using Selection Sort : ");
        intArrayInputBean.displayIntArray(  mySelectionSortObj.sortSelection(inIntArray));
    }
}
