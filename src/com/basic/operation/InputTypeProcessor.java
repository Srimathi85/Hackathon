package com.basic.operation;

import java.util.Scanner;
//23. WJP to differentiate input as string, int or bool *
public class InputTypeProcessor {
    public void CheckInputDataTye(String inString)
    {
        if(inString.equals("")||inString.trim().equals(""))
            throw new IllegalArgumentException("The given input is Empty.......!");
       if (inString.equalsIgnoreCase("true")||inString.equalsIgnoreCase("false"))
           System.out.println("The given input "+inString+"is a Boolean data  ");
       else {
           int count=0;
           for (int index = 0; index <inString.length() ; index++) {
               if(!(inString.charAt(index)>='0'&&inString.charAt(index)<='9')) {
                   System.out.println("The given input "+inString+"  is a String data");
                   return;
               }
           }
           System.out.println("The given input"+ inString +"  is an  Integer data ");
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input data  ");
        String inString=sc.next();
        InputTypeProcessor inputTypeObj=new InputTypeProcessor();
        inputTypeObj.CheckInputDataTye(inString);
    }
}
