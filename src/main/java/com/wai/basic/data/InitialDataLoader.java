package com.wai.basic.data;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.wai.basic.entity.Author;
import com.wai.basic.entity.Book;
import com.wai.basic.repository.AuthorRepository;
import com.wai.basic.repository.BookRepository;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;

	public InitialDataLoader(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initialize();
	}
	
	private void initialize() {
		
		 Book book1 = new Book("Domain driven design","programming", 34.0);
		 Author author1 = new Author("Erick","Evan","evan@mail.com");
		 
		//many to many

	        book1.getAuthors().add(author1);
	        author1.getBooks().add(book1);	        
	        authorRepository.save(author1);
	        bookRepository.save(book1);
	     
	        Book book2 = new Book("Server driven design","networking", 34.0);
	        Author author2 = new Author("John","Doe","john@mail.com");
	        //many to many

	        book2.getAuthors().add(author2);
	        author2.getBooks().add(book2);

	        authorRepository.save(author2);
	        bookRepository.save(book2);
	        
	        
	        Book book3 = new Book("Web driven design","networking", 34.0);
	        Author author3 = new Author("Haig","Doe","doe@mail.com");
	        //many to many

	        book3.getAuthors().add(author3);
	        author3.getBooks().add(book3);

	        authorRepository.save(author3);
	        bookRepository.save(book3);
	        
	        Book book4 = new Book("Modern Design Pattern","IT", 77.33);
	        book4.getAuthors().add(author1);
	        book4.getAuthors().add(author2);
	        book4.getAuthors().add(author3);
	        
	        authorRepository.save(author1);
	        authorRepository.save(author2);
	        authorRepository.save(author3);
	        bookRepository.save(book4);
	        
	        
	        
	}
}
