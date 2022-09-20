/* [STEVEN CARRILLO]
   [CS1101] Lab 8
   Through my submission, I certify that all written code belongs
   to me. I acknowledge that I will be held responsible for my
   dishonesty should the Instructional Team find any evidence of
   academic dishonesty. */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lab8_Carrillo{
  //main
   public static void main(String [] args)throws IOException{
      Scanner userInput = new Scanner(System.in);
      Scanner fileReader = new Scanner(new File("contact-list.txt"));
      Contact[] contactList = new Contact[ countContactObj("contact-list.txt") ];
      Message[] messageList = new Message[countContactObj("contact-list.txt")];
      int condition = 2;
      int choice = 0;
      char choiceLetter = 'z';
      Scanner iMessageBanner = new Scanner(new File("banner.txt"));
      Scanner goodbyeBanner = new Scanner(new File("goodbye.txt"));
      fillMessage("contact-list.txt",messageList);
      fillContact("contact-list.txt",contactList,messageList);
///////////////////////////////////////////////////////////////////////////////////////////////
      //do while loop PART A
      do{
        iMessageBanner = new Scanner(new File("banner.txt"));
        while(iMessageBanner.hasNextLine()){
    		  System.out.println(iMessageBanner.nextLine());
      }
      SOPln(" ");
        //displayMenu Method
        displayMenu(contactList);
        //PART B
        choice = userInput.nextInt();
        //showMsgInfo Method
        showMsgInfo(contactList,choice);
        //PART C
        SOPln("Would you like to view their phone number? [y] Yes [n] No");
        choiceLetter = userInput.next().charAt(0);
        if(choiceLetter == 'y'){
          showPhoneNumber(contactList,choice);
        }else if(choiceLetter == 'n'){
          SOPln(" ");
        }
        SOPln(" ");
        //PART D
        SOPln("Would you like to view another message? [y] Yes [n] No");
        choiceLetter = userInput.next().charAt(0);
        if(choiceLetter == 'y'){
          condition = 2;
          SOPln(" ");
        }else if(choiceLetter == 'n'){
          SOPln(" ");
          SOPln("Exiting iMessage Application...");
          while(goodbyeBanner.hasNext()){
            SOPln(goodbyeBanner.nextLine());
          }
          condition = 1;
        }
        }while(condition >= 2);
   }
  //fillMessage Method
   public static void fillMessage(String fileName, Message[] m)throws IOException{
     String [] token;
     String currLine;
     Scanner fileReader = new Scanner(new File(fileName));
     int i = 0;
     int counter = 1;
     fileReader.nextLine();
     while(fileReader.hasNext()){
        if( counter <= 2){
           currLine = fileReader.nextLine();
           token = currLine.split(", ");
         m[i] = new Message(token[3],Integer.parseInt(token[4]),
                            Integer.parseInt(token[5]),token[6],token[7]);
       }else{
          currLine = fileReader.nextLine();
          token = currLine.split(", ");
         m[i] = new Message();
         m[i].setText(token[3]);
         m[i].setMonth(Integer.parseInt(token[4]));
         m[i].setDay(Integer.parseInt(token[5]));
         m[i].setTime(token[6]);
         m[i].setTimeOfDay(token[7]);
       }
       i++;
       counter++;
     }
   }
   //fillContact Method
   public static void fillContact(String fileName, Contact contact[], Message currMessage[])throws IOException{
     String [] token;
     String currLine;
     Scanner fileReader = new Scanner(new File(fileName));
     int i = 0;
     int counter = 1;
     fileReader.nextLine();
     while(fileReader.hasNext()){
       if (counter<=2){
         currLine = fileReader.nextLine();
         token = currLine.split(", ");
         contact[i] = new Contact(token[0],token[1],token[2],currMessage[i]);
       }else{
         currLine = fileReader.nextLine();
         token = currLine.split(", ");
         contact[i] = new Contact();
         contact[i].setFirstName(token[0]);
         contact[i].setLastName(token[1]);
         contact[i].setPhoneNumber(token[2]);
         contact[i].setCurrMessage(currMessage[i]);
       }
       i++;
       counter++;
     }
   }
    //displayMenu Method
    public static void displayMenu(Contact c[]){
     SOPln("The following people sent you a message: " +
           "\n1. " + c[0].getFirstName() +
           "\n2. " + c[1].getFirstName() +
           "\n3. " + c[2].getFirstName() +
           "\n4. " + c[3].getFirstName() +
           " ");
    SOPln("Please select a contact you would like to view [1-4]:");
    }
    public static void showPhoneNumber(Contact c[], int i){
        i-=1;
        SOPln("Phone Number: " + c[i].getPhoneNumber());
      }
    public static void showMsgInfo(Contact c[], int i){
      i-=1;
      SOPln(" ");
      SOPln("-------------------------------------------------");
      SOPln(" ");
      SOPln("Message from: " + c[i].getFirstName());
      SOPln((c[i].getCurrMessage()).getMonth() + "/" + (c[i].getCurrMessage()).getDay() +
            " " + (c[i].getCurrMessage()).getTime() + " " + (c[i].getCurrMessage()).getTimeOfDay());
      SOPln((c[i].getCurrMessage()).getText());
      SOPln(" ");
      SOPln("-------------------------------------------------");
      SOPln(" ");
    }
    //countContactObj Method
     public static int countContactObj(String fileName)throws IOException{
       Scanner fileReader = new Scanner(new File(fileName));
       int numOfLines = -1;
       String currLine;
       while(fileReader.hasNext()){
         currLine = fileReader.nextLine();
         numOfLines++;
       }
       return numOfLines;
     }
     //System.out.print and System.out.println Methods
     public static void SOPln(String print){
       System.out.println(print);
     }
     public static void SOP(String print){
       System.out.print(print);
     }
 }
