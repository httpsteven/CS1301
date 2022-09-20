import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CL1_Carrillo{

  public static void main(String[] args) throws FileNotFoundException{
      Scanner banner = new Scanner(new File("banner.txt"));
      Scanner goodbye = new Scanner(new File("goodbye.txt"));
      Scanner shopInventory = new Scanner(new File("fruit-database.txt"));
      Scanner userInput = new Scanner(System.in);

      int choice = 0;
      double weightChoice;
      double currentPrice = 0.0f;
      double currentWeight = 0.0f;
      double totalWeight = 0.0f;
      double total = 0.0f;
      float bagsPrice = 0.15f;
      float bagsNeeded = 0;
      int bagCapacity = 5;
      int bagsProvided = 0;
      double bagsTotal = 0;
      int count = 1;
      float giftCard = 0.0f;
      double change = 0.0f;
      int checkOut = 0;
      boolean neXt = false;
      int activate = 0;


      while(banner.hasNextLine()){
        SOPln(banner.nextLine());
      }
SOPln("Here are all your options:");

		   while(checkOut == 0){
       SOPln("Please select an option:\n" + "1. Add Item\n" + "2. View Cart\n"
                          + "3. Clear Cart\n" + "4. Check Out\n" + "5. Exit" );
            choice = userInput.nextInt();
				        if (choice == (1)){
                  while(activate <= 0){
                    SOPln("Here are all your options:");
                    activate += 1;
                  }
                  while(shopInventory.hasNextLine()){
                    SOPln(shopInventory.nextLine());

                  }
                SOPln("Enter the name of the food you'd like to add to cart:");
                String fruitChoice = userInput.next();
                shopInventory= new Scanner(new File("fruit-database.txt"));
                while(shopInventory.hasNextLine()){
                String currentFruit = shopInventory.next();
                if (fruitChoice.equalsIgnoreCase( currentFruit )){
                  currentPrice = shopInventory.nextDouble();
                  SOPln("How many pounds of " + currentFruit + " do you want?");
                  weightChoice = userInput.nextDouble();
                  total += weightChoice*currentPrice;
                  totalWeight = totalWeight + weightChoice;
                  }
                }

                }

              if (choice == (2)){
                SOP("Your current total weight is " + totalWeight);
                System.out.printf(" and your current total price is $%.2f\n", total);
              }
              if (choice == (3)){
                totalWeight = 0;
                total = 0;
                SOPln("Cart Cleared");
              }
              if (choice == (4)){
                do{
                  SOPln("Time to checkout. How many bags did you bring?");
                  bagsProvided = userInput.nextInt();
                  bagsNeeded = Math.round(totalWeight/bagCapacity);
                  bagsTotal = (bagsNeeded - bagsProvided);
                  double bagsPTotal = bagsTotal * bagsPrice;
                  if (bagsPTotal < 0){
                    bagsPTotal = 0;
                  }
                  total = total + bagsPTotal;
                  if (bagsTotal < 0){
                    bagsTotal = 0;
                  }
                  do{
                    SOPln("Your total weight is " + totalWeight + " pounds so you need to purchase " + bagsTotal);
                    System.out.printf("additional bags which cost $%.2f\n", bagsPTotal );
                    System.out.printf("Your total is $%.2f\n", total );
                    SOPln("Enter your gift card amount:");
                    giftCard = userInput.nextFloat();
                    if (giftCard >= total){
                    change = total - giftCard;
                    if (change < 0){
                      change = change * -1;
                    }
                    System.out.printf("Your change is $%.2f\n", change );
                    while(goodbye.hasNextLine()){
                      SOPln(goodbye.nextLine());
                    }
                    checkOut = 1;
                  }else{
                    SOPln("You don't have enough, try again!");
                  }


              }while(checkOut <= 0);
              }while(checkOut <= 0);

}
              if (choice == (5)){
                while(goodbye.hasNextLine()){
                  SOPln(goodbye.nextLine());
                  checkOut = 1;
}
    }
             if (choice <= 0 || choice >= 6){
               SOPln("That is not an option. Try again! [Choices from 1-5]");
             }
    }
    userInput.close();
    banner.close();
    shopInventory.close();
    goodbye.close();


  }


  public static void SOPln(String print){
    System.out.println(print);
  }
  public static void SOP(String print){
    System.out.print(print);
    }
}
