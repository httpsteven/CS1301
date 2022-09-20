/*
       Steven Carrillo
    [CS1101] Lab 5
    Through my submission, I certify that all written code belongs
    to me. I acknowledge that I will be held responsible for my
    dishonesty should the Instructional Team find any evidence of
    academic dishonesty.
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab5_Carrillo {
//addTxt
    public static String addTxt(String a){
      String file = a;
      if (file.contains(".txt"))
        return file;
      else
        file = (file + ".txt");
        return file;
    }
//isPalindrome
  public static void isPalindrome(String phrase){
    String userPhrase = phrase.replaceAll(" ","");
    String userReverse = "";
    for (int i = userPhrase.length() - 1 ; i >= 0; i-- ){
                userReverse += userPhrase.charAt(i);
     }
         if (userPhrase.equals(userReverse)){
           SOPln(phrase + " is a Palindrome");
           SOPln(" ");
         }else{
           SOPln(phrase + " is not a Palindrome.");
           SOPln(" ");
              }
  }
//lineCounter
    public static void lineCounter(String a) throws FileNotFoundException{
      int counter = 1;
      String file = addTxt(a);
      Scanner fileReader = new Scanner(new File(file));
      while(fileReader.hasNextLine()){
        fileReader.nextLine();
        counter++;
      }
      SOPln("The amount of lines in " + file + " is " + counter + ".");
      SOPln(" ");
    }
//numofOccurences
    public static void numOfOccurences(String a,char b) throws FileNotFoundException{
      int counter = 0;
      String file = addTxt(a);
      Scanner fileReader = new Scanner(new File(file));
      while(fileReader.hasNextLine()){
        String newLine = fileReader.nextLine();
        for (int i = 0; i < newLine.length(); i++){
         if(newLine.charAt(i) == Character.toLowerCase(b) || newLine.charAt(i) == Character.toUpperCase(b)){
           counter++;
         }
        }
      }
       SOPln("The amount of times character " + b + " is in file " + file + " is " + counter + ".");
    }
//areaOfCylinder
    public static void areaOfCylinder(double d, double height){
      double radius = d / 2;
      double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));
      System.out.printf("The area of that cylinder is %.2f\n", area);
      SOPln(" ");
    }
//System.out.print Methods
      public static void SOPln(String print){
        System.out.println(print);
      }
      public static void SOP(String print){
        System.out.print(print);
          }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Main Argument
    public static void main(String[] args) throws FileNotFoundException {
      Scanner userInput = new Scanner(System.in);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              SOPln("-----------------------isPalindrome-----------------------");
              SOPln("");
              SOP("Enter a phrase: ");
              String phrase = userInput.nextLine();
              isPalindrome(phrase);
              SOPln("");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              SOPln("------------------------lineCounter------------------------");
              SOPln("");
              SOP("Enter the name of a file: ");
              String file = userInput.nextLine();
              lineCounter(file);
              SOPln("");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              SOPln("----------------------numOfOccurences----------------------");
              SOPln("");
              SOP("Enter the name of a file: ");
              file = userInput.nextLine();
              SOP("Enter the letter you want ");
              char letter = userInput.next().charAt(0);
              numOfOccurences(file,letter);
              SOPln("");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              SOPln("----------------------areaOfCylinder----------------------");
              SOPln("");
                int isNegative = 1;
              do{
                SOP("Enter the diameter of a cylinder: ");
                int diameter = userInput.nextInt();
                SOP("Enter the height of the cylinder: ");
                int height = userInput.nextInt();
                if(diameter > 0 && height > 0){
                    areaOfCylinder(diameter,height);
                    isNegative = 0;
                }else{
                  isNegative = 1;
                  SOPln("Try Again: No Negative Symbols.");
                }
            }while(isNegative == 1);

  }
}
