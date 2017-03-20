import java.util.Scanner;

public class DumbCalc {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter first number: ");
		float firstnum = keyboard.nextFloat();

		System.out.print("Enter second number: ");
		float secondnum = keyboard.nextFloat();

		System.out.print("Enter third number: ");
		float thirdnum = keyboard.nextFloat();

		float result = (firstnum+secondnum+thirdnum)/2;

		System.out.println("("+firstnum+"+"+secondnum+"+"+thirdnum+")/2 is..."+result);
	}
}