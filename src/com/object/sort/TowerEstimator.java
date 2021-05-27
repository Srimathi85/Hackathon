package com.object.sort;
//Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons,
//each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus,
// write a method to compute the largest possible number of people in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90)
//(75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) *
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TowerEstimator  {

    public static void main(String[] args) {
    //creating different Person Objects
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Person in the List ");
        int noOfPerson=sc.nextInt();
        Person[] person=new Person[noOfPerson];
        ArrayList<Person> personList=new ArrayList<Person>();
        for (int index = 0; index <noOfPerson ; index++) {
            System.out.println("Enter the height of "+(index+1)+"st/nd/rd/th  person's height and weight ");
            int height=sc.nextInt();
            int weight=sc.nextInt();
            person[index]=new Person(height,weight);
            personList.add(person[index]);
        }
        for (Person index :personList) {
           System.out.println(index.toString());
        }
       // System.out.println(personList.toString());
        System.out.println("After Sorting Based on height :");
        personList.sort(Person::compareTo);
        for (Person index :personList) {
            System.out.println(index.toString());
        }
    }
}
