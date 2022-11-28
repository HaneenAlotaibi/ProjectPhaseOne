package com.Project;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	public static void main(String[] args) {
		System.out.println("Please enter file name");
		Scanner in= new Scanner(System.in);
		String t=in.nextLine();
		try  
		{         
		File f= new File(t);           //file to be delete  
		if(f.delete())                      //returns Boolean value  
		{  
		System.out.println(f.getName() + " deleted");   //getting and printing the file name  
		}  
		else  
		{  
		System.out.println("failed");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		}
	}
