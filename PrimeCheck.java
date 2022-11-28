import java.util.Scanner;
import java.util.ArrayList;

public class PrimeCheck {

    /*
      use primeNumbers ArrayList to storage all primeNumbers
      that is small then you input,
    */

  static ArrayList<Integer> primeNumbers = new ArrayList<>();

    /* 
     * returnVar is for isPrimeNumber function
     * Because I cannot pass var inside to ArrayList's forEach
     * I just know this way to pass.
     */
  static boolean returnVar;

    /*
     * nIsPrimeNumber is mark user input int is prime number or not.
     */
  static boolean nIsPrimeNumber = false;

  static boolean isPrimeNumber(int n) {
    returnVar = true; 
    // 1 is not prime number.
    if ( n == 1 ) {
      returnVar = false;
    } else {
      primeNumbers.forEach((p) -> {
	// if the number can dividing into items in primeNumber
	// it is not prime Number.
        if (( n % p )  == 0) {
          returnVar = false;
        }
      });
    }
    return returnVar;
  }

  static int getUserInteger() {
    Scanner userInputNumber = new Scanner(System.in);
    System.out.println("Enter a positive integer.");
    int userNumber = userInputNumber.nextInt();
    userInputNumber.close();
    return userNumber;
  }

  public static void main(String[] args) {

    int userNumber = getUserInteger();


    // find all prime number that is small then user Input Number.
    // and bigger then 1.
    for (int i = 2; i < (userNumber + 1); i++ ) {
      if (isPrimeNumber(i)) {
	// If find a prime number add into primeNumbers array list.
        primeNumbers.add(i);
      }
    }

    // check user input number is or isn't in primeNumbers list.
    // if user input number is in primeNumbers that is prime number.
    primeNumbers.forEach((p) -> {
      if ( p == userNumber ) {
        nIsPrimeNumber = true;
      }
    });

    if (nIsPrimeNumber) {
      System.out.println("You input is Prime Number.");
    } else {
      System.out.println("You input isn't Prime Number.");
    }
  }
}
