
/*
 * Kamia Bryan
 * Comp 163
 * My Arrays
 * 
 *  Instead of accessing Java's Arrays class, this application 
 * creates several methods from the array class from scratch
 *  
 */
public class MyArrays {
    //method to search an array for a key between a start and end position
    //and return index value
    public static int linearSearch(int[] linearSearchArray, int numKey, int startPos, int endPos){
        //if array element = to the key, return index, else -1
        for (int i = startPos; i < endPos; i++){
            if (linearSearchArray[i] == numKey){
                return i;
            }
        }
        return -1;
    }

    //method to search an array for a key and return the index value
    public static int linearSearch(int[] linearSearchArray, int numKey){
        for (int i = 0; i < linearSearchArray.length; i++ ){
           //if array element = key, return index, else -1
            if (linearSearchArray[i] == numKey){
                return i;
            }
        }
        return -1;
    }

    //method that checks if 2 arrays are equal
    public static boolean equals(int[] equalArray, int[] equalArray2){
        //if first element in 1st array is not equal to 2nd array false is returned, else true 
        if (equalArray == null && equalArray2 == null){
            return true;
        }
        if (equalArray.length == equalArray2.length){
           for (int i = 0; i < equalArray.length; i++) {
                if (equalArray[i] != equalArray2[i]){
                    return false;
                }
           }
       }
       return true;
    }

    //method that fills an array with an arbitrary value between a start and end position
    public static void fill(int[] fillArray, int arbValue, int startPos, int endPos){
        //if start position is = to the end position, original array is returned else
        //arbitrary value fills the range
        if (startPos == endPos){
            for (int i = 0; i < fillArray.length; i++){
                System.out.print(fillArray[i] + " ");
            }
        } 
        else {
            for (int i = 0; i < startPos; i++){
                System.out.print(fillArray[i] + " ");
            }
    
            for (int i = startPos; i < endPos; i++){
                System.out.print(arbValue + " ");
            }
    
            for (int i = endPos; i < fillArray.length; i++){
                System.out.print(fillArray[i] + " ");
            }
        } 
    }

    // method that assigns an arbitrary value to each element in the array 
    public static void fill(int[] fillArray, int arbValue){
        for (int i = 0; i < fillArray.length; i++){
            System.out.print(arbValue + " ");
        }
    }

    //method that copies the elements in a given range into another array 
    public static int[] copyOf(int[] copyOfArray, int startPos, int endPos) {
        int[] newArray = new int[copyOfArray.length];

        //if start position is = to end position, return original array else
        //range is copied into another array and returned
        if (startPos == endPos){
            return copyOfArray;
        }
        for (int i = startPos; i < endPos; i++){
            newArray[i] = copyOfArray[i];
        }
        return newArray;  
    }

    //method that copies an array and returns the copied array
    public static int[] copyOf(int[] copyOfArray){
        int[] newArray = new int[copyOfArray.length];
        
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = copyOfArray[i];
        }
        return newArray;
    }

    //method that returns the given range in ascending order
    public static void sort(int[] sortArray, int startPos, int endPos){
        //loops swap array elements within the range in ascending order 
        for (int i = startPos; i < sortArray.length; i++){
            for (int k = i + 1; k < endPos; k++){
                int tempVal = 0;
                if (sortArray[i] > sortArray[k]){
                    tempVal = sortArray[i];  
                    sortArray[i] = sortArray[k];  
                    sortArray[k] = tempVal;
                }
            }
        }
        
        for (int value: sortArray) {     
            System.out.print(value + " ");    
        }
    }

    //method that returns the given array in ascending order
    public static void sort(int[] sortArray){
        for (int i = 0; i < sortArray.length; i++){
            for (int k = i + 1; k < sortArray.length; k++){
                int tempVal = 0;
                if (sortArray[i] > sortArray[k]){
                    tempVal = sortArray[i];  
                    sortArray[i] = sortArray[k];  
                    sortArray[k] = tempVal;
                }
            }
        }
        for (int value: sortArray) {     
            System.out.print(value + " ");    
        }
    }

    //method that returns the content of an array as a string
    public static String toString(int[] stringArray){
        String newString = "";
        
        if (stringArray == null || stringArray.length == 0){
            return "null";
        }
        //loop adds the array element to the initialized string
        //when the last value is reached, a bracket is added to the end 
        else {
            System.out.print('[');
            for (int i = 0; i < stringArray.length; i++){
                if (i == stringArray.length - 1){
                    newString = newString.concat(stringArray[i] + "]");
                } 
                else {
                    newString = newString.concat(stringArray[i] + ", ");
                }
            }
        }
        return newString;
    } 

    public static void main(String[] args) {
        //linear search
        int[] linearSearchArray = {4, 5, 6, 5, 7, 1, 5, 9};
        System.out.println(linearSearch(linearSearchArray, 5, 2, 7));
        System.out.println(linearSearch(linearSearchArray, 5));

        //equal array
        int[] equalArray =  {1, 3, 3};
        int[] equalArray1 = {1, 3, 3};
        System.out.println(equals(equalArray, equalArray1));

        //fill array
        int[] fillArray  =  {2, 3, 5, 7, 11, 13, 17, 19};
        fill(fillArray, 0, 2, 6); 
        System.out.println();
        fill(fillArray, 0); 
        System.out.println();

        //copyof array
        int[] copyOfArray = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] newArray = copyOf(copyOfArray, 2, 6);
        for (int value: newArray){
            System.out.print(value + " ");
        }
        System.out.println();

        //second copyof array
        int[] newArray2 = copyOf(copyOfArray);
        for (int i = 0; i < newArray2.length; i++){
            if (i == newArray2.length - 1){
                System.out.print(newArray2[i]);;
            }
            else {
                System.out.print(newArray2[i] + ", ");
            }
        }
        System.out.println();

        //sort method
        int[] sortArray = {6, 2, 5, 7, 1, 8, 4, 3};
        sort(sortArray, 2, 6);
        System.out.println();
        sort(sortArray);
        System.out.println();

        //to string method
        int[] stringArray = {6, 2, 5, 7, 1, 8, 4, 3};
        System.out.println(toString(stringArray));
    }
}