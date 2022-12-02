package com.Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LockedMeApp {
	public static void main(String[] args) {
		System.out.println(" ***************************************");
		System.out.println("LockedMe.com");
		System.out.println("Name :Haneen Alotaibi");
		System.out.println(" Welcome to the LockedMe.com");
		System.out.println(" ***************************************");

		themain();

	}

	public static void themain() {
		try (Scanner in = new Scanner(System.in)) {
			int choice = 0;
			while (true) {
				mainMenu();
				try {
					choice = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Mismatch Exception");
					// e.printStackTrace();
					themain();

				}
				choiceFromMain(choice);
			}
		}
	}

	public static void mainMenu() {
		System.out.println(" ***************************************");
		System.out.println("                  main menu             ");
		System.out.println(" ***************************************");
		System.out.println("Available Choices :");
		System.out.println(" 1 : Display names of all files(Ascending Order) ");
		System.out.println(" 2 : sub Menu ");
		System.out.println(" 3 : Exit ");
		System.out.println("Please enter the choice number:");
	}

	public static void choiceFromMain(int number) {
		switch (number) {
		case 1:

			FileMenu.sort();

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
