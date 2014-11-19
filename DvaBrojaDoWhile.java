package lab8;

import java.util.Scanner;

public class DvaBrojaDoWhile {
	public static void main(String[] args) {
		System.out.println("Unesite dva broja: ");
		Scanner unos = new Scanner(System.in);
		double broj1=0;
		double broj2=0;
		double suma=0;
		do
		{
			broj1 = unos.nextDouble();
			broj2 = unos.nextDouble();
			if ((broj1==0) && (broj2==0))
			{
				System.out.println("Unijeli ste dvije nule!");
				return;
			}
			suma = broj1 + broj2;		
			System.out.println("Suma je " + suma);	
		}while ((broj1!=0) || (broj2!=0));
		
	}

}
