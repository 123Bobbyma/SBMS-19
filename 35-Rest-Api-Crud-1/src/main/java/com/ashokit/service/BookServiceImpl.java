package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.enitity.Book;
import com.ashokit.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repo;

	public BookServiceImpl(BookRepository repository) {
		this.repo=repository;
	}

	@Override
	public String upsertBook(Book book) {
		Integer bookId = book.getBookId();
		repo.save(book);
		if(bookId==null) {
			return "record inserted";
			
		}else {
			return "record updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll() ;
	}

	@Override
	public String deleteBook(Integer bookId) {
         repo.deleteById(bookId);
		return "book deleted";
	}

}
