package com.fileoperations;

import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		FileOperations fo = new FileOperations();
		
		System.out.println("Project Name : LockedMe.com\t\t Developer Name : Sagar");
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("1. Retrieving the All file names in an ascending order\n"
					+ "2. Business-level operations:\n"
					+ "3. Exit from the Application\n");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				fo.viewall();
				break;
			case 2:
				
				System.out.println("1. Add a file to the application\n"
						+ "2. Delete a file from the application\n"
						+ "3. Search a file from the application\n"
						+ "4. Return to Home\n");
				System.out.println("Enter your choice ");
				int choice2 = sc.nextInt();
				sc.nextLine();
				switch(choice2) {
				case 1:
					System.out.println("Enter file name to be added ");
					String filename = sc.next();
					sc.nextLine();
					System.out.println("Enter a content to be added ");
					String data = sc.nextLine();
					fo.addfile(filename, data);
					break;
				case 2:
					System.out.println("Enter file name to be deleted");
					String filen = sc.next();
					fo.deleteFile(filen);
					break;
				case 3:
					System.out.println("Enter file name to be searched ");
					String fname = sc.next();
					fo.searchFile(fname);
					break;
				case 4:
					break;
				default:System.out.println("Invalid choice");
				}
				break;
			case 3:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:System.out.println("Invalid choice ");
			}
		}
		

	}

}
