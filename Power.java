package lab8;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter number: ");
		int number = unos.nextInt();
		System.out.println("Enter power: ");
		int power = unos.nextInt();
		int result=1;
		for (int i=0; i<power; i++)
		{
			result=result*number;
		}
		System.out.println("Power of number " + number+" with " + power + " is " + result);
	}

}
