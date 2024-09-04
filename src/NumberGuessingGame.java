import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I'm thinking of a number between 1 to 100");
    System.out.println("Please select the difficulty level : ");
    System.out.println("1.Easy(10 Chance)");
    System.out.println("2.Medium(5 Chance)");
    System.out.println("3.Hard(3 Chance)");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Choice : ");
    int option = sc.nextInt();
    int attempts = 0;
    switch (option) {
      case 1:
        System.out.println("You have selected the easy difficulty level.");
        attempts = 10;
        break;

      case 2:
        System.out.println("You have selected the medium difficulty level.");
        attempts = 5;
        break;

      case 3:
        System.out.println("You have selected the large difficulty level.");
        attempts = 3;
        break;

      default:
        System.out.println("You have choosed a wrong option and starting the game with easy option");
        break;
    }
    Random num = new Random();
    boolean guessedCorrectly = false;
    int randomNumber = num.nextInt(100)+1;
    int attemptsUsed = 0;
    while(attemptsUsed<attempts){
      System.out.print("Enter a number : ");
      int userNum = sc.nextInt();
      attemptsUsed++;

      if(userNum == randomNumber){
        guessedCorrectly = true;
        break;
      } else if(userNum<randomNumber){
        System.out.println("Incorrect! The number is greater than "+userNum);
        //System.out.println("Remaining Attempt "+(attempts-attemptsUsed));
      } else{
        System.out.println("Incorrect! The number is lesser than "+userNum);
        //System.out.println("Remaining Attempt "+(attempts-attemptsUsed));
      }
      System.out.println();
    }

    if(guessedCorrectly==true){
      System.out.println("Congratulation! You have guessed the number in "+attemptsUsed);
    } else{
      System.out.println("You Have Exceeded Your Attempts, Try Again");
      System.out.println("The Random Number is "+randomNumber);
    }
  }
}
