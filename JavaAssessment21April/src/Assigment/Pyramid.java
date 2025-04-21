package Assigment;

public class Pyramid {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			for (int k = 1; k <= i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
