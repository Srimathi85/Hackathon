package com.intarray.processor;
//Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. *
public class UniqueDuplicateNumCounter {
    public void printUniqueNum(int[] intArray){
        System.out.println("Unique Number  :  ");
        for (int index = 0; index < intArray.length; index++) {
            for (int index2 = 0; index2 < index; index2++) {
                if (intArray[index] == intArray[index2])
                  return;
            }
            System.out.print(intArray[index]+",");
            }
        }
        public void printDuplicateRepeatCount(int[] intArray){
            for (int index = 0; index < intArray.length ; index++) {
                        for (int index2 =0; index2 <=index||index==0; index2++) {
                        if (intArray[index2] == intArray[index]) {
                         return;
                        }
                    }
                           int count = 1;
                            for (int index3 = 0; index3 < intArray.length && index3!=index; index3++) {
                                if (intArray[index] == intArray[index3])
                                    count=count+1;
                            }
                            if (count >= 2)
                                System.out.println("Duplicate Number " + intArray[index] + "is repeating " + count + "  time(s)");
                        }
                    }
                    public static void main(String[] args) {
        UniqueDuplicateNumCounter uniqueDuplicateNumCounterObj=new UniqueDuplicateNumCounter();
        IntArrayInputBean intArrayInputObj=new IntArrayInputBean();
        int[] inArr=intArrayInputObj.getInputIntArray();
        uniqueDuplicateNumCounterObj.printUniqueNum(inArr);
        uniqueDuplicateNumCounterObj.printDuplicateRepeatCount(inArr);


    }

}
