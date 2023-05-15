package com.fileoperations;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileOperations {
	
	String path = "/home/sagar/Documents/";
	
	public void viewall() {
		File fp = new File(path);
		System.out.println("All Files");
		int j=1;
		File a[] = fp.listFiles();
		
		List<String> Filenames = new ArrayList<String>();
		
		for(int i=0; i<a.length; i++) {
			Filenames.add(a[i].getName());
		}
		Collections.sort(Filenames);
		for(String s : Filenames) {
			System.out.println(j+". "+s);
			j++;
		}
		
	}
	
	public void addfile(String fileName, String content) throws Exception{
		File fp = new File(path+fileName);
		
		if(fp.exists())
			System.out.println("File already exist ");
		else if(fp.createNewFile())
			System.out.println("File created successfully");
		else {
			System.out.println("File not created ");
			return;
		}
		
		FileWriter out = new FileWriter(fp, true);
		out.write(content);
		out.close();
		System.out.println("Content added successfully");
	}
	
	public void deleteFile(String filen) {
		File fp = new File(path+filen);
		if(!fp.exists()) {
			System.out.println("File does not exist");
		}
		else if(fp.delete()) {
			System.out.println("File deleted successfully");
		}
		else
			System.out.println("File does not deleted ");
	}
	
	public void searchFile(String fname) {
		File fp = new File(path + fname);
		if(fp.exists()) {
			System.out.println(fname+"Exsists at "+fp.getPath());
		}
		else {
			System.out.println("File doesnot exsist ");
		}
	}
	
	

}
