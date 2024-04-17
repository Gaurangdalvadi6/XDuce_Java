package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		LibraryRecordManagement mr = new LibraryRecordManagement();

		Library library = new Library();

//		library.setTitle("csharp");
//		library.setAuthor("Gaurang");
//		library.setISBN(4564);
//		
//		mr.add(library);

		int n;
		Scanner sc = new Scanner(System.in);
		Scanner cc = new Scanner(System.in);

		try {
			do {
				menu();
				n = sc.nextInt();
				System.out.println("Your Selected Option Is : " + n);
				switch (n) {
				case 1:
					// for insert
					System.out.println("Enter Book Title :");
					String title = cc.nextLine();

					System.out.println("Enter Book author : ");
					String author = cc.nextLine();

					System.out.println("Enter Book ISBN : ");
					long ISBN = sc.nextLong();

					library = new Library(title, author, ISBN);
					mr.add(library);
					System.out.println(library.toString());
					break;
				case 2:
					// for display
					mr.display();
					break;
				case 3:
					// for search
					System.out.println("What is Your Book Title : ");
					String title1 = cc.next();
					System.out.println(mr.findTitle(title1));
					// mr.findTitle(title1);
//				if (mr.findTitle(title1)==null) {
//					System.out.println("Book Does Not Found");
//				}
					break;
				case 4:
					System.out.println("Enter Book Title : ");
					String tt = cc.next();
					mr.delete(tt);
					break;
				default:
					System.out.println("Please Enter Valid Input");
					break;
				}
			} while (n != 0);
		} 
		catch (InputMismatchException e) {
			System.out.println("Please Enter Valid Input...");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void menu() {
		System.out.println("Option : ");
		System.out.println("1. Insert New Book");
		System.out.println("2. Display All Books");
		System.out.println("3. Search For Book Title");
		System.out.println("4. Remove Book From Library");
	}
}
