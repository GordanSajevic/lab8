package lab8;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double sum=0;
		double product=0;
		double quotient=0;
		double modulus=0;
		System.out.println("Enter first number: ");
		double num1 = unos.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = unos.nextDouble();
		while ((num1!=0) && (num2!=0))
		{
			sum = num1 + num2;
			product = num1 * num2;
			quotient = num1 / num2;
			modulus = num1 % num2;
			System.out.println("Sum= " + sum + "\nProduct = " + product + "\nQuotient = " + quotient + "\nModulus = " + modulus);
			System.out.println("Enter first number: ");
			num1 = unos.nextDouble();
			System.out.println("Enter second number: ");
			num2 = unos.nextDouble();
		} 
	}

}
