public class Main {

  public static void main(String[] args) {

    PrimeCheck checkPrime = new PrimeCheck()

    int userNumber = checkPrime.getUserInteger();


    // find all prime number that is small then user Input Number.
    // and bigger then 1.
    for (int i = 2; i < (userNumber + 1); i++ ) {
      if (checkPrime.isPrimeNumber(i)) {
	// If find a prime number add into primeNumbers array list.
        checkPrime.primeNumbers.add(i);
      }
    }

    // check user input number is or isn't in primeNumbers list.
    // if user input number is in primeNumbers that is prime number.
    checkPrime.primeNumbers.forEach((p) -> {
      if ( p == userNumber ) {
        checkPrime.nIsPrimeNumber = true;
      }
    });

    if ( checkPrime.nIsPrimeNumber) {
      System.out.println("You input is Prime Number.");
    } else {
      System.out.println("You input isn't Prime Number.");
    }
  }
}
