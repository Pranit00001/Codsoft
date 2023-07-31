package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) 
    {
        int numberGenerated = randomNumberGenerate();
        int attempts = 0;
        
        System.out.println("******************Welcome to NUMBER GAME******************");
        System.out.println("***********************************************************");
        while (attempts < MAX_ATTEMPTS)
        {
        	
            int guess = getGuessFromUser();
            if (compareGuesses(guess, numberGenerated ))
            {
                break;
            }
            else
            {
                attempts++;
            }
        }
        displayScore(attempts);
    }

    private static int randomNumberGenerate()
    {
        Random random = new Random();
        return random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
    }

    private static int getGuessFromUser()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();
        return guess;
    }

    private static boolean compareGuesses(int guess, int generatedNumber) 
    {
        return guess == generatedNumber;
    }

    private static void displayScore(int attempts)
    {
        if (attempts == MAX_ATTEMPTS) 
        {
            System.out.println("Sorry, you didn't guess the number in 3 attempts ");
        }
        else
        {
            System.out.println("You guessed the number in " + attempts + " attempts ");
        }
    }   
}