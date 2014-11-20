package lab8;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter number: ");
		int number = unos.nextInt();
		int prime=0;
		for (int i=2; i<number; i++)
		{
			prime=0;
			for (int j=2; j<i; j++)
			{
				
				if (i%j==0)
				{
					prime++;
				}
			}
			if (prime == 0)
			{
				System.out.println(i);
			}
			
		}

	}

}
