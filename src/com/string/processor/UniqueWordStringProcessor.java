package com.string.processor;

import java.util.Arrays;
import java.util.HashSet;

//Q15. Given a string print the unique words of the string.
public class UniqueWordStringProcessor {
    public void printUniqueWordInString(String inString){
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The input String is an invalid string!  ... ");
        String[] inStringArr=inString.split(" ");
        HashSet<String> wordsHashSet=new HashSet<>(Arrays.asList(inStringArr));
        System.out.println("The Unique words in the given string ");
        System.out.println(wordsHashSet);
        }
    public static void main(String[] args) {
        MyStringInClass myStringInClassObj=new MyStringInClass();
        UniqueWordStringProcessor uniqueWordObj=new UniqueWordStringProcessor();
        String inString=myStringInClassObj.getString();
        uniqueWordObj.printUniqueWordInString(inString);
    }
    }

