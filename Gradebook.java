/*
 * Kamia Bryan
 * Comp 163
 * Gradebook
 * 
 * This application will prompt the user for several grades and information 
 * over the course of a semester and outputs a summary of their performance
 *  
 */

import java.util.Scanner;
import java.text.DecimalFormat;

 public class Gradebook { 
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#.##");
		
		//user enters their name
		System.out.println("Welcome to the interactive grade book. What is the student name?");	
		String userName = scnr.nextLine();

		//user enters participation credit 
		System.out.println("Did student receive participation credit? (yes/no)");
		String participCredit = scnr.next();

		//user inputs their grades over the semester 
		System.out.println("Enter grade for Project 1.");
		double project1 = scnr.nextDouble();

		System.out.println("Enter grade for Project 2.");
		double project2 = scnr.nextDouble();

		System.out.println("Enter grade for Midterm 1.");
		double mid1 = scnr.nextDouble();

		System.out.println("Enter grade for Midterm 2.");
		double mid2 = scnr.nextDouble();

		System.out.println("Enter grade for Midterm 3.");
		double mid3 = scnr.nextDouble();

		System.out.println("Enter grade for Final Exam.");
		int finalExam = scnr.nextInt();

		//asterick barrier
		System.out.println("*****");

		//summary output
		System.out.println("Here is the grade summary for " + userName + ".");

		//participation credit math and output
		int participCreditScore = 0;
		if (participCredit.equals("yes")) {
			participCreditScore = 100;
			System.out.println("Participation score: " + participCreditScore);
		}
		else if (participCredit.equals("no")) {
			participCreditScore = 0;
			System.out.println("Participation score: " + participCreditScore);
		}

		//avg project score math and output
		double avgProjectScore = (project1 + project2) / 2;
		System.out.println("Project score: " + f.format(avgProjectScore));
		
		// midterm score math and output
		double avgMidScore = (mid1 + mid2 + mid3) / 3;
		//replace lowest midterm math
		if ((mid1 < finalExam) && (mid1 <= mid2) &&  (mid1 <= mid3)) {
			avgMidScore = (finalExam + mid2 + mid3) / 3;
			System.out.println("Midterm score: " + f.format(avgMidScore));
			System.out.println("A midterm grade was replaced by the final exam grade.");
		}
		else if ((mid2 < finalExam) && (mid2 <= mid1) &&  (mid2 <= mid3)) {
			avgMidScore = (mid1 + finalExam + mid3) / 3;
			System.out.println("Midterm score: " + f.format(avgMidScore));
			System.out.println("A midterm grade was replaced by the final exam grade.");
		}
		else if ((mid3 < finalExam) && (mid3 <= mid1) &&  (mid3 <= mid2)) {
			avgMidScore = (mid1 + mid2 + finalExam);
			System.out.println("Midterm score: " + f.format(avgMidScore));
			System.out.println("A midterm grade was replaced by the final exam grade.");
		}
		else {
			System.out.println("Midterm score " + f.format(avgMidScore));
		}

		//final exam score output
		System.out.println("Final Exam score: " + finalExam);

		//total score math
		double totalScore = ((0.1 * participCreditScore) + (0.35 * avgProjectScore) + (0.3 * avgMidScore) + (0.25 * finalExam));
		System.out.println("Total score " + f.format(totalScore));

		//final grade math and output
		if (totalScore >= 90.00) {
			System.out.println("Final grade: A");
		}
		if ((totalScore >= 80.00) && (totalScore < 90.00)) {
			System.out.println("Final grade: B");
		}
		if ((totalScore >= 70.00) && (totalScore < 80)) {
			System.out.println("Final grade: C");
		}
		if ((totalScore >= 60.00) && (totalScore < 70)) {
			System.out.println("Final grade: D");
		}
		if (totalScore < 60) {
			System.out.println("Final grade: F");
		}

		//asterick barrier
		System.out.println("*****");
     }   
}