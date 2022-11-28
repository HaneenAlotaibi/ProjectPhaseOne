package com.Project;

import java.io.*;
import java.util.*;

public class SortingFile {
	public static void main(String[] args) {

		File directory = new File("C:\\Users\\lenovo\\KFHjava\\Project");

		String[] flist = directory.list();
		Set<String> j = new TreeSet<String>();
		int flag = 0;

		if (flist == null) {
			System.out.println("Empty directory.");
		} else {

			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];
				j.add(filename);
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("File Not Found");
		}

		// System.out.println(j);
		Iterator<String> iterate = j.iterator();
		System.out.println("Ascending Order ");
		// Accessing elements
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}

	}
}
