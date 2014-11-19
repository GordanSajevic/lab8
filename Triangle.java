package lab8;

public class Triangle {

	public static void main(String[] args) {
		System.out.println("Inesert three numbers: ");
		double num1 = TextIO.getDouble();
		double num2 = TextIO.getDouble();
		double num3 = TextIO.getDouble();
		if ((num1*num1>num2*num2+num3*num3) || (num2*num2>num1*num1+num3*num3) || (num3*num3>num2*num2+num1*num1))
		{
			System.out.println("Those three numbers cannot be sides of triange");
			return;
		}
		System.out.println("Those three numbers can be sides of triangle");
		double s = (num1 + num2 + num3)/2;
		double area = Math.sqrt(s*(s-num1)*(s-num2)*(s-num3));
		System.out.println("The area of triangle is " + area);
		if (num1>num2 && num1>num2)
		{
			System.out.println("Biggest angle is between sides " + num2 + " and " + num3);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("Biggest angle is between sides " + num1 + " and " + num3);
		}
		else if (num3>num2 && num3>num1)
		{
			System.out.println("Biggest angle is between sides " + num2 + " and " + num1);
		}
		else
		{
			System.out.println("None of the angles is the biggest.");
		}
	
	}

}
