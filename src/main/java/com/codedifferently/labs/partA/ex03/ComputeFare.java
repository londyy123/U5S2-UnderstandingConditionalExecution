package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){
        int response = 0;
        /* Put your code in between these comments : Top */
        int fare;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if (age < 11) {
            response+= fare = 3;
        }
        else if (age > 11 && age < 65) {
            response += fare = 5;
        }
        else {
            response+= fare = 3;
        }
        scanner.close();

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        int age = 0;
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */

        int computeOutput = compute(age);
        System.out.println(computeOutput);


    }
}
