//Fernndo Sepulveda
//Isaac Borjon
//Steven Carrillo
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class carMain{
  public static void main(String [] args)throws IOException{
    Scanner fileReader = new Scanner(new File("car-list.txt"));
    Car Elantra = new Car();
    Car Civic = new Car();

    //skip header in file
    //TESTING
/*    fileReader.nextLine();
    String [] token;
    String currLine = "";
       currLine = fileReader.nextLine();
       token = currLine.split(",");

      Elantra.setmake(token[0]);
      Elantra.setmodel(token[1]);
      Elantra.setyear(Integer.parseInt(token[2]));
      Elantra.setcolor(token[3]);
      Elantra.sethorsePower(Integer.parseInt(token[4]));
      Elantra.setprice(Integer.parseInt(token[5]));

      currLine = fileReader.nextLine();
      token = currLine.split(",");

       Civic.setmake(token[0]);
       Civic.setmodel(token[1]);
       Civic.setyear(Integer.parseInt(token[2]));
       Civic.setcolor(token[3]);
       Civic.sethorsePower(Integer.parseInt(token[4]));
       Civic.setprice(Integer.parseInt(token[5]));

     currLine = fileReader.nextLine();
     token = currLine.split(",");

     Car KFive = new Car(token[0],token[1],Integer.parseInt(token[2]),token[3],Integer.parseInt(token[4]),Integer.parseInt(token[5]));
     currLine = fileReader.nextLine();
     token = currLine.split(",");
     Car Camaro = new Car(token[0],token[1],Integer.parseInt(token[2]),token[3],Integer.parseInt(token[4]),Integer.parseInt(token[5]));
     fileReader.close();*/

     //fillCar1("car-list.txt",c);
     Car [] carList = new Car[ countCarObj("car-list.txt") ];

     fillCar("car-list.txt", carList);
     System.out.println("Cheapest Car: " + cheapestCar(carList).getmodel());
     cheapestCar(carList);
     System.out.println("Best Horsepower: " + bestHorsePower(carList).getmodel());
     bestHorsePower(carList);



  }
  public static void fillCar(String fileName, Car car[])throws IOException{
    String [] token;
    String currLine;
    Scanner fileReader = new Scanner(new File(fileName));
    int i = 0;
    int counter = 1;
    fileReader.nextLine();
    while(fileReader.hasNext()){
      if (counter<=2){
        currLine = fileReader.nextLine();
        token = currLine.split(",");
      car[i] = new Car(token[0],token[1],Integer.parseInt(token[2]),token[3],Integer.parseInt(token[4]),Integer.parseInt(token[5]));
    }else{
      currLine = fileReader.nextLine();
      token = currLine.split(",");
      car[i] = new Car();
      car[i].setmake(token[0]);
      car[i].setmodel(token[1]);
      car[i].setyear(Integer.parseInt(token[2]));
      car[i].setcolor(token[3]);
      car[i].sethorsePower(Integer.parseInt(token[4]));
      car[i].setprice(Integer.parseInt(token[5]));
    }
    System.out.println( "Car Make: " + car[i].getmake() );
    System.out.println( "Car Model: " + car[i].getmodel() );
    System.out.println( "Car Year: " + car[i].getyear() );
    System.out.println( "Car Color: " + car[i].getcolor() );
    System.out.println( "Car Horsepower: " + car[i].gethorsePower() );
    System.out.println( "Car Price: " + car[i].getprice() );
    System.out.println("-----------------------------------------");
    i++;
     counter++;
  }
}
  public static int countCarObj(String fileName)throws IOException{
    Scanner fileReader = new Scanner(new File(fileName));
    int numOfLines = 0;
    String currLine;
    while(fileReader.hasNext()){
      currLine = fileReader.nextLine();
      numOfLines++;
    }
    numOfLines-=1;
    return numOfLines;
  }
  public static Car cheapestCar(Car car[])throws IOException{
    int min = 0;
   int position = 0;
      for(int i = countCarObj("car-list.txt")-1; i >= 0; i--){
        if(min > car[i].getprice()){
          min = car[i].getprice();
          position = i;
        }
      }position+=1;
      return car[position];
    }

  public static Car bestHorsePower(Car car[]){
    int max = 0;
   int position = 0;
      for(int i = 0; i < car.length; i++){
        if(max < car[i].gethorsePower()){
          max = car[i].gethorsePower();
          position = i;
        }
      }return car[position];
    }
}
