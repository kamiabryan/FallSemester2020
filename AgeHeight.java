/*
* Kamia Bryan
* Comp 163
* Name, age, and height
*
* This application will prompt users to input their age and height
* then output the values
*
*/
import java.util.Scanner;

public class NameAgeHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = input.next();

        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        System.out.print("Enter your height: ");
        double userHeight = input.nextDouble();

        System.out.println("Hello " + userName + "." + " You are " + userAge + 
        " years old and " + userHeight
        + " inches tall.");
    }
}

