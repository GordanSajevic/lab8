package lab8;

import java.util.Scanner;

public class TextIOvsScanner {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite prvi broj: ");
		int a = unos.nextInt();
		System.out.println("Unesite drugi broj: ");
		int b = unos.nextInt();
		System.out.println("Unesite treći broj: ");
		int c = unos.nextInt();
		if (((a<b) && (a<c)) || ((a==b) && (a<c)))
		{ 
			System.out.println("Najmanji je broj " + a);
		}
		else if (((b<a) && (b<c)) || ((c==b) && (b<a)))
		{
			System.out.println("Najmanji je broj "  + b);
		}
		else if (((c<a) && (c<b)) || ((c==a) && (c<b))) 
		{
			System.out.println("Najmanji je broj " + c);
		}
		else
		{
			System.out.println("Najmanji je broj " + a);
		}
		unos.close();
	}
}