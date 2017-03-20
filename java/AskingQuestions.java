import java.util.Scanner;

public class AskingQuestions {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age, heightM, heightCM;
		double weight;

		System.out.println("Enter your age in years, height (meters and centimeters separately) and height in kg. Press \"Enter\" after each number.");
		System.out.println("");

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How tall are you? (meters and centimeters separately) ");
		heightM = keyboard.nextInt();
		heightCM = keyboard.nextInt();

		System.out.print("How much do you weight? ");
		weight = keyboard.nextDouble();

		System.out.println("So you'e " + age + " years old, " + heightM + " m " + heightCM +  " cm tall and " + weight + " kg heavy.");
	}
}