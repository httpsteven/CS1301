import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MethodActivities {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Vowels: " + vowelCount("Hey, You are awesome"));


    File numbers = new File("numbers.txt");
    int total  = fileSum(numbers);
    System.out.println("Sum of the file was: " + total);
    }
  //Method Signature of vowelCount
  public static int vowelCount(String string){
    //Initializes counter
    int count = 0;
    //For statement to count the vowels
    for (int i = 0; < string.length(); i++){
      if (string.charAt(i) == ('a') || string.charAt(i) == ('e') || string.charAt(i) == ('i') || string.charAt(i) == ('o') || string.charAt(i) == ('u')){
        //Updates counter every time there is an occurence
        count++;
      }
    }
    //Returns counter
    return count;
  }
//Method signature of fileSum
  public static int fileSum(File numbers) throws FileNotFoundException{
    //Initializes the scanner for the file numbers
    Scanner readFile = new Scanner(numbers);
    //Initializes the total variable for the method
    int total = 0;
    //Loop to read through the txt file to find the numbers
    while (readFile.hasNextLine()){
      //total equals to every number in the file added together
      total+= readFile.nextInt();
    }
    //close scanner readFile
    readFile.close();
    //return the total
    return total;
  }
  }
