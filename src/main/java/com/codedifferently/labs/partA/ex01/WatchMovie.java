package com.codedifferently.labs.partA.ex01;

public class WatchMovie {
    public static String watchMovie() {
        String response ="";
        /* Your code goes here*/
        int moviePrice = 12;
        int rating = 5;

        if (moviePrice >= 12) {
            System.out.println("I am interested in the movie.");
        }
        else {
            System.out.println("I am not interested in the movie.");
        }

        response += ("Enter the movie ticket price \n");
        return response;

    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);


    }
}
