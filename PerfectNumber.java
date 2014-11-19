package lab8;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Enter number: ");
		double number = unos.nextDouble();
		double sum=0;
		for (int i=1; i<number; i++)
		{
			if (number%i==0)
			{
				sum=sum+i;
			}
		}
		if (number==sum)
		{
			System.out.print("Number is perfect!");
		}
		else
		{
			System.out.println("Number is not perfect.");
		}
	}

}
