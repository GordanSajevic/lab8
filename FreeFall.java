package lab8;

public class FreeFall {

	public static void main(String[] args) {
		System.out.println("Please insert time of free fall: ");
		double time = TextIO.getDouble();
		double distance = (9.81*time*time)/2;
		System.out.println("Distance is: " + distance + " meters");
	}

}
