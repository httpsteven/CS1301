import java.util.Scanner;

public class Lab3_Carrillo{
	public static void main(String [] args){

		Scanner userInput = new Scanner(System.in);

			System.out.println("Welcome to Spotify! Please choose a Payment Plan:\n"+
							   "[INDIVIDUAL] $9.99/mo\n[FAMILY]$14.99/mo\n[STUDENT] $4.99/mo");

		double individual = 9.99f;
		double family = 14.99f;
		double student = 4.99f;
		double tax = 1.0725f;
		double total = 0f;
		String choice = userInput.nextLine();

			if(choice.equalsIgnoreCase("individual")){
				total = (tax*individual);
				System.out.println("Thank you for applying to Individual Spotify!\n");
				System.out.printf( "Your total is $%.2f\n", total );
				}
			else if(choice.equalsIgnoreCase("family")){
				total = (tax*family);
				System.out.println("Thank you for applying to Family Spotify!\n");
				System.out.printf( "Your total is $%.2f\n", total );
				}
			else if(choice.equalsIgnoreCase("student")){
				total = (tax*student);
				System.out.println("Thank you for applying to Student Spotify!\n");
				System.out.printf( "Your total is $%.2f\n", total );
			}
			else System.out.println("That is not a Spotify plan");



	////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////


				System.out.println (" ");
				System.out.println ("How many checks have been written this month?");
								int baseFee = 10;
								float numChecks = userInput.nextFloat();
								double totalChecks = 0f;


					if((numChecks < 21) && (numChecks > 0)){
						totalChecks = .10 * numChecks;}
					else if((numChecks < 40) && (numChecks > 19)){
							totalChecks = .08 * numChecks;}
					else if(numChecks > 39){
							totalChecks = .06 * numChecks;}

						double bankFee = (totalChecks + baseFee);

							System.out.printf("Total Bank's Service Fee: $%.2f" , bankFee);
								System.out.println (" ");

	////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////

					System.out.println("What size are the three sides of the triangle?");
						Scanner scanner = new Scanner(System.in);

							double a = scanner.nextDouble();
							double b = scanner.nextDouble();
							double c = scanner.nextDouble();

							if((a == b) && (b == c)){
								System.out.println ("Regular Triangle");
							}
							else if((a == b) || (b == c) || (a==c)){
								System.out.println ("Symmetric Triangle");
							}
							else if ((a != b) || (b != c) || (a != c)){
								System.out.println ("Irregular Triangle");
				scanner.close();
				userInput.close();
				}
		}
}
