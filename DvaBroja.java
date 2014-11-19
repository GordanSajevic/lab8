package lab8;

import java.util.Scanner;

public class DvaBroja {
	public static void main(String[] args) {
		System.out.println("Unesite dva broja: ");
		Scanner unos = new Scanner(System.in);
		double broj1 = unos.nextDouble();
		double broj2 = unos.nextDouble();
		double suma=0;
		while ((broj1!=0) || (broj2!=0))
		{
			suma = broj1 + broj2;
			System.out.println("Suma je " + suma);
			System.out.println("Unesite dva broja: ");
			broj1 = unos.nextDouble();
			broj2 = unos.nextDouble();
			
		}
		if ((broj1==0) && (broj2==0))
		{
			System.out.println("Unijeli ste dvije nule!");
			return;
		}
	}

}
