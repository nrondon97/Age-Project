import java.util.Scanner;
/**
 * Based off criteria for Project 1. Asks for age and responds.
 * 
 * @author Naylene Rondon
 * @version Oct. 6, 2017
 */
public class Age
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        //Input
        System.out.println("Hello! How old are you?");
        int age = in.nextInt();
        
        //Outputs based off age using if statements
        if (age < 21)  //under 21
        {
            System.out.println("No drinking for you.");
        }
        else if (age > 21 && age < 65)  //over 21
        {
            System.out.println("Hi ho hi ho its off to work you go.");
        }
        else //over 65
        {
            System.out.println("Enjoy your retirement while the money lasts.");
        }
        
        
    }
}
