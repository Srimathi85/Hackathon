package com.intarray.processor;

public class MergeTwoArrayProcessor {
    public int[] mergeTwoIntArray(int[] firstIntArray,int[] secondIntArray){
        if(firstIntArray.length<secondIntArray.length||firstIntArray.length==0||secondIntArray.length==0)
            throw new IllegalArgumentException("The given Integer Array is invalid array....!");
        //merging the two array
        for (int index =0; index < secondIntArray.length; index++) {
         firstIntArray[firstIntArray.length-secondIntArray.length+index]=secondIntArray[index];
        }//Sorting the array after merging
        for (int index1 = 0; index1 < firstIntArray.length; index1++) {
            for (int index2 = index1+1; index2 <firstIntArray.length ; index2++) {
                if(firstIntArray[index1]>firstIntArray[index2]){
                    int temp =firstIntArray[index1];
                    firstIntArray[index1]=firstIntArray[index2];
                    firstIntArray[index2]=temp;
                }
            }
        }
        return firstIntArray;
    }

    public static void main(String[] args) {
        MergeTwoArrayProcessor mergeTwoArray=new MergeTwoArrayProcessor();
        IntArraySortingProcessor intArraySortingObj=new IntArraySortingProcessor();
        IntArrayInputBean intArrayInputObj=new IntArrayInputBean();
        int[] firstArray=new int[]{1,2,4,6,8,10,0,0,0,0};
        int[] secondArray=new int[]{3,5,7,9};

        System.out.println("After Merging the two arrays  :  ");
        intArrayInputObj.displayIntArray(mergeTwoArray.mergeTwoIntArray(firstArray,secondArray));
        }
}
