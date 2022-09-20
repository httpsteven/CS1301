/*
       [STEVEN CARRILLO]
    [CS1101] String Manipulation
    Through my submission, I certify that all written code belongs
    to me. I acknowledge that I will be held responsible for my
    dishonesty should the Instructional Team find any evidence of
    academic dishonesty.
*/

public class StringManipulation_Carrillo{

  //isPalindrome -------------------------------------------
  public static boolean isPalindrome(String str){
    int length = str.length()-1;
    if (str.length() == 0 || str.length() == 1){
      return true;
    }
    else if(str.charAt(0) == str.charAt(length)){
      return isPalindrome(str.substring( 1 ,length - 1));
    }else return false;


  }

  //addStars------------------------------------------------
  public static String addStars(String phrase, int i){
    String word = "";
    if (i > phrase.length()){
      return "";
    }else if(phrase.charAt(i)==phrase.charAt(phrase.length()-1)){
    return phrase.charAt(i) + "";
    }else if (i < phrase.length() ){
      return (phrase.charAt(i) + "*") + addStars(phrase, i + 1);
    }else return "";
  }

   //numCopies---------------------------------------------
   public static boolean numCopies(String phrase, String sub, int n){
     if(phrase.length()<sub.length()){
       if(n==0){
         return true;
       }else{
         return false;
       }
     }else if(phrase.substring(0,sub.length()).equals(sub)){
       return numCopies(phrase.substring(1),sub,n-1);
     }
     return numCopies(phrase.substring(1),sub,n);
   }

    public static void main( String [] args ){
      System.out.println(" ");
      System.out.println(isPalindrome("tenet"));
      System.out.println(" ");
      System.out.println(addStars("hello",0));
      System.out.println(" ");
      System.out.print(numCopies("cccccj", "ccc", 3));
      System.out.println(" ");
      }
    }
