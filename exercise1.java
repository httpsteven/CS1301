import java.util.Scanner; 

public class exercise1{
public static void main(String [] args){
			Scanner userInput = new Scanner(System.in); 
			
			System.out.println ("Welcome to our humble coffee shop, which would you like?");
				System.out.println ("1. Soy Hazel Latte with sweet cream foam and carmel drizzle");
				System.out.println ("2. Mango Dragon Fruit" );
				System.out.println ("3. Mocha Coffee with Cinnamon Sprinkle" );
			
			int orderNumber = userInput.nextInt();
			
		switch (orderNumber) {
			case 1: 
			System.out.println ("Your total is $4.57.");
			break;
			case 2: 
			System.out.println ("Your total is $5.98.");
			break;
			case 3: 
			System.out.println ("Your total is $4.28.");
			break;
			default:
			System.out.println ("That is not a part of the menu.");
			break;
		}
	}	
}