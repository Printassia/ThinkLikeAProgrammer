package Horsy.com.company;

import java.util.Scanner;

/*
Input a number between 1 and 26 and output the
 */
public class AlphabetNumberList {
    public static void main(String[] args) {
        //Create scanner class
        Scanner input = new Scanner(System.in);

        //Ask for input of numbers between 1 and 26 inclusive
        System.out.print("Enter a number 1-26: ");
        int number = input.nextInt();

        //Covert int to char and output its equivalent alphabet symbol
        char output = (char) (number + 'A' - 1);
        System.out.println("Equivalent symbol: " + output);
    }
}
