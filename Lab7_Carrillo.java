/*
       [STEVEN CARRILLO]
    [CS1101] Lab 7
    Through my submission, I certify that all written code belongs
    to me. I acknowledge that I will be held responsible for my
    dishonesty should the Instructional Team find any evidence of
    academic dishonesty.
*/


public class Lab7_Carrillo{
    //viewListOfStudents
      public static void viewListOfStudents(String[] currentStudent, double[] currentGrade){
         for ( int i = 0; i < currentStudent.length; i++ ){
           SOP(currentStudent[i]);
           SOPln(" : " + letterGrade(currentGrade[i]));
         }
      }
    //classAverage
      public static int classAverage(double [] totalGrades){
        int grades = 0;
        int counter = 0;
        int average = 0;
        for(int i = 0; i < totalGrades.length; i++){
        grades += totalGrades[i];
        counter++;
      }
          average = grades/counter;
          return average;
      }
    //isSameLength
    public static boolean isSameLength(int x, int y){
      if (x == y){
        return true;
      }else return false;
    }
    //topThree
    public static void topThree(String[] currentStudent, double[] currentGrade){
      int numberOne = max(currentGrade);
      double originalOne = currentGrade[numberOne];
      currentGrade[numberOne] = 0;
      int numberTwo = max(currentGrade);
      double originalTwo = currentGrade[numberTwo];
      currentGrade[numberTwo] = 0;
      int numberThree = max(currentGrade);
        SOPln("Top 3 Students");
        SOPln("  >" + currentStudent[numberOne]);
        SOPln("  >" + currentStudent[numberTwo]);
        SOPln("  >" + currentStudent[numberThree]);
      currentGrade[numberOne] = originalOne;
      currentGrade[numberTwo] = originalTwo;

}
public static int max(double[] grades){
 double max = 0;
int position = 0;
   for(int i = 0; i < grades.length; i++){
     if(max < grades[i]){
       max = grades[i];
       position = i;
     }
   }return position;
 }
 //SOP and SOPln method
 public static void SOPln(String print){
   System.out.println(print);
 }
 public static void SOP(String print){
   System.out.print(print);
   }
    //letterGrade
    public static char letterGrade(double currentGrade){
      if(currentGrade <= 100 && currentGrade >= 90){
        return 'A';
      }else if(currentGrade < 90 && currentGrade >= 80){
        return 'B';
      }else if(currentGrade < 80 && currentGrade >= 70){
        return 'C';
      }else if(currentGrade < 70 && currentGrade >= 60){
        return 'D';
      }else if(currentGrade < 59){
        return 'F';
      }
      else {
        return '?';
      }
    }

  public static void main( String [] args ){
    String [] studentList = new String[] {"Diana Valles","Jorge Topete",
                                          "Ruth Trejo","Alex Saenz",
                                          "Amelia Grada","James Illarramendi","Silas Deng"};
    double [] studentGradeList = new double[] {98.28,94.40,
                                               74.82,76.54,
                                               85.68,68.36,47.32};

            if(isSameLength(studentList.length,studentGradeList.length)){
                    viewListOfStudents(studentList,studentGradeList);
                  SOPln("");
                    topThree(studentList, studentGradeList);
                  SOPln("");
                    SOPln("The class average is " + classAverage(studentGradeList) + ".");
                    }
                else SOP("Your arrays are not the same size.");

  }
}
