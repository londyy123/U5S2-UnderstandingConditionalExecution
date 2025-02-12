package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){
        int response = 0;
        /* Put your code in between these comments : Top */
        int userAge;
        int fare;
        if (userAge < 11) {
            fare = 3;
        }
        else if (userAge > 11 && userAge < 65) {
            fare = 5;
        }
        else {
            fare = 3;
        }

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
