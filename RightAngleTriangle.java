package lab8;

public class RightAngleTriangle {
	public static void main(String[] args) {
		System.out.println("Inesert three sides of triangle: ");
		double num1 = TextIO.getDouble();
		double num2 = TextIO.getDouble();
		double num3 = TextIO.getDouble();
		if ((num1*num1==num2*num2+num3*num3) || (num2*num2==num1*num1+num3*num3) || (num3*num3==num1*num1+num2*num2))
		{
			System.out.println("This three sides can be sides of right agle triangle.");
		}
		else
		{
			System.out.println("This three sides cannot be sides of right angle triangle");
		}
	}

}
