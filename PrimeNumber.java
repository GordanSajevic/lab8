package lab8;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter number: ");
		int broj = unos.nextInt();
		int primeOrNot = 0;
		for (int i=2; i<broj; i++)
		{
			if (broj%i==0)
			{
				primeOrNot++;
			}
		}
		if (primeOrNot!=0)
		{
			System.out.println("Number is not prime!");
		}
		else
		{
			System.out.println("Numer is prime!");
		}
	}
}
