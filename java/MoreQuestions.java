import java.util.Scanner;

public class MoreQuestions {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Give me a word! ");
		keyboard.next();
		System.out.print("Give me a second word! ");
		keyboard.next();
		System.out.print("Now your favorite number! ");
		keyboard.next();
		System.out.print("And your second favorite number! ");
		keyboard.next();
		System.out.println("Wow! Wasn't that fun?");
	}
}