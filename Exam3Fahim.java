package com.project1;

import java.util.Scanner;

public class Exam3Fahim {
// Question: Take in a string for the user and display which letter comes first alphabetically
	// You must use a loop
	// You should make the full string uppercase to avoid issues of 'A' being before 'a'
	//You choose not to worry alphabet special characters. iff '*' is before 'A' thats fine

 public static void main(String[] args) {
	 Scanner inScanner = new Scanner(System.in);
	 System.out.println("Enter a string: ");
	 String inString = inScanner.nextLine().toUpperCase();
	 char minimumChar = inString.charAt(0);
	 for (int i = 1; i < inString.length(); i++) {
		 char currentChar = inString.charAt(i);
		 if (currentChar < minimumChar) {
			 minimumChar = currentChar;
		 }
	 }
 System.out.println("The letter that comes first alphabetically is: " + minimumChar);
		 }
	 }


