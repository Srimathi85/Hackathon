package com.intarray.processor;
// Q5.Given an array of integers check the Palindrome of the series.
public class PalindromeProcessor {
    public boolean checkPalindromeInIntArray(int[] inIntArray){
        if(inIntArray.length<=0)
            throw new  IllegalArgumentException("The Given Integer Array is Empty ");
        int count=0;
        for (int index = 0; index < inIntArray.length/2; index++) {
            if(inIntArray[index]==inIntArray[inIntArray.length-(index+1)])
                count++;
            else
                return  false;
            }
        return true;
    }

    public static void main(String[] args) {
    PalindromeProcessor palindromeProcessorObj=new PalindromeProcessor();
    IntArrayInputBean intArrayInputBeanObj =new IntArrayInputBean();
    int[] intArray= intArrayInputBeanObj.getInputIntArray();
        System.out.println("The given Integer Array is  "  );
    intArrayInputBeanObj.displayIntArray(intArray);
    boolean isPalindrome=palindromeProcessorObj.checkPalindromeInIntArray(intArray);
    if(isPalindrome==true)
        System.out.println("The Integer Array is Palindrome");
    else
        System.out.println("The Integer Array is not  Palindrome");
    }
}
