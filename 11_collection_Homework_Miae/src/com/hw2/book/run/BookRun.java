package com.hw2.book.run;

import com.hw2.book.model.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		BookService bService = new BookService();
		
		bService.displayMenu();

	}

}
