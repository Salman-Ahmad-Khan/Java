import java.util.Scanner;
import java.lang.Math;

public class project {

    /*
     * Mini-Project
     * Let’s create a project where we are trying to ask the user to guess a
     * randomly generated number.
     * 
     * The number is in the range of 1 to 100.
     * 
     * 
     * If the user guesses a number that is greater, we print “The number is too
     * large”.
     * 
     * If the user guesses a number that is smaller, we print “The number is too
     * small”.
     * 
     * If the user is able to correctly guess the number, then we print “Correct
     * Number!”.
     * 
     * 
     * At the end we will print the number that was generated by our Math library.
     * 
     * 
     * LET THE GUESSING BEGIN :)
     */

    public static void main(String[] args) {
        // MINI PROJECT

        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);

        int userNumber = 0;
        System.out.println();
        System.out.println("Input a negative number if you want to QUIT the game.");
        do {

            System.out.print("Guess my number(1-100) : ");

            userNumber = sc.nextInt();

            if (userNumber == myNumber) {

                System.out.println("WOOHOO .. CORRECT NUMBER!!!");

                break;

            }

            else if (userNumber > myNumber) {

                System.out.println("your number is too large");

            }

            else {

                System.out.println("your number is too small");

            }

        } while (userNumber >= 0);

        System.out.print("My number was : ");

        System.out.println(myNumber);
    }
}