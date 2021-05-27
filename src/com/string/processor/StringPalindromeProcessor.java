package com.string.processor;

public class StringPalindromeProcessor {
    public void checkStringPalindrome(String inString) {
        if (inString .equals("") || inString.trim().equals("")){
            throw new IllegalArgumentException("The input string is not valid string");
    }
        int count = 0;
        String tempInString = inString.replaceAll(" ", "").toLowerCase();
        for (int index = 0; index < tempInString.length() / 2; index++) {
            if (tempInString.charAt(index) == tempInString.charAt(tempInString.length() - (index + 1)))
                count++;
            else {
                System.out.println("The String " + inString + "  is not palindrome");
                return;
            }
        }
        System.out.println("The String   " + inString + "  is  palindrome");
    }

    public static void main(String[] args) {
        StringPalindromeProcessor palindromeProcessorObj=new StringPalindromeProcessor();
        MyStringInClass myStringInClassObj=new MyStringInClass();
        String inString=myStringInClassObj.getString();
        palindromeProcessorObj.checkStringPalindrome(inString);
    }
}