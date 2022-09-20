/*
    Steven Carrillo
    [CS1101] Lab 2
    Through my submission, I certify that all written code belongs
    to me. I acknowledge that I will be held responsible for my
    dishonesty should the Instructional Team find any evidence of
    academic dishonesty.
*/

import java.util.Scanner; 

public class Lab2_Carrillo{

		public static void main(String [] args){
			Scanner userInput = new Scanner(System.in);
			
	// Ask user for pounds then ounces, ounces is a float in case of a more precise number.		
	System.out.println ("Enter your weight in pounds followed by ounces:");
		int poundsWeight = userInput.nextInt();
		float ouncesWeight = userInput.nextFloat();
		
	//Ask user for feet then inches, inches is a float in case of a more precise number. 
	System.out.println("Enter your height in feet followed by inches:");
		int feetHeight = userInput.nextInt();
		float inchesHeight = userInput.nextFloat();
		
			float totalWeightp = (ouncesWeight / 16) + poundsWeight;
			float totalHeighti = (feetHeight * 12) + inchesHeight; 
	
	
	float bodyMassI =  ( totalWeightp / (totalHeighti * totalHeighti) ) * 703;
	
	System.out.println ("Your BMI is " + bodyMassI +".");
	
	userInput.close();
		
		}
}