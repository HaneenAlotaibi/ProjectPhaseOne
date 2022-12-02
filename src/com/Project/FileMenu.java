package com.Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileMenu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.println(" ***************************************");
			System.out.println("                sub Menu                     ");
			System.out.println(" ***************************************");
			System.out.println("Available Choices :");
			System.out.println(" 1 : Add file ");
			System.out.println(" 2 : Delete file ");
			System.out.println(" 3 : Search file");
			System.out.println(" 4 : Go to main ");
			System.out.println(" 5 : Exit ");
			System.out.println("Please enter the choice number:");

			try {
				choice = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Mismatch Exception");
				// e.printStackTrace();
				FileMenu.main(null);

			}
			switch (choice) {
			case 1:
				CreateFile(enter());

				break;

			case 2:

				DeleteFile(enter());

				break;
			case 3:

				SearchFile(enter());
				break;
			case 4:

				System.out.println("Exit from the sub menu");

				LockedMeApp.themain();
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

	public static void CreateFile(String name) {
		try {
			File myObj = new File(name);
			// System.out.println(myObj.getPath());
			if (myObj.createNewFile()) {

				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void DeleteFile(String name) {
		String[] flist = directory();
		int flag = 0;
		if (flist == null) {
			System.out.println("Empty directory.");
		} else {
			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];
				if (filename.equals(name)) {
					try {
						File f = new File(name);
						if (f.delete()) {
							System.out.println(f.getName() + " deleted");
							flag = 1;

						} else {
							System.out.println("failed");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
			if (flag == 0) {
				System.out.println(name+" Not Found");
			}

		}

	}

	public static String enter() {
		System.out.println("Please enter file name");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		return filename;
	}

	public static void SearchFile(String name) {

		String[] flist = directory();
		int flag = 0;

		if (flist == null) {
			System.out.println("Empty directory.");
		} else {

			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];
				// System.out.println(flist[i]);
				if (filename.equals(name)) {
					System.out.println(filename + " found");
					flag = 1;
				}
			}
		}

		if (flag == 0) {
			System.out.println("File Not Found");
		}

	}

	public static String[] directory() {
		File directory = new File("C:\\Users\\lenovo\\KFHjava\\ProjectPhase"); // change the location files

		String[] flist = directory.list();
		return flist;
	}

	public static void sort() {

		String[] flist = FileMenu.directory();
		// Set<String> fileSet = new TreeSet<String>();
		List<String> fileSet = new ArrayList<String>();

		if (flist == null) {
			System.out.println("Empty directory.");
		} else {

			for (int i = 0; i < flist.length; i++) {
				// String filename = flist[i];
				fileSet.add(flist[i]);

			}
			System.out.println("Sorted: ");
			Collections.sort(fileSet, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {

					System.out.println(o1);
					return o1.compareToIgnoreCase(o2);
				}
			});

			// System.out.println("Sorted: " + fileSet);

		}
	}
}
