package lab8;

import java.util.Scanner;

public class NumbersSumDivisors {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int num1 = unos.nextInt();
		System.out.println("Enter second number: ");
		int num2 = unos.nextInt();
		int  sum = 0;
		for (int i=num1; i<=num2; i++)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for (int i=num1; i<=num2; i++)
		{
			int j=i;
			sum = 0;
			while (j>0)
			{
				if (i%j==0)
				{
					sum = sum + j;
				}
				j--;
			}
			System.out.print(sum + " ");
			
		}
	}

}
