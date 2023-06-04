/** 
 * This code is the main class that serves 
 * as the entry point for the program. 
 * It utilizes the PrimeCheck class to check 
 * if a user-input integer is a prime number. 
 */
public class Main {

  public static void main(String[] args) {

    PrimeCheck checkPrime = new PrimeCheck();

    // Prompt the user to enter an integer for checking
    checkPrime.getUserInteger();

    // Check if the user's input is a prime number
    checkPrime.primeChecker(1);

    /** 
     * Display the result based on 
     * whether the input is a prime number or not.
     */
    if ( checkPrime.nIsPrimeNumber) {
      System.out.println("You input is Prime Number.");
    } else {
      System.out.println("You input isn't Prime Number.");
    }
  }
}
