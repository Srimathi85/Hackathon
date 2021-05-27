package com.string.processor;

public class StringCharCountProcessor {
    public void countUpperLowerNumberInString(String inString){
        if(inString.equals("")||inString.trim().equals(""))
        throw new IllegalArgumentException("The given input string  is empty/invalid");
        int countLower=0,countUpper=0,countNumber=0;
        for (int index = 0; index < inString.length(); index++) {
            char charInString=inString.charAt(index);
            if(charInString>='a'&&charInString<='z')
                countLower++;
            else if(charInString>='A'&&charInString<='Z')
                countUpper++;
            else  if(charInString>='0'&&charInString<='9')
                countNumber++;
        }
        System.out.println("The number of Lowercase Letters : "+countLower);
        System.out.println("The number of Uppercase Letters : "+countUpper);
        System.out.println("The number of Number Letters : "+countNumber);
    }

    public static void main(String[] args) {
        StringCharCountProcessor stringCharCountObj=new StringCharCountProcessor();
        MyStringInClass myStringInObj=new MyStringInClass();
        String inString=myStringInObj.getString();
        stringCharCountObj.countUpperLowerNumberInString(inString);
    }
}
