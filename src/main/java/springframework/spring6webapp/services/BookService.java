package kostas.springframework.spring6webapp.services;

import kostas.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
