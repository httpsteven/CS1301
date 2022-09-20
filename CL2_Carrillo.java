/*
    [STEVEN CARRILLO]
    [CS1101] Comprehensive-Lab_Dragon-Slayer
    Through my submission, I certify that all written code belongs to me.
    I acknowledge that I will be held responsible for my dishonesty should
    the Instructional Team find any evidence of academic dishonesty.
*/
/*
    [STEVEN CARRILLO]
    [CS1101] CL2 - Dragon Slayer
    Through my submission, I certify that all written code belongs to me.
    I acknowledge that I will be held responsible for my dishonesty should
    the Instructional Team find any evidence of academic dishonesty.
*/


import java.util.Random;
import java.util.Scanner;

public class CL2_Carrillo{
  static int dungeonRows = 4;
  static int dungeonColumns = 4;
  static int lesserMonsters = 2;
  static int dragon = 1;
//GLOBAL INTEGERS
  static int posx = 0;
  static int posy = 0;
  static int playerHealth = 10;
  static boolean hasShield = false;
  static boolean hasSword = false;
  static boolean dragonDead = false;
  static boolean validMove = false;

  public static void main(String[] args){
    //Your code STARTS HERE
    //Dungeon Array
    int[][] dungeonArray = new int[dungeonRows][dungeonColumns];
    int[][] randomDungeon = getMonstersLocation();
    Scanner userInput = new Scanner(System.in);
    Scanner inDungeon = new Scanner(System.in);
    int[] shieldMonster = {(randomDungeon[0][0]),(randomDungeon[0][1])};
    int[] swordMonster = {(randomDungeon[1][0]),(randomDungeon[1][1])};
    int[] dragonLocation = {(randomDungeon[2][0]),(randomDungeon[2][1])};
    String userInputS;
    char choice;
    //starting phrase
    SOPln("");
  	SOPln("Oh no!" + "\nA dragon is killing our sheep and scaring our villagers," +
  		"\nplease help the knight put a stop to this nightmare!");
    SOPln("------------------------------------------------------------");
    //menu method
    menu(posx,posy,playerHealth,hasShield, hasSword);
    //controls method
    getControls();
    SOPln(" ");

    while(playerHealth > 0){
      if(dragonDead == true){
        break;
      }
      validMove = false;
      String rawInput = "";
      userInputS = userInput.nextLine();
      choice = userInputS.replaceAll("[\\n ]", "").charAt(0);
      System.out.println("input" + choice);
      moveMethod(choice,posy,posx,validMove);
      System.out.println(posy + "," + posx);
        encounterMonster(posy,posx,shieldMonster,swordMonster,dragonLocation,validMove);
            if(validMove){
              userInputS = userInput.nextLine();
              choice = userInputS.replaceAll("[\\n ]", "").charAt(0);
            monsterEncounterChoice(choice,posy,posx,shieldMonster,swordMonster,dragonLocation);
        }
      }
    if(playerHealth <= 0){
      SOPln("GAME OVER...");
    }
    userInput.close();
    inDungeon.close();
    }



    //Your code ENDS HERE


