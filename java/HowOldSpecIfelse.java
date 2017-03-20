import java.util.Scanner;

public class HowOldSpecIfelse
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello, what is your name? ");
		String name = keyboard.next();

		System.out.print("Ok, " +name+ ", how old are you? ");
		int age = keyboard.nextInt();

		if (age < 16)
		{
			System.out.println("You can't drive, " +name);
		}

		else if (age < 18 && age >= 16)
		{
			System.out.println("You can drive but not vote, " +name);
		}

		else if (age < 25 && age >= 18)
		{
			System.out.println("You can vote but not rent a car, " +name);
		}

		else /*if (age >= 25)*/
		{
			System.out.println("Congratulations, " +name+ ", you can do anything... what is legal :)");
		}

	}
}