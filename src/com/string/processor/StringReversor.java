package com.string.processor;

public class StringReversor {
    public  String reverseString(String inString){
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The input String is invalid String/Empty String");
        String reversedString="";
        for (int index = inString.length()-1; index >=0 ; index--) {
            reversedString=reversedString+inString.charAt(index);
        }
        return reversedString;
    }


    public static void main(String[] args) {
        MyStringInClass myInStringObj=new MyStringInClass();
        StringReversor reversorObj=new StringReversor();
        String inString=myInStringObj.getString();
        System.out.println("The Reversed String  :  "+ reversorObj.reverseString(inString));
    }
}
