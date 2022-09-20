//Fernndo Sepulveda
//Isaac Borjon
//Steven Carrillo
public class Car{
  private String make;
  private String model;
  private int year;
  private String color;
  private int horsePower;
  private int price;
  //CONSTRUCTORS
  public  Car(){
  }
  public Car(String make, String model, int year, String color, int horsePower, int price){
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.horsePower = horsePower;
    this.price = price;
  }
  //SETTERS
  public void setmake(String make){
    this.make = make;
  }
  public void setmodel(String model){
    this.model = model;
  }
  public void setyear(int year){
    this.year = year;
  }
  public void setcolor(String color){
    this.color = color;
  }
  public void sethorsePower(int horsePower){
    this.horsePower = horsePower;
  }
  public void setprice(int price){
    this.price = price;
  }
  //GETTERS
  public String getmake(){
    return make;
  }
  public String getmodel(){
    return model;
  }
  public int getyear(){
    return year;
  }
  public String getcolor(){
    return color;
  }
  public int gethorsePower(){
    return horsePower;
  }
  public int getprice(){
    return price;
  }
}
