import java.util.Scanner;
import java.util.ArrayList;

public class PrimeCheck {

    /*
      use primeNumbers ArrayList to storage all primeNumbers
      that is small then you input,
    */

  ArrayList<Integer> primeNumbers = new ArrayList<>();

    /* 
     * returnVar is for isPrimeNumber function
     * Because I cannot pass var inside to ArrayList's forEach
     * I just know this way to pass.
     */
  boolean returnVar;

    /*
     * nIsPrimeNumber is mark user input int is prime number or not.
     */
  boolean nIsPrimeNumber = true;

  Integer userNumber ;

  boolean isPrimeNumber(int n) {
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

  // check the User input integer.
  void primeChecker(Integer i) {
    i += 1 ;
    // the last element in PrimeNumbers List.
    Integer lastPrimeNumberInList = 1;
    if ( this.primeNumbers.size() != 0 ) {
      // get the last element from primeNumbers List.
      lastPrimeNumberInList = this.primeNumbers.get( this.primeNumbers.size() - 1 ) ;
    } 
    // Is i Prime Number ?
    if ( this.isPrimeNumber(i) ) {
      // Add i to primeNumbers List if i is Prime Number.
      this.primeNumbers.add(i);
      // Check the user's input Integer can divide by i.
      if ( ( this.userNumber % i ) == 0 ) {
        // If can divide by i, it isn't Prime Number.
        this.nIsPrimeNumber = false;
      } else {
        // Check i is small and inside the possible Integer range.
        if ( i < ( this.userNumber / lastPrimeNumberInList ) ) {
          // Check again.
          primeChecker(i);
        }
      }
    } else {
      // If now the i isn't Prime Number.
      // and the i still inside the possible Integer range
      if ( i <  ( this.userNumber / lastPrimeNumberInList ) ) {
        // Check again.
        primeChecker(i);
      }
    }
  }

  // Get User Input positive Integer from console.
  void getUserInteger() {
    Scanner userInputNumber = new Scanner(System.in);
    System.out.println("Enter a positive integer.");
    this.userNumber = userInputNumber.nextInt();
    userInputNumber.close();
  }

}
