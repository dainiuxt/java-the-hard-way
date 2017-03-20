import java.util.Scanner;
public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Are you ready for quiz? (Y/N) ");
		String iamready = keyboard.next();

		if (iamready == "Y" || iamready == "y" || iamready == "Yes" || iamready == "yes" || iamready== "YES")
		{
			System.out.println();
			System.out.println("Okay, here it comes!");
			System.out.println();
			System.out.println("Okay, here it comes!");

		}

		else
		{
			System.out.println("OK then. Good buye!");
		}



	}
}