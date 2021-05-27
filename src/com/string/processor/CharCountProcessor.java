package com.string.processor;

import java.util.HashMap;

//Q19. WJP to display number of occurrence of all character
public class CharCountProcessor {
    public void countCharInString(String inString) {
        if (inString.equals("") || inString.trim().equals(""))
            throw new IllegalArgumentException("The input string is empty/invalid....!");
        char charInString;
        String tempString = inString;
        int index = 0;
        while (index < tempString.length()) {
            charInString = tempString.charAt(index);
            int count = tempString.length();
            tempString = tempString.replaceAll(charInString + "", "");
            count = count - tempString.length();
            System.out.println("The character  " + charInString + "  is repeating  " + count + "  time(s)");
        }

    }

    public static void main(String[] args) {
        CharCountProcessor charCountObj=new CharCountProcessor();
        MyStringInClass myStringInObj=new MyStringInClass();
        String inString=myStringInObj.getString();
        charCountObj.countCharInString(inString);
    }
}