  //Your methods START HERE
//SOP and SOPln Methods
  public static void SOPln(String print){
    System.out.println(print);
  }
  public static void SOP(String print){
    System.out.print(print);
    }
  //MENU METHOD
  public static void menu(int x, int y, int health, boolean shield, boolean sword){
    SOPln("You are in cell: " + "(" + x + "," + y + ")");
    SOPln("Your remaining health points are: " + health);
    SOPln("Shield Acquired: " + shield);
    SOPln("Sword Acquired: " + sword);
    SOPln("Where would you like to move now?");
  }
  public static void getControls(){
    SOPln("Use L to move left" + "\nUse R to move right" + "\nUse U to move up" + "\nUse D to move down");
  }
//moveMethod Method
//Allows the user to traverse the dungeon rooms.
public static void moveMethod(char option, int y, int x,boolean valid){
    if((Character.toLowerCase(option) != 'l') &&
       (Character.toLowerCase(option) != 'r') &&
       (Character.toLowerCase(option) != 'u') &&
       (Character.toLowerCase(option) != 'd')){
         SOPln("Not a valid entry! Try Again!");
       }
    if(Character.toLowerCase(option) == 'l'){
      if( posx > 0 && posx <= dungeonColumns ){
       posx=posx - 1;
        validMove = true;
      }else if(posx == 0){
        SOPln("Not a valid entry! Try again!");
        validMove = false;
              }
  }
  if(Character.toLowerCase(option) == 'r'){
      if (posx >= 0 && posx < dungeonColumns){
       posx=posx+ 1;
        validMove = true;

      }else if ( posx == 4 ){
        SOPln("Not a valid entry! Try again!");
        validMove = false;
              }
  }
  if(Character.toLowerCase(option) == 'u'){
      if( posy > 0 && posy <= dungeonRows){
        posy= posy- 1;
        validMove = true;
      }else if( y == 0 ){
      SOPln("Not a valid entry! Try again!");
      validMove = false;
    }
  }
  if(Character.toLowerCase(option) == 'd'){
      if( posy >= 0 && posy < dungeonRows ){
        posy= posy+ 1;
        validMove = true;
      }else if( posy == 4 ){
        SOPln("Not a valid entry! Try again!");
        validMove = false;
        }
    }
}
//encounterMonster Method
//Shows the options for a player encountering the monsters.
public static void encounterMonster(int y, int x, int[] shield, int[] sword, int[] dragon, boolean valid){
    if(valid){
      if(posx == shield[1] && posy == shield[0]){
      SOPln("The mythical shield is located in this room!" +
      "\nA monster is guarding it.");
      SOPln("What would you like to do?" +
            "\n(a) DO NOTHING." +
            "\n(b) HIT THE ENEMY" +
            "\n(c) RUN AWAY");
          }
    if( posx == sword[1] && posy == sword[0] ){
      SOPln("The mythical sword is located in this room!" +
            "\nA monster is guarding it.");
      SOPln("What would you like to do?" +
            "\n(a) DO NOTHING." +
            "\n(b) HIT THE ENEMY" +
            "\n(c) RUN AWAY");
          }
    if( posx == dragon[1] && posy == dragon[0] ){
      SOPln("The dragon is located in this room!");
      SOPln("What would you like to do?" +
            "\n(a) DO NOTHING." +
            "\n(b) HIT THE ENEMY" +
            "\n(c) RUN AWAY");
          }
    if((posx != shield[1] && posy != shield[0]) &&
           (posx != sword[1] && posy != sword[0]) &&
           (posx != dragon[1] && posy != dragon[0])){
             SOPln("You've entered an empty room!" +
                   "\nLooks like there is nothing to do here.");
       }
     }
}
//ACTIONS THAT HAPPEN WHEN YOU MAKE A CHOICE
public static void monsterEncounterChoice(char option,int y, int x,int[] shield, int[] sword, int[] dragon){
      if(posx == shield[0] && posy == shield[1]){
        if(Character.toLowerCase(option) == 'a'){
          SOPln("You chose to do nothing.");
          playerHealth -= 10;
          }
        if(Character.toLowerCase(option) == 'b'){
          playerHealth -= 2;
          hasShield = true;
          SOPln("You fought the monster and managed to acquire the shield.");
        }
        if(Character.toLowerCase(option) == 'c'){
          SOPln("You chose to run away. Nothing happened.");
        }
        }
      if( posx == sword[0] && posy == sword[1] ){
        if(Character.toLowerCase(option) == 'a'){
          SOPln("You chose to do nothing.");
          playerHealth -= 10;
          }
        if(Character.toLowerCase(option) == 'b'){
          playerHealth -= 2;
          hasSword = true;
          SOPln("You fought the monster and managed to acquire the sword.");
        }
        if(Character.toLowerCase(option) == 'c'){
          SOPln("You chose to run away. Nothing happened.");
        }
          }
      if( posx == dragon[0] && posy == dragon[1] ){
        if(Character.toLowerCase(option) == 'a'){
          SOPln("You chose to do nothing.");
          playerHealth -= 10;
          }
        if(Character.toLowerCase(option) == 'b'){
          if(hasShield && hasSword){
            playerHealth -= 2;
            SOPln("You fought valiantly and defeated the dragon.");
            dragonDead = true;
          }else{
            SOPln("You were not prepared. The dragon attacked you.");
            playerHealth-=10;
          }

        }
        if(Character.toLowerCase(option) == 'c'){
          SOPln("You chose to run away. Nothing happened.");
        }
     }
 }
//Do Nothing
//Hit the Enemy
//Run Away
    //getRoomType
    //returns the type of room
    //if `currentRow`, currentColumn == ith set in monstersLocation, return i
    //else return -1 as a default (empty room)
    private static int getRoomType ( int[][] monstersLocation, int currentRow, int currentColumn){
      for (int i = 0; i < monstersLocation.length; i++) {
        if (monstersLocation[i][0] == currentRow && monstersLocation[i][1] == currentColumn)
          return i;
      }
      return -1; //By default return empty room
    }
  //Your methods END HERE

  /* ---------------------------------- Do not change anything below this comment ---------------------------------- */

  /*
   * The following method returns a 2-D array
   * The first set of row,column is the location of the monster guarding the shield
   * The second set of row,column is the location of the monster guarding the sword
   * The third set of row,column is the location of the dragon
   * The minimum size for the dungeon must be 4x4, this is set in the dungeonColumns and dungeonRows global variables
   */
  private static int[][] getMonstersLocation(){
    if(dungeonColumns < 4 || dungeonRows < 4){
      System.out.println("Minimum size for the dungeon must be 4x4");
      return null;
    }

    int[][] monstersLocation = new int[lesserMonsters + dragon][2];
    Random rand = new Random();

    for(int i = 0; i < lesserMonsters + dragon; i++){
      int row = rand.nextInt(dungeonRows);
      int column = rand.nextInt(dungeonColumns);
      if((row == 0 && column == 0) || (i != 0 && monsterLocationDuplicate(i + 1, row, column, monstersLocation))){
        int columnDuplicatedValue = column;
        while(column == columnDuplicatedValue || (i != 0 && monsterLocationDuplicate(i + 1, row, column, monstersLocation)))
          column = rand.nextInt(dungeonColumns);
      }
      monstersLocation[i][0] = row;
      monstersLocation[i][1] = column;
    }
    return monstersLocation;
  }

  /*
   * Returns true if a monster is already placed in the current cell (row, column)
   */
  private static boolean monsterLocationDuplicate(int monsters, int row, int column, int[][] monstersLocation){
    for(int i = 0; i < monsters; i++){
      if(monstersLocation[i][0] == row && monstersLocation[i][1] == column)
        return true;
    }
    return false;
  }
}
