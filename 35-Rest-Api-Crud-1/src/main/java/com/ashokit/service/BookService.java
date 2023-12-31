package com.ashokit.service;

import java.util.List;

import com.ashokit.enitity.Book;

public interface BookService {

	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	public String deleteBook(Integer bookId);
}
