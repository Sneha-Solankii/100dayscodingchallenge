import java.util.Scanner;

 class PerimeteRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter length of the rectangle: ");
		int length = input.nextInt();
		System.out.println("Please enter width of the rectangle: ");
		int width = input.nextInt();
		System.out.println("Parimeter of rectangle is :" + (2 * (length + width)));
	}
}

