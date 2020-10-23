package Horsy.com.company;

/*
Using the same rule as the shapes programs from earlier in the chapter (only
two output statements—one that outputs the hash mark and one that outputs
an end-of-line), write a program that produces the following shape:
        ########
         ######
          ####
           ##

 */

public class DownwardsTriangle {
    public static void main(String[] args) {
        //Display rows
        for(int row = 1; row <= 4; row++){
            //Add a space after each new line of hash tags
            for(int space = 1; space <= row; space++){
                System.out.print(" ");
            }
            //Display the hash tags in descending order
            for (int hash = 1; hash <= 10 - row * 2; hash++){
                System.out.print("#");
            }
            //New Line
            System.out.println();

        }
    }
}
