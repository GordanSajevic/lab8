package lab8;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite brojeve (0 za kraj): ");
		double broj = unos.nextInt();
		if (broj==0)  
		{ 
			System.out.println("Niste ništa unijeli!"); 
			return;
		}
		double brojac=0;
		double suma=0;
		double prosjek;
		do
		{
			suma=suma+broj;
			broj = unos.nextInt();
			brojac++;
		}
		while(broj!=0);
		prosjek = suma / brojac;
		System.out.println("Prosjek uneseni brojeva je: " + prosjek);

	}

}
