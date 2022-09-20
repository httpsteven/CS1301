/*
       [Steven Carrillo]
    [CS1101] Lab 6
    Through my submission, I certify that all written code belongs
    to me. I acknowledge that I will be held responsible for my
    dishonesty should the Instructional Team find any evidence of
    academic dishonesty.
*/

import java.util.Scanner;

public class Lab6_Carrillo{
  //System.out.print Methods
  public static void SOPln(String print){
    System.out.println(print);
    }
  public static void SOP(String print){
    System.out.print(print);
    }
  //isPalindrome
  public static boolean isPalindrome(String phrase, int a, int b){
    if(b-a == 1 || a == b){
      return true;
    }
    else{
      if(phrase.charAt(a) == phrase.charAt(b)){
        return isPalindrome( phrase , a + 1 , b - 1 );
      }
      else{
        return false;
        }
      }
    }
    //vowelCounter
    public static int vowelCounter(String phrase, int i){
      if (i == phrase.length()){
        return 0;
      }
      else if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u')
      {
      return 1 + vowelCounter(phrase, i + 1);
      }
      else{ return 0 + vowelCounter(phrase, i + 1);}
      }
      //frequency
      public static int frequency(char target, String phrase, int i){
        if (i == phrase.length()){
          return 0;
        }
        else if (phrase.charAt(i) == target)
        {
        return 1 + frequency(target, phrase, i + 1);
        }
        else{ return 0 + frequency(target, phrase, i + 1);}
        }
      //oddSumRange
      public static int oddSumRange(int x, int y){
        ;
        if (x == y){
          return 0;
        }
        else if (x < y){
          return x + oddSumRange(x+2,y);
        }
        else return 0;
      }
    public static String reverse(String reversePhrase, int i){
      if ((reversePhrase.equals(" ")) || (reversePhrase.length() <= 1))
        return reversePhrase;
      else if (i >= 0)
        return reversePhrase.charAt(i) + reverse(reversePhrase, i - 1);
      else return (" ");
      }

	public static void main(String [] args){
    SOPln("-----------------------isPalindrome-----------------------");
    SOPln("");
    SOP("Enter a phrase: ");
    Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine();
        int start = 0;
        int end = (word.length())-1;
        if (isPalindrome(word, start, end)){
          SOPln(word + " is Palindrome.");
        }
        else{
          SOPln(word + " is not Palindrome.");
        }
        SOPln("");
    SOPln("-----------------------vowelCounter-----------------------");
    SOPln("");
    SOP("Enter a phrase: ");
        String vowelPhrase = userInput.nextLine();
        SOPln( "There are " +  vowelCounter(vowelPhrase, 0) + " vowels.");
        SOPln("");
    SOPln("------------------------frequency------------------------");
    SOPln("");
    SOP("Enter a letter target: ");
        char t = userInput.next().charAt(0);
    SOPln("");
    SOP("Enter the phrase you'd like to check: ");
        String freqPhrase = userInput.next();
        if (Character.isLowerCase(t)){
          freqPhrase = freqPhrase.toLowerCase();
        }
        else {
          freqPhrase = freqPhrase.toUpperCase();
        }
        SOPln( "The frequency of " + t + " is " + frequency(t, freqPhrase, 0) + " times.");
        SOPln("");
    SOPln("------------------------oddSumRange------------------------");
    SOPln("");
    int initialC = 0;
    SOP("Enter a starting position: ");
        int initial = userInput.nextInt();
    SOP("Enter an ending position:");
        int finalR = userInput.nextInt();
        if(initial % 2 == 0){
           initialC = initial + 1;
        }else initialC = initial;
        SOP("The odd sum between " + finalR + " and " + initial + " is: " + oddSumRange(initialC, finalR));
        SOPln("");

    SOPln("------------------------reverse------------------------");
    SOPln("");
    SOP("Enter a phrase: ");
      userInput = new Scanner(System.in);
          String reverse = userInput.nextLine();
          int counter = reverse.length()-1;
    SOPln(reverse(reverse, counter));


  }
}
