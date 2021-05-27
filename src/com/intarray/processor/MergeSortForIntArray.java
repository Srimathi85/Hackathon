package com.intarray.processor;
//Q29. WJP to perform Merge sort using recursion *
public class MergeSortForIntArray {
    public int[] divideArrayMergeSort(int[] inArr) {
        if (inArr.length <= 0)
            throw new IllegalArgumentException("Enter the valid Array (ie) Array size should be greater than 1");
        else{
            if(inArr.length <= 1)
            return inArr;
            int[] resultArray;
            int leftArrayLength = inArr.length / 2;
            int rightArrayLength = inArr.length - leftArrayLength;
            int[] leftArray = new int[leftArrayLength];
            int[] rightArray = new int[rightArrayLength];
            for (int index = 0; index < leftArrayLength; index++) {
                leftArray[index] = inArr[index];
            }
            for (int index = 0; index < rightArrayLength; index++) {
                rightArray[index] = inArr[leftArrayLength + index];
            }
            leftArray = divideArrayMergeSort(leftArray);
            rightArray = divideArrayMergeSort(rightArray);
            resultArray = mergeArray(leftArray, rightArray);
            return resultArray;
        }
    }
    public int[] mergeArray(int[] leftArray, int[] rightArray) {
        int[] sortedArray = new int[(leftArray.length + rightArray.length)];
        int leftArrayIndex = 0, rightArrayIndex = 0, sortedArrayIndex = 0;
        while (leftArrayIndex < leftArray.length || rightArrayIndex < rightArray.length)
        {
            if (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
                if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                    sortedArray[sortedArrayIndex++] = leftArray[leftArrayIndex++];
                } else {
                    sortedArray[sortedArrayIndex++] = rightArray[rightArrayIndex++];
                }
            } else if (leftArrayIndex < leftArray.length) {
                sortedArray[sortedArrayIndex++] = leftArray[leftArrayIndex++];
            } else if (rightArrayIndex < rightArray.length) {
                sortedArray[sortedArrayIndex++] = rightArray[rightArrayIndex++];
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        MergeSortForIntArray mergeSortForIntArrayObj=new MergeSortForIntArray();
        IntArrayInputBean intArrayInputObj=new IntArrayInputBean();
        int[] inArray=intArrayInputObj.getInputIntArray();
        System.out.println("The Input Array : ");
        intArrayInputObj.displayIntArray(inArray);
        System.out.println("After Sorting Using Merge Sort \n");
        intArrayInputObj.displayIntArray(mergeSortForIntArrayObj.divideArrayMergeSort(inArray));
    }

}