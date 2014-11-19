package lab8;

import java.util.Scanner;

public class SumPrimeIntegerNegative {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double number;
		double prime=0;
		double nonInteger=0;
		int negative=0;
		double sum=0;
		do{
			number = unos.nextDouble();	
			if (number<0)
			{
				negative++;
			}
			if (number-(int) number != 0)
			{
				nonInteger++;
			}
			for (int i=2; i<number; i++)
			{
				if (number%i==0)
				{
					prime++;
				}
			}
			sum=sum+number;
		}while(number!=0);
		if (negative!=0)
		{
			System.out.println("Not all numbers are positive.");
		}
		else
		{
			System.out.println("All numbers are positive.");
		}
		if (nonInteger!=0)
		{
			System.out.println("Not all numbers all integer.");
		}
		else
		{
			System.out.println("All numbers are integer.");
		}
		if (prime==0)
		{
			System.out.println("All numbers all prime");
		}
		else
		{
			System.out.println("Not are numbers are prime.");
		}
		System.out.println("Sum = " + sum);
	}
}
