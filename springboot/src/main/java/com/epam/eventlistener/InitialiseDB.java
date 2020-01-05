package com.epam.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.epam.model.Author;
import com.epam.model.Book;
import com.epam.model.Publisher;
import com.epam.repository.AuthorRepository;
import com.epam.repository.BookRepository;
import com.epam.repository.PublisherRepository;

@Component
public class InitialiseDB implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	PublisherRepository publisherRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initDB();

	}

	public void initDB() {

		Publisher publisher = new Publisher();
		publisher.setName("abc");
		publisherRepository.save(publisher);
		
		Author author = new Author("James", "Bay");
		Book book = new Book();
		book.setIsbn("1");
		book.setPublisher(publisher);
		book.setTitle("Long Live");
		book.getAuthors().add(author);
		author.getBooks().add(book);
		authorRepository.save(author);
		bookRepository.save(book);

		Author author1 = new Author("James", "Blake");
		Book book1 = new Book();
		book1.setIsbn("1af");
		book1.setPublisher(publisher);
		book1.setTitle("Long Live King");
		book1.getAuthors().add(author1);
		authorRepository.save(author1);
		bookRepository.save(book1);
		

	}

}
