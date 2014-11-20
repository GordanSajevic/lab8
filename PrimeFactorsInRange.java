package lab8;

import java.util.Scanner;

public class PrimeFactorsInRange {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int num1 = unos.nextInt();
		System.out.println("Enter second number: ");
		int num2 = unos.nextInt();
		int prime=0;
		for (int i=num1; i<num2; i++)
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
