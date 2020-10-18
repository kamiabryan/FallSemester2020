/* Kamia Bryan
* Is Even or Odd
* This application will prompt the user how many grades they would like to 
* enter. Then, determine if the numbers the user inputted is all even, odd, or neither
*/
import java.util.Scanner; 

public class IsEvenorIsOdd {
   
   public static boolean isArrayEven(int[] arrayValues, int arraySize) {
      boolean isEven = true;
      int i = 0;
      for (i = 0; i < arraySize; i++) {
          if (arrayValues[i] % 2 != 0) {
              isEven = false;
              break;
          }
      }
      return isEven;
   }
   public static boolean isArrayOdd(int[] arrayValues, int arraySize) {
      boolean isOdd = true;
      int i = 0;
      for (i = 0; i < arraySize; i++) {
          if (arrayValues[i] % 2 == 0) {
            isOdd = false;
          }
      }
      return isOdd;
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter how many elements you will enter: ");
      int numElements = scanner.nextInt();
      int[] numArray = new int[numElements];
      int i;

      System.out.println("Enter your numbers here:");
      
      for (i = 0; i < numElements; i++) {
         numArray[i] = scanner.nextInt();
      }
      
      isArrayEven(numArray, numElements);
      isArrayOdd(numArray, numElements);
      
      if (isArrayEven(numArray, numElements) == true) {
         System.out.println("all even");
      }
      else if (isArrayEven(numArray, numElements) == false && isArrayOdd(numArray, numElements) == true) {
         System.out.println("all odd");
      }
      else {
         System.out.println("not even or odd");
      }
      
   }
}
