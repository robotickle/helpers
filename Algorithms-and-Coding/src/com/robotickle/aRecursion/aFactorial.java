package com.robotickle.aRecursion;

import java.math.BigInteger;

//https://www.geeksforgeeks.org/program-for-factorial-of-a-number/
public class aFactorial {

    //Recursive - easier to read, and good for smaller number.
    public static int factorialRecursive(int num) {
        if (num == 0) {    // Since, 0! =1  and 1! = 1 not defined for -ve
            return 1;
        } else {
            return num * (factorialRecursive(num - 1));
        }
    }

    //Driver
    public static void main(String[] args) {
        //int printresult = factorialRecursive(31); //After this int overflows, start using BigInteger.
        int printresult = factorialIterative(5); //After this int overflows, start using BigInteger.
        System.out.println("Factorial for given number is : " + printresult);
    }


    //Iterative - good for bigger number.
    public static int factorialIterative(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

}
