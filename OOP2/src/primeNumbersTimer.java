/*
 * Kübra YAYLA
 * problem:
 *  There are 25 primes between 2 and 100, and there are 1229 primes between
2 and 10,000. Write a program that inputs a positive integer N  2 and
displays the number of primes between 2 and N (inclusive). Use the timing
technique explained in Section 6.9 to show the amount of time it took to
compute the result.
 *Date:19.07.2022
 */

import java.util.Date;
import java.util.Scanner;

public class primeNumbersTimer {

	public static void main(String[] args) {
     
		Scanner s = new Scanner(System.in);
		System.out.println("please enter N");
		int N = s.nextInt();  // getting N
		
		//searching prime numbers in this interval
		//get a counter to find how many numbers are divisible to the i
		 
		int counter=0;
		int i;
		Date startTime = new Date();
		for( i=2; i<N; i++)
		{
			boolean prime = true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
					prime = false;
					break;
			}
		 
		
		//printing the prime numbers
			if(prime)
			{
				counter++;
				System.out.println(i);
			}
		}
		Date endTime = new Date();
		System.out.println("number of prime numbers between 2 and "+N+" is "+counter);
		System.out.println("it took "+ (endTime.getTime()-startTime.getTime()));
	 
	}
	
}
