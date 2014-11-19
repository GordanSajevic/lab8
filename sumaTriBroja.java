package lab8;

import java.util.Scanner;

public class sumaTriBroja {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int suma = 0;
		System.out.println("Unesite tri broja: ");
		for (int brojac=0; brojac<3; brojac++)
		{
			suma = suma + unos.nextInt();
		}
		System.out.println("Suma tri broja je " + suma);

	}

}
