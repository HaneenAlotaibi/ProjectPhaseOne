package com.Project;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	public static void main(String[] args) {
		
	
	File directory = new File("C:\\Users\\lenovo\\KFHjava\\Project");
	System.out.println("Please enter file name");
	Scanner in= new Scanner(System.in);
	String t=in.nextLine();
	  

    String[] flist = directory.list();
   int flag = 0;
    
    if (flist == null) {
        System.out.println("Empty directory.");
    }
    else {

        
        for (int i = 0; i < flist.length; i++) {
            String filename = flist[i];
            //System.out.println(flist[i]);
            if (filename.equalsIgnoreCase(t)) {
                System.out.println(filename + " found");
                flag = 1;
            }
        }
    }

    if (flag == 0) {
        System.out.println("File Not Found");
    }
}

}
