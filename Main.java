// The project start point.
public class Main {

  public static void main(String[] args) {

    // create PrimeCheck point.
    PrimeCheck checkPrime = new PrimeCheck();

    // from console to get User Input Integer to check.
    checkPrime.getUserInteger();

    // Is user's input Prime Number ?
    checkPrime.primeChecker(1);

    // Show the result.
    if ( checkPrime.nIsPrimeNumber) {
      System.out.println("You input is Prime Number.");
    } else {
      System.out.println("You input isn't Prime Number.");
    }
  }
}
