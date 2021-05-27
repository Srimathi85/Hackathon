package com.filereadwrite.operation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FileReaderWriter {
    public void createFile(String fileName) {
        try {
            File fileObj = new File(fileName);
            if (fileObj.createNewFile())
                System.out.println("File is created successfully in the name  :  " + fileObj.getName());
            else
                System.out.println("File  already exists ");

        } catch (IOException e) {
            System.out.println("File is not created..Error");
            e.printStackTrace();
        }
    }

    public void writeIntoFile(String fileName) {
        try {
            PrintWriter pw=new PrintWriter(fileName);
            pw.println("My name is Srimathi Panneer Pandi" );
             pw.println("My Husband name is Panneer Pandi" );
                    pw.println("I have two kids" );
                  pw.println("My daughter name is Srisudarshana" );
                    pw.println("My son name is Gnana Sudaarshan");
                    pw.println("My daughter is studying 4th grade");
                    pw.println("My son is studying 2nd grade");
                    pw.println("I have completed ME in communication Systems");
                    pw.println("My husband is working as a Software Architect");
                    pw.println("I am a homemaker");
            System.out.println("Writing into the file is done successfully");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println("Error occurred....!");
            e.printStackTrace();
        }

    }

    public void writeReverseOrder(String readFileName, String writeFileName) throws IOException {
        try {
            PrintWriter pw=new PrintWriter(writeFileName);
            BufferedReader br=new BufferedReader(new FileReader(readFileName));
            int noOfLines =0;
            ArrayList<String> myArrayList=new ArrayList<>();
            String currentString= br.readLine();
             while (currentString!=null) {
             myArrayList.add(currentString);
                noOfLines++;
                System.out.println("Number of lines : "+noOfLines);
                 currentString= br.readLine();
            }
            Collections.reverse(myArrayList);
            for (String content:myArrayList ) {
                pw.println(content);
            }
            pw.flush();
            System.out.println("Writing is done successfully in reverse order");
            br.close();
           pw.close();
        } catch (IOException ioException) {
            System.out.println("Error Occurred cannot write in the file");
            ioException.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
FileReaderWriter myFileRWObj=new FileReaderWriter();
//myFileRWObj.createFile("SrimathiDetails.txt");
myFileRWObj.writeIntoFile("SrimathiDetails.txt");
myFileRWObj.writeReverseOrder("SrimathiDetails.txt","SrimathiDetailsInReverse.txt");
    }
}
