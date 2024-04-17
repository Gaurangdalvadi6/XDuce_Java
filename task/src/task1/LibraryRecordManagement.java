package task1;

import java.util.ArrayList;

public class LibraryRecordManagement {

	// create empty arraylist
	ArrayList<Library> list;

	// default constructor
	public LibraryRecordManagement() {
		list = new ArrayList<Library>();
	}

	public boolean find(String title) {

		for (Library library : list) {
			if (library.getTitle() == title) {
				System.out.println(library);
				return true;
			}
		}
		return false;
	}

	public void add(Library library) {
		if (!find(library.getTitle())) {
			list.add(library);
		} else {
			System.out.println("Already have Book");
		}
	}
	
	public void display() {
		if (list.isEmpty()) {
			System.out.println("No Book In Library");
		} else {
			for (Library library : list) {
				System.out.println(library.toString());
			}
		}
	}
	
	public String findTitle(String Title) {
		for (Library library : list) {
			if (library.getTitle().equals(Title)) {
				return library.getTitle()+"  "+library.getAuthor()+"  "+library.getISBN();
			}
		}
		return null;
	}

	public void delete(String recTitle) {
		Library libDelete = null;

		for (Library lib : list) {
			if (lib.getTitle().equals(recTitle)) {
				libDelete = lib;
			}
		}

		if (libDelete == null) {
			System.out.println("Invalid Library Title");
		} else {
			list.remove(libDelete);
		}
	}

	

	

}
