package TailRecursion;

import java.util.Scanner;
public class TailRecursion {
	public static int gcd (int a, int b) {
	    if (a == 0) {
	        return b;
	    }
	    if (b == 0) {
	        return a;
	    }
	    if (a > b) {
	        return gcd (a % b, b);
	    }
	    else {
	        return gcd (a, b % a);
	    }
	}
	public static void main (String [] args) {
	    try (Scanner sc = new Scanner (System.in)) {
			System.out.print ("Enter the first number: ");
			int a = sc.nextInt ();
			System.out.print ("Enter the second number: ");
			int b = sc.nextInt ();
			int result = gcd (a, b);
			System.out.println ("\nThe GCD of " + a + " and " + b + " is " + result + ".");
		}
	}
}