/*
 * Kamia Bryan
 * Comp 163
 * Average Grades
 * 
 * This application will prompt the user to input how many grades they would 
 *like to average, calculate their grade,  output their letter grade.
 *  
 */
import java.util.Scanner;

public class Average_grades {
    
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        //how many grades to average
        System.out.print("Enter how many grades to average: ");
        int gradeInput = input.nextInt(); 
        int array[] = new int[gradeInput];

        //grades
        System.out.println("Enter the grades: ");
        
        //loop to put user grades into the array and add them
        int sumOfGrades = 0;

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = input.nextInt();
            sumOfGrades = sumOfGrades + array[i];
        }

        //variable to calculate average
        int avgOfGrades = sumOfGrades / array.length;
        
        // if statement to determine letter grade
        String letter = " ";

        if ((avgOfGrades >= 90) && (avgOfGrades <=100)) {
            letter = "A";
        }
        if ((avgOfGrades >= 80) && (avgOfGrades <90)) {
            letter = "B";
        }
        if ((avgOfGrades >= 70) && (avgOfGrades <80)) {
            letter = "C";
        }
        if ((avgOfGrades >= 60) && (avgOfGrades <70)) {
            letter = "D";
        }
        if (avgOfGrades <60 || avgOfGrades < 0) {
            letter = "F";
        }
        if (avgOfGrades > 100) {
            System.out.println("Error");
        }

        //switch statement to print out the grade
        
        switch (letter) {
            case "A" :
            System.out.println("Your letter grade is A");
            break;

            case "B" :
            System.out.println("Your letter grade is B");
            break;

            case "C" :
            System.out.println("Your letter grade is C");
            break;

            case "D" :
            System.out.println("Your letter grade is D");
            break;

            case "F" :
            System.out.println("Your letter grade is F");
            break;

            default:
            System.out.println("Error");
        } 
        
    }
}
