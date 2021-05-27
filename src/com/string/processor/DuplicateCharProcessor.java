package com.string.processor;
//Q18. WJP to display duplicate character in string *
public class DuplicateCharProcessor {
    public String printDuplicateChar(String inString){
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The given input string is empty/invalid");
        String tempString=inString.replaceAll(" ","");
       String duplicateCharInString="";
        char charInString;
        for (int index = 0; index < tempString.length(); index++) {
            charInString=tempString.charAt(index);
            if((tempString.indexOf(charInString)!=tempString.lastIndexOf(charInString))){
            duplicateCharInString=duplicateCharInString+charInString;
            tempString=tempString.replaceAll(charInString+"","");
        }
        }
return duplicateCharInString;
    }

    public static void main(String[] args) {
       DuplicateCharProcessor duplicateCharObj=new DuplicateCharProcessor();
       MyStringInClass myStringObj=new MyStringInClass();
       String inString=myStringObj.getString();
        System.out.println("The Duplicate character in the string  "+inString+"  is   "+duplicateCharObj.printDuplicateChar(inString));
    }
}