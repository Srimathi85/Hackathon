package com.string.processor;

import com.intarray.processor.PalindromeProcessor;

//Q30. Write a function to find out longest palindrome in a given string?
public class PalidromeCount {
    public void checkCountPalindrome(String inString) {
        if (inString .equals("") || inString.trim().equals("")){
            throw new IllegalArgumentException("The input string is not valid string");
        }
        int count = 0;
        String tempInString = inString.replaceAll(" ", "").toLowerCase();
        for (int index = 0; index < tempInString.length() / 2; index++) {
            if (tempInString.charAt(index) == tempInString.charAt(tempInString.length() - (index + 1)))
                count++;
            }
        if(count==inString.length()/2)
        System.out.println("The String   " + inString + "  is  palindrome");
        else
            System.out.println(" The String   " + inString + "  is not  palindrome    ");
        System.out.println("The largest palindrome count in  "+inString+"  is  "+(count*2));
    }

    public static void main(String[] args) {
        PalidromeCount palindromeObj=new PalidromeCount();
        MyStringInClass myStringInClassObj=new MyStringInClass();
        String inString=myStringInClassObj.getString();
       palindromeObj.checkCountPalindrome(inString);
    }

}
