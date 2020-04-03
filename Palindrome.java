import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		String word = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		word = sc.nextLine();
		int length = word.length();
		String backward = "";

		for(int i  = length - 1; i >= 0; i--)
		backward = backward + word.charAt(i);

		if(word.equals(backward))
		{
		System.out.println("The word is a palindrome.");
	    }
		else
		{
		System.out.println("The word is not a palindrome.");
	    }
	 }
 }