import java.util.Scanner;

public class yourAge {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello, what is your name? ");
		String yourname = keyboard.next();

		System.out.print("Hi " +yourname+ "! How old are you? ");
		int yourage = keyboard.nextInt();
		int ageafter = yourage + 5;
		int agebefore = yourage -5;

		System.out.println("Do you know that in five years you will be " +ageafter+ " years old?");
		System.out.print("And five years ago you were " +agebefore+ " years old. Imagine that!");
	}
}