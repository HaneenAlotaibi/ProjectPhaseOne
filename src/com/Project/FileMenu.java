package com.Project;

import java.io.IOException;

import java.util.Scanner;

public class FileMenu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean Menu = true;
		int choice;
		while (true) {
			System.out.println(" Menu");
			System.out.println("Available Choices :");
			System.out.println(" 1 : Add file ");
			System.out.println(" 2 : Delete file ");
			System.out.println(" 3 : Search file");
			System.out.println(" 4 : Go to main ");
			System.out.println(" 5 : Exit ");
			System.out.println("Please enter the choice number:");

			choice = in.nextInt();
			switch (choice) {
			case 1:

				CreateFile.main(null);

				break;

			case 2:

				DeleteFile.main(null);

				break;
			case 3:

				SearchFile.main(null);
				break;
			case 4:

				System.out.println("Exit from the menu");

				LockedMeApp.main(null);
				break;
			case 5:

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