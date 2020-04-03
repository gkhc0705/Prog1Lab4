import java.util.Scanner;

public class EmailValidation
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a email address: ");
		String email = kb.nextLine();

		boolean foundAt = false;
		boolean foundDot = false;

		for (int i = 0; i < email.length(); i++)
		{
			if(!foundAt)
			{
				if(email.charAt(i) == '@')
				{
					foundAt = true;
				}
			}

				else if(!foundDot)
				{
					if(email.charAt(i) == '.')
					{
						foundDot = true;
					}
				}
			}

			if(foundAt && foundDot)
			{
				System.out.println("Valid email");
			}
			else
			{
				System.out.println("Invalid email");
			}
		}
	}

