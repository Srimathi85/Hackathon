package com.string.processor;
//Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)
public class WordReverseProcessor {
    public String reverseWordInString(String inString){
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The input String is an invalid string!  ... ");
           String  wordRevString="";
            String[] inStringArr=inString.split(" ");
            for (int index =inStringArr.length-1; index >=0 ; index--) {
                wordRevString=wordRevString+inStringArr[index]+" ";
            }
            return wordRevString;
    }

    public static void main(String[] args) {
        WordReverseProcessor wordReverseProcessorObj=new WordReverseProcessor();
        MyStringInClass myStringInClassObj=new MyStringInClass();
        String  inString=myStringInClassObj.getString();
      System.out.println("The String after reversing the word : "+wordReverseProcessorObj.reverseWordInString(inString));
    }
}
