package com.Project;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	public static void main(String[] args) {
		System.out.println("Please enter file name");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		try {
			File file = new File(name);

			if (file.delete()) {
				System.out.println(file.getName() + " deleted");
			} else {
				System.out.println(name + " Not Found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
