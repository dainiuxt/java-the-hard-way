import java.util.Scanner;

public class UserData {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello, please enter your student information.");
		System.out.println("");
		System.out.print("First name: ");
		String firstname = keyboard.next();

		System.out.print("Last name: ");
		String lastname = keyboard.next();

		System.out.print("Grade (9-12): ");
		int studentgrade = keyboard.nextInt();

		System.out.print("Student ID (6 digit): ");
		int studentid = keyboard.nextInt();

		System.out.print("Login: ");
		String login = keyboard.next();

		System.out.print("GPA (0.0-4.0): ");
		float yourgpa = keyboard.nextFloat();

		System.out.println("");
		System.out.println("Your information:");
		System.out.println("     Login:  " + login);
		System.out.println("     ID:     " + studentid);
		System.out.println("     Name:   " + lastname + ", " +firstname);
		System.out.println("     GPA:    " + yourgpa);
		System.out.println("     Grade:  " + studentgrade);
	}
}