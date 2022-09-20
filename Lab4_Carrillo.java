/*
       Steven Carrillo
    [CS1101] Lab 4
    Through my submission, I certify that all written code belongs
    to me. I acknowledge that I will be held responsible for my
    dishonesty should the Instructional Team find any evidence of
    academic dishonesty.
*/

import java.util.Scanner;

public class Lab4_Carrillo{
	public static void main(String [] args){

		Scanner userInput = new Scanner(System.in);

    System.out.println("---------SIGN UP WITH SPOTIFY---------");
      System.out.print("eMail > ");
        String email = userInput.nextLine();
				String password;
				boolean validSpecial = false;
				boolean validUpper = false;
				boolean validLower = false;
				int counterUpper = 0;
				int counterLower = 0;
				int counterSpecial = 0;
				int counterChar = 0;
				int counterDigit = 0;
				int counterEntry = 0;
				double studentPrice = 4.99f;
				double regularPrice = 9.99f;
				double tax = 1.0725f;
				double total = 0;


				do{
					System.out.print("Password > ");
		        password = userInput.nextLine();
			for(int i = 0; i < password.length(); i++){

				if (password.length() >= 8 && password.length() <= 20){
					counterChar++;
				}
				if ( Character.isDigit(password.charAt(i)) == true){
					counterDigit++;
				}

				if ( Character.isUpperCase(password.charAt(i)) == true){
					validUpper = true;
					counterUpper++;
				}
				if ( Character.isLowerCase(password.charAt(i)) == true){
					validLower = true;
					counterLower++;
				}
						if (password.charAt(i) == ('!') || password.charAt(i) == ('#') || password.charAt(i) == ('$') || password.charAt(i) == ('*')){
							validSpecial = true;
							counterSpecial++;
						}
				}
			 if (counterSpecial <= 0 || counterUpper <= 0 || counterLower <= 0 || counterChar <= 0 || counterDigit <= 0){

				System.out.println("Please enter a password that meets the following requirements:");
				System.out.println("-Contains at least 8 characters and at most 20 characters");
				System.out.println("-Contains at least one upper-case letter");
				System.out.println("-Contains at least one lower-case letter letter");
				System.out.println("-Contains at least one digit");
				System.out.println("Contains at least one special character [!, #, $, or *]\n");

			}
		}while (counterSpecial <= 0 || counterUpper <= 0 || counterLower <= 0 || counterChar <= 0 || counterDigit <= 0);

				System.out.println("--THANK YOU FOR MAKING AN ACCOUNT WITH SPOTIFY--");

			System.out.println(" ");

				System.out.println("-----------------PLEASE SIGN IN-----------------");
					String eMailEntry;
					String passwordEntry;
				int Entry = 1;
					do{
						System.out.print("eMail >");
							eMailEntry = userInput.nextLine();
						System.out.print("Password >");
							passwordEntry = userInput.nextLine();
							if ( (eMailEntry.equals(email)) && (passwordEntry.equals(password)) ){
								Entry = 2;
								System.out.println("--------------------WELCOME--------------------");}
							else{
								System.out.println("Either your eMail or your Password are incorrect. Please Try Again.");
								Entry = 1;
							}
			}while(Entry == 1);

			if (email.contains("@miners.utep.edu")){
				total = studentPrice * tax;
				System.out.println("You qualify for the discount plan with Spotify.");
				System.out.printf( "Your total is $%.2f\n", total );

			}
			else{
				total = regularPrice * tax;
				System.out.println("We are sorry that you do not quality for our discount plan.");
				System.out.printf( "Your total is $%.2f\n", total );
			}

		}
	}
