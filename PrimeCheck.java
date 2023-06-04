/**
 * This code is a Java program that checks 
 * if a given positive integer is a prime number. 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeCheck {

  // ArrayList to store all prime numbers smaller than the user's input
  ArrayList<Integer> primeNumbers = new ArrayList<>();
  
  boolean returnVar;

  // Flag to mark if the user input is a prime number or not
  boolean nIsPrimeNumber = true;

  // User input integer
  Integer userNumber ;

  // Function to check if a number is prime
  boolean isPrimeNumber(int n) {
    returnVar = true; 
    // 1 is not prime number.
    if ( n == 1 ) {
      returnVar = false;
    } else {
      
      // Check if n is divisible by any number in primeNumbers list
      primeNumbers.forEach((p) -> {
        if (( n % p )  == 0) {
          returnVar = false;
        }
      });
    }
    return returnVar;
  }

  // Function to check the user input integer
  void primeChecker(Integer i) {
    i += 1 ;
    
    // Get the last element in the primeNumbers list
    Integer lastPrimeNumberInList = 1;
    if (primeNumbers.size() != 0 ) {
      lastPrimeNumberInList = this.primeNumbers.get( this.primeNumbers.size() - 1 ) ;
    }
    
    // Check if i is a prime number
    if ( isPrimeNumber(i) ) {
      // Add i to primeNumbers List if it is a prime number.
      primeNumbers.add(i);
      
      // Check if the user's input Integer can divide by i.
      if ( ( userNumber % i ) == 0 ) {
        nIsPrimeNumber = false;
      } else {
        // Check if i is small and within the possible integer range
        if ( i < ( this.userNumber / lastPrimeNumberInList ) ) {
          // Recursively Check again.
          primeChecker(i);
        }
      }
    } else {
      // If i is not a prime number and still within the possible integer range
      if ( i <  ( this.userNumber / lastPrimeNumberInList ) ) {
        // Recursively Check again.
        primeChecker(i);
      }
    }
  }

  // Function to get the user input positive integer from the console
  void getUserInteger() {
    Scanner userInputNumber = new Scanner(System.in);
    System.out.println("Enter a positive integer.");
    this.userNumber = userInputNumber.nextInt();
    userInputNumber.close();
  }

}
