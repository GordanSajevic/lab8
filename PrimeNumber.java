package lab8;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter number: ");
		int broj = unos.nextInt();
		int prviBroj=0;
		while (broj>1)
		{
			broj=broj/10;
			prviBroj = broj % 10;
		}
		System.out.println("Prime number is " + prviBroj);
	}
}
