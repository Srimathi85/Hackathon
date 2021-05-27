package com.string.processor;

import java.util.Scanner;

//16. Write a method that will remove given character from the StringQ?
public class RemoveCharProcessor {
    public String removeChar(char inChar,String inString){
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The given input string  is empty/invalid");
        String modInString;
        modInString=inString.replaceAll(inChar+"","");
        System.out.println("The String  "+inString+ " after removing the char "+inChar+" is "+modInString);
        return modInString;
    }

    public static void main(String[] args) {
        RemoveCharProcessor removeCharObj=new RemoveCharProcessor();
        MyStringInClass myStringObj=new MyStringInClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character that will be removed from input String");
        char removeChar=sc.next().charAt(0);
        String inString=myStringObj.getString();

        removeCharObj.removeChar(removeChar,inString);
    }
}
