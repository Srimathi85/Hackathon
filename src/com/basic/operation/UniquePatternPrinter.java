package com.basic.operation;
//Q24. Write a program which inputs a positive natural number N and prints the possible consecutive number
// combinations, which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4
public class UniquePatternPrinter {
    public void printPatternOfConsecutiveNumber(int inNumber) {
        int sum = 0;
        for (int index1= 0; index1 <inNumber; index1++) {
           for (int index = 1; index < inNumber; index++) {
                sum += index;
            }
        }
    }
}
