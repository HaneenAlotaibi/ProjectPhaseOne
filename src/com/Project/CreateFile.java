package com.Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) {
		System.out.println("Please enter file name");
		Scanner in = new Scanner(System.in);
			String t = in.nextLine();
			try {
				File myObj = new File(t);
				//System.out.println(myObj.getPath());
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
	}

