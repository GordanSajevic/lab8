package lab8;

public class poolCaseII {

	public static void main(String[] args) {
		System.out.println("Enter size of tile: ");
		double tile = TextIO.getDouble();
		System.out.println("Enter size of tile: ");
		double pool = TextIO.getDouble();
		double wholeTile = tile*tile;
		double result = pool/wholeTile;
		System.out.println("You need " + result + " tiles for your pool.");
	}

}
