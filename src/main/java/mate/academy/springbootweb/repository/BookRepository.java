package mate.academy.springbootweb.repository;

import mate.academy.springbootweb.dto.BookDto;
import mate.academy.springbootweb.dto.CreateBookRequestDto;
import mate.academy.springbootweb.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> getAll();

    Optional<Book> getBookById(Long id);

    BookDto createBook(CreateBookRequestDto bookDto);
}
