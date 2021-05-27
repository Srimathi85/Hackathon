package com.bool.processor;

public class BooleanProcessorClient {

    public static void main(String[] args) {
        int total = 3;
        int target = 2;
        Processor proc = new Processor();
        BooleanInputBean ibeanObj = proc.getBooleanInputBean(total, target);
        boolean val = proc.process(ibeanObj);
        if (val == true) {
            System.out.println("Found at least " + target + " True Values");
            return;
        }
        System.out.println("Not Found at " +
                "least " + target + " True Values");

    }
}
