import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {

        Random rand = new Random();  
        Scanner scanner = new Scanner(System.in); 
    
    int randomNumber = rand.nextInt(100) + 1;
    //System.out.println("The random number is " + randomNumber);
    int tryCount = 0;
    while(true) {
            System.out.println("Enter a Random Number (1-100):");

    
    int playerGuess = scanner.nextInt();
    tryCount++;
    if (playerGuess == randomNumber) {
        System.out.println("The Number you guessed is correct!");
        System.out.println("Number of attempts: " + tryCount + " attempts");
        break;
    }
    else if(randomNumber > playerGuess) {
        System.out.println("The Number you guessed is lower. Try again!");

    }
    else {
        System.out.println("The Number you guessed is higher. Try again!");

    }
        }
    
    
    }
}