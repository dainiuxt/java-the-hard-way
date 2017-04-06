import java.io.*;
import java.util.Scanner;
public class LittleQuiz
{
    public static void main (String[] args)
    {
        int score = 0;
        int answer = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, what is your name? ");
        String name = keyboard.nextLine();
        System.out.print(name+ ", are you ready for the 3 questions quiz? (Y/N): ");
        String ready = keyboard.nextLine();

        while (!(ready.equals("Y") || ready.equals("N")))
        {
            System.out.print("Please enter \"Y\" or \"N\": ");
            ready = keyboard.nextLine();
            if (ready.equals("Y") || ready.equals("N"))
            {
                break;
            }
        }
        if (ready.equals("Y"))
        {
            System.out.println("Very well! Please enter ONLY number of correct answer, otherwise the Quiz will break :(");
            System.out.println();

            while (true)
            {
                System.out.println("Q1) What is the capital of Alaska?");
                System.out.println("       1) Melbourne");
                System.out.println("       2) Anchorage");
                System.out.println("       3) Juneau");
                System.out.print("> ");
                try 
                {
                    answer = Integer.parseInt(keyboard.next());
                    break;
                }
                catch (Exception ignore)
                {
                    System.out.println("Please enter a number.");
                    System.out.println();
                }
            }
            if (answer == 3)
            {
                score++;
                System.out.println("Thats right!");
            }
            else {
                System.out.println("The capital of Alaska is Juneau. Better luck next time.");
            }
            
            System.out.println();

            while (true)
            {
                System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
                System.out.println("       1) no");
                System.out.println("       2) yes");
                System.out.println("       3) maybe");
                System.out.print("> ");
                try
                {
                    answer = Integer.parseInt(keyboard.next());
                    break;
                }
                catch (Exception ignore)
                {
                   System.out.println("Please enter a number.");
                   System.out.println();
               }
           }
           if (answer == 1)
           {
            score++;
            System.out.println("Thats right!");
        }

        else {
            System.out.println("\"cat\" is a String. You can only store numbers in a variable of type int.");
        }
        System.out.println();
        while (true)
        {
            System.out.println("Q3) What is the result of 9+6/3?");
            System.out.println("       1) 5");
            System.out.println("       2) 11");
            System.out.println("       3) 15/3");
            System.out.print("> ");
            try {
                answer = Integer.parseInt(keyboard.next());
                break;
            }
            catch (Exception ignore)
            {
               System.out.println("Please enter a number.");
               System.out.println();
           }
       }
       if (answer == 2)
       {
        score++;
        System.out.println("Thats right!");
    }
    else {
        System.out.println("9+6/3=11. Check your arithmetics knowledge!");
    }
    System.out.println();
    System.out.println();

    System.out.println("Youu have " +score+ " correct answers out of 3.");
    System.out.println("Thank you for playing!");
}
else if (ready.equals("N"))
{
    System.out.println("See ya l8er, Aligator!");
}
    } //end of main()
} //end of Quiz