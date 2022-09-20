
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader{

  public static void main(String[] args) throws FileNotFoundException{

      Scanner scan = new Scanner(new File("CustomerCopy.txt"));
      scan.nextLine();
      while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
      }
  }
}
