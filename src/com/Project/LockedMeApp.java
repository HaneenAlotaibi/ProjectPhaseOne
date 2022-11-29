package com.Project;

import java.util.Scanner;

public class LockedMeApp {
	public static void main(String[] args) {
		System.out.println("LockedMe.com");
		System.out.println("Name :Haneen Alotaibi");
		Scanner in = new Scanner(System.in);

		boolean main = true;
		int choice;
		while (true) {
			System.out.println(" Welcome to the LockedMe.com");
			System.out.println("Available Choices :");
			System.out.println(" 1 : Display names of all files(Ascending Order) ");
			System.out.println(" 2 : Menu ");
			System.out.println(" 3 : Exit ");
			System.out.println("Please enter the choice number:");

			choice = in.nextInt();
			switch (choice) {
			case 1:

				SortingFile.main(null);

				break;

			case 2:

				FileMenu.main(null);

				break;

			case 3:

				System.out.println("Exit from the Program");
				System.exit(0);
				break;
			default:
				System.out.println("This is invalid Menu Choice! Please enter another choice number");

				break;

			}
		}

	}
}
