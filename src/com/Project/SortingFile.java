package com.Project;

import java.io.*;
import java.util.*;

public class SortingFile {
	public static void main(String[] args) {

		File directory = new File("C:\\Users\\lenovo\\KFHjava\\ProjectPhase");

		String[] flist = directory.list();
		//Set<String> fileSet = new TreeSet<String>();
		List<String> fileSet = new ArrayList<String>();

		if (flist == null) {
			System.out.println("Empty directory.");
		} else {

			for (int i = 0; i < flist.length; i++) {
				//String filename = flist[i];
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

			//System.out.println("Sorted: " + fileSet);

		}
	}
}
