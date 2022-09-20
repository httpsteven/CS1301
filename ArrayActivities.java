public class ArrayActivities {
    public static void main(String[] args){
        String[] names = {"Ruth", "Jorge", "Diana", "Salamah", "Juan"};
        // Not for tracing.
        int[] numArray = {1, 10, 5, 20, 9, 0};
        String[] stringArray = {"Computers", "Jeans", "Water Bottles", "Dogs", "Apples"};

        System.out.println("First element from numsArray " + numArray[0]);
        System.out.println("First element from thingsArray " + stringArray[0]);
        /*Print the last element from both arrays. Hint: You may want to use .length*/
        int lastElementNum = (numArray.length-1);
        int lastElementString = (stringArray.length-1);
        System.out.println("Last element from numsArray " + numArray[lastElementNum]);
        System.out.println("Last element from thingsArray " + stringArray[lastElementString]);
        /*Print everything from both numsArray and thingsArray. Hint: Use loops*/
        System.out.println("Second element from numsArray " + numArray[1]);
        System.out.println("Third element from thingsArray " + stringArray[2]);
        /* The following for loop should iterate through both arrays and print
         * all the elements. But there is a problem, can you fix it?
        */
        for (int i = 0; (i < numArray.length) && (i < stringArray.length); i++) {
            System.out.printf("%d %s,", numArray[i], stringArray[i]);

              System.out.println(findName(names, Ruth, 0));
       }
        /*Given the following for loop declaration, how would you fix the previous problem?
        * We need to be able to print everything from both arrays.
        */

}
        /*
            Write a recursive method that finds a name, you may use the names array which is declared at the top.
            Method signature: findName(String[] array, String target, int i);
         */
        public static boolean findName(String array, String target, int i){
          if (i == array.length){
            return false;
          }
          else if (array[i].equals(target)){
            return true;
          }
          else {
            return findName(array, target, i + 1);
          }
        }
}
