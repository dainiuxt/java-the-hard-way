import java.io.*;
import java.util.Scanner;
public class SpaceBoxing
{
	public static void main (String[] args)
	{
		String pname = "Earth";
		int planet = 99;
		float weight = 1f;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hello, what is your name? ");
		String name = keyboard.nextLine();

		while (true)
		{
		System.out.print("Please enter your current weight on Earth (kgs): ");
			try
			{
				weight = Float.parseFloat(keyboard.next());
				break;
			}
			catch (Exception ignore)
			{
				System.out.print(name+ ", please enter your weight in numeric format: ");
			}
        }
		//weight = keyboard.nextFloat();
		float pweight = weight;
		System.out.println("I have information for the following planets:");
		System.out.println("  1. Venus    2. Mars    3. Jupiter");
		System.out.println("  4. Saturn   5. Uranus  6. Neptune");
		System.out.println("Every other input woud lead to assume you are on Earth.");
		System.out.print("Which planet you are visiitng (enter the number): ");
		planet = keyboard.nextInt();

		if (planet == 1)
		{
			pweight = weight * 0.78f;
			pname = "Venus";
		}
		else if (planet == 2)
		{
			pweight = weight * 0.39f;
			pname = "Mars";
		}
		else if (planet == 3)
		{
			pweight = weight * 2.65f;
			pname = "Jupiter";
		}
		else if (planet == 4)
		{
			pweight = weight * 1.17f;
			pname = "Saturn";
		}
		else if (planet == 5)
		{
			pweight = weight * 1.05f;
			pname = "Uranus";
		}
		else if (planet == 6)
		{
			pweight = weight * 1.23f;
			pname = "Neptune";
		}
		else 
		{
			pname = "Earth";
		}

		System.out.print(name+ ", your weight would be " +pweight+ " kg on " +pname+ ".");
	}
}