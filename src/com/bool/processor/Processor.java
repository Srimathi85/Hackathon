package com.bool.processor;

import java.util.Scanner;

public class Processor {

    public BooleanInputBean getBooleanInputBean(int total, int targetCount){
        BooleanInputBean inputBean=new BooleanInputBean(total,targetCount);
        Scanner sc=new Scanner(System.in);
        for(int index=0;index<total;index++){
            System.out.println("Enter the value of "+index +1+"rd/th of boolean variable");
            boolean val =sc.nextBoolean();
            inputBean.getMyBooleanArray()[index]=val;
        }
        return inputBean;
    }

    public boolean process(BooleanInputBean ibean)throws IllegalArgumentException {
       if(!validateInput(ibean)){
           throw new IllegalArgumentException("Given Input is Not valid ");
       }
       int count=0;
       for(boolean val :ibean.getMyBooleanArray()){
           if(val==true){
              count++;
              if(count== ibean.getTargetCount()){
                  return true;
              }
           }
       }
       return false;

    }

    private boolean validateInput(BooleanInputBean ibean) {
        if(ibean==null || ibean.getTargetCount()<=0 ||ibean.getArrayLength()!=ibean.getMyBooleanArray().length){
            return false;
        }
        return true;
    }
}
