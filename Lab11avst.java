// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.
import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ===>>  ");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        int list[] = new int[101];
        //Treat all numbers as prime
        //Write a loop that changes ALL numbers to prime (true) in the array.
        for(int k = 2; k < primes.length; k++){
            //Change all values to true here
            primes[k] = true;
        }
        for(int c = 2; c < primes.length; c++){
            for(int k = 2 * c; k < primes.length; k+=c){
                primes[k] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        int counting = 0;

        for(int k = 2; k < primes.length; k++) {
            if (primes[k] == true){
                System.out.print(k + " ");
                counting++;
                if(counting == 15){
                    counting = 0;
                    System.out.println();
                }
            }
        }
    }
}





