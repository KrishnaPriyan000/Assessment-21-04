package Assigment;

import java.util.Scanner;

public class GameStoreSystem {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		boolean valid = false;
		int sum = 0;

		while (valid == false) {

			System.out.println(
					"Enter the number of the following games to choose:\n1. Call of Warfare - ₹1500\n2. Speed Racers - ₹1200\n3. Mystery Mansion - ₹1000\n4. Pixel Adventure - ₹800\n5. Puzzle Mania - ₹500\n6. Checkout / Exit");

			int input = s.nextInt();

			switch (input) {
			case 1: {
				System.out.println("How many copies would you like?");
				int copies = s.nextInt();

				for (int i = 1; i <= copies; i++) {
					sum = sum + 1500;
				}
				System.out.println(copies+"x Call of Warfare - ₹1500 is added to your cart");
				System.out.println("your total now ₹" + sum);
				System.out.println();
				break;
			}

			case 2: {
				System.out.println("How many copies would you like?");
				int copies = s.nextInt();

				for (int i = 1; i <= copies; i++) {
					sum = sum + 1200;
				}
				System.out.println(copies+"x Speed Racers - ₹1200 is added to your cart");
				System.out.println("your total now ₹" + sum);
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("How many copies would you like?");
				int copies = s.nextInt();

				for (int i = 1; i <= copies; i++) {
					sum = sum + 1000;
				}
				System.out.println(copies+"x Mystery Mansion - ₹1000 is added to your cart");
				System.out.println("your total now ₹" + sum);
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("How many copies would you like?");
				int copies = s.nextInt();

				for (int i = 1; i <= copies; i++) {
					sum = sum + 800;
				}
				System.out.println(copies+"x Pixel Adventure - ₹800 is added to your cart");
				System.out.println("your total now ₹" + sum);
				System.out.println();
				break;
			}
			case 5: {
				System.out.println("How many copies would you like?");
				int copies = s.nextInt();

				for (int i = 1; i <= copies; i++) {
					sum = sum + 500;
				}
				System.out.println(copies+"x Puzzle Mania - ₹500 is added to your cart");
				System.out.println("your total now ₹" + sum);
				System.out.println();
				break;
			}
			case 6: {
				System.out.println("Your Grand total is:");
				System.out.println("₹ "+sum);
				valid = true;
				break;
			}
			default: {
				System.out.println("Wrong Choice, Go again.");
				System.out.println();
			}

			}

		}
	}
}
