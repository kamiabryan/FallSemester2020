import java.util.Scanner;

/* Kamia Bryan
*
* Class Size
* This application will prompt the user to enter the number of 
* students in their classn and their ages. Then output the student's
* ages forwards then backwards
*/
public class Class_size {
    public static void main(String[] args) {

        System.out.print("Enter the size of the class: ");
        Scanner input = new Scanner (System.in);
        int classSize = input.nextInt();

        int userAge [] = new int [classSize];

        for (int i = 0; i < classSize; i++) {
            System.out.print("Enter age for student " + (i + 1) + " : ");
            userAge[i] = input.nextInt();
        }

        for (int i = 0; i < userAge.length; i++) {
            System.out.print(userAge[i] + " ");
        }
    
        for (int j = userAge.length - 1; j >= 0; j --) {
            System.out.print(userAge[j] + " ");
        }
    }
}