package com.bool.processor;

public class BooleanInputBean {
    private boolean[] myBooleanArray;
    private int arrayLength,targetCount;

    public BooleanInputBean(int arrayLength, int targetCount) {
        if(arrayLength<=0 ||targetCount<=0 ||arrayLength>=targetCount){
            throw new IllegalArgumentException("Array length should be >0 and target >0 and array length >=target count");
        }
        this.arrayLength = arrayLength;
        this.targetCount = targetCount;
        myBooleanArray=new boolean[arrayLength];
    }

    public boolean[] getMyBooleanArray() {
        return myBooleanArray;
    }

    public void setMyBooleanArray(boolean[] myBooleanArray) {
        this.myBooleanArray = myBooleanArray;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int getTargetCount() {
        return targetCount;
    }

    public void setTargetCount(int targetCount) {
        this.targetCount = targetCount;
    }
}
