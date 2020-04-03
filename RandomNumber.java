import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int randNum = rand.nextInt(101);
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your first guess: ");
		int guess = kb.nextInt();
		int attempt = 10;

		do
		{
			System.out.print("Wrong number, Your second guess: ");
			guess = kb.nextInt();
			attempt = 8;
			System.out.print("Wrong number, Your third guess: ");
			guess = kb.nextInt();
			attempt = 7;
			System.out.print("Wrong number, Your fourth guess: ");
			guess = kb.nextInt();
			attempt = 6;
			System.out.print("Wrong number, Your fifth guess: ");
			guess = kb.nextInt();
			attempt = 5;
			System.out.print("Wrong number, Your sixth guess: ");
			guess = kb.nextInt();
			attempt = 4;
			System.out.print("Wrong number, Your seventh guess: ");
			guess = kb.nextInt();
			attempt = 3;
			System.out.print("Wrong number, Your eighth guess: ");
			guess = kb.nextInt();
			attempt = 2;
			System.out.print("Wrong number, Your nineth guess: ");
			guess = kb.nextInt();
			attempt = 1;
			System.out.print("Wrong number, Your final guess: ");
			guess = kb.nextInt();
			attempt = 0;
		}
		while(attempt != 0);


	    if(attempt == 0)
		{
			System.out.println("You have used all the guesses!");
		}
		else if(guess == randNum)
		{
			System.out.println("You are right! Would you like to play again?");
		}




	}
}