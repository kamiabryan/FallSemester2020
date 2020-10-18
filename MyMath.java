/*
 * Kamia Bryan
 * Comp 163
 * My Math
 * 
 * Instead of accessing Java's Math class, this application 
 * creates several methods from the math class from scratch
 *  
 */

//method that converts an angle in radians to an angle in degrees
public class MyMath {
    public static double toDegrees(double angleInRadians) {
        //constant value of pi
        double PI = 3.141592653589793;   
        //math to get the angle in degrees
        double angleInDegrees = angleInRadians * (180 / PI);    
        return angleInDegrees;
    }

    //method that converts an angle in degrees to an angle in radians
    public static double toRadians(double angleInDegrees) {
        //constant value of pi
        double PI = 3.141592653589793;   
        //math to get the angle in radians
        double angleInRadians = angleInDegrees * (PI / 180); 
        return angleInRadians;
    }

    // method that gets the absolute value of a number
    public static double absoluteValue(double absValNum) {
        //checks if userInput is less than 0
        //if it is, multiplies value by -1
        if (absValNum < 0) {   
            absValNum *= -1;    
        }
        //checks if userInput is greater than 0
        // if it is, multiplies value by 1
        if (absValNum > 0) {   
            absValNum *= 1;     
        }
        return absValNum;
    }

    // method that gets the maximum number from 2 user inputs
    public static double maximum(double userNum1, double userNum2) {
        double maxNum = 0;
        //checks if userNum1 is greater than userNum2
        //and if it is, assigns that value to maxNum;
        if (userNum1 > userNum2) {  
            maxNum = userNum1; 
        }
        //checks if userNum2 is greater than userNum1
        // and if it is, assigns that value to maxNum;
        else if (userNum2 > userNum1) { 
            maxNum = userNum2;  
        }
        //if userNum1 and userNum2 are equal, assigns either value to maxNum
        else { 
            maxNum = userNum1;
        }
        return maxNum;
    }

    //method that gets the minimum number from 2 user inputs
    public static double minimum(double userNum1, double userNum2) {
        double minNum = 0;
        //checks if userNum1 is less than
        //userNum2 and if it is, assigns that value to minNum
        if (userNum1 < userNum2) {  
            minNum = userNum1; 
        }
        //checks if userNum2 is less than
        //userNum1 and if it is, assigns that value to minNum
        else if (userNum2 < userNum1) { 
            minNum = userNum2;  
        }
        //if userNum1 and userNum2 are equal, assigns either value to minNum
        else { 
            minNum = userNum1;
        }
        return minNum;
    }

    //method that returns the power of a number
    public static double power (double baseNum, int exponent) {
        double powerNum = 1;
        //if statement to return 1 if the exponent is 1
        //because any base raised to 0 is 1
        if (exponent == 0) {    
            return 1;
        }
        //for loop to multiply the base by the exponent
        for (int i = 1; i <= exponent; i++) {   
            powerNum = powerNum * baseNum;
        }
        return powerNum;
    }   

    //method that returns greatest common denominator from 2 user inputs
    public static int gcd (int userInput1, int userInput2) {
        int gcd = 0;
        //loop is accessing numbers up to and including the smallest number
        //a number that goes evenly in both numbers will be the gcd
        for (int i = 1; i <= userInput1 && i <= userInput2; i++) {  
            if ((userInput1 % i == 0) && (userInput2 % i == 0)) {
                gcd = i;    
            }
        }
        return gcd;
    }

    //method that returns the least common multiple from 2 user inputs;
    public static int lcm (int userInput1, int userInput2) {
        //using gcd method to get the gcd and divide it by product of both inputs
        int lcm = (userInput1 * userInput2) / gcd(userInput1, userInput2);
            return lcm;
    }

    //method that returns the sine of a user input
    public static double sine(double userAngle) {
        //repeadedly add 2pi to userAngle if less than pi
        if(userAngle < -3.141592653589793) {
            while (userAngle < -3.141592653589793) {
                userAngle = userAngle + (2 * 3.141592653589793);
            }
        }
        //repeadedly subtract 2pi from userAngle if greater than pi
        else if (userAngle > 3.141592653589793 ) {
            while (userAngle < -3.141592653589793 || userAngle > 3.141592653589793) {
                userAngle = userAngle - (2 * 3.141592653589793);
            }
        }
            
        double sine = 0;
        int i = 0;

        //while loop that establishes precision
        while(true) {
            if (absoluteValue(userAngle) < 0.00000001) {
            break;
        } 
            else {
            sine += userAngle;
            userAngle = userAngle * ((-1 * userAngle * userAngle)/(((2*i)+3)*((2*i)+2)));
        }
        i++;
        }

        sine += userAngle;
        return sine;
    }

    //method that returns the cosine of user input
    public static double cosine(double userAngle) {
        //repeadedly add 2pi if less than pi
        if(userAngle < -3.141592653589793) {
            while (userAngle < -3.141592653589793) {
                userAngle = userAngle + (2 * 3.141592653589793);
            }
        }
        //repeadedly subtract 2pi from userAngle if greater than pi
        else if (userAngle > 3.141592653589793 ) {
            while (userAngle < -3.141592653589793 || userAngle > 3.141592653589793) {
                userAngle = userAngle - (2 * 3.141592653589793);
            }
        }
                
        double sine = 0;
        int i = 0;

        //while loop that establishes precision        
        while(true) {
            if (absoluteValue(userAngle) <0.00000001) {
                break;
            } 
            else {
                sine += userAngle;
                userAngle = userAngle * ((-1 * userAngle * userAngle)/(((2*i)+2)*((2*i)+1)));
            }
            i++;
        }
            sine += userAngle;
            return sine;
    }
        

    //method that returns the tangent of user input
    public static double tangent (double userInput) {
        //tangent is equal to sin / cos
        double tangent = sine(userInput) / cosine(userInput);
        return tangent;
    }

    //i included this method to test my above methods
    public static void main(String[] args) {
        System.out.println(toDegrees(3.14));
        System.out.println(toRadians(180));
        System.out.println(absoluteValue(-18.9));
        System.out.println(maximum(1.999999,2));
        System.out.println(minimum(1.999999,2));
        System.out.println(power(6.7, 3));
        System.out.println(gcd(55, 121));
        System.out.println(lcm(1, 6));
        System.out.println(sine(1.047197551));
        System.out.println(cosine(1.047197551));
        System.out.println(tangent(1.047197551));


    }
}
