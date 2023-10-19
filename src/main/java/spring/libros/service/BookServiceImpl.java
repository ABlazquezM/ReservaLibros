package spring.libros.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import spring.libros.exception.BookNotFoundException;
import spring.libros.model.BookDTO;

@Service
public class BookServiceImpl implements BookService {

	ArrayList<BookDTO> bookList = new ArrayList<>(Arrays.asList(
			new BookDTO(1L, "Cien años de soledad", "Gabriel García Márquez", false),
			new BookDTO(2L, "1984", "George Orwell", false), new BookDTO(3L, "Un mundo feliz", "Aldous Huxley", false),
			new BookDTO(4L, "El retrato de Dorian Gray", "Oscar Wilde", false),
			new BookDTO(5L, "Los pilares de la tierra", "Ken Follett", false)));

	@Override
	public Boolean estaReservado(Long id) {
		for (BookDTO b : bookList) {
			if (id == b.getId()) {
				return b.getReservado();
			}
		}
		throw new BookNotFoundException("No se ha encontrado ningún libro con el id: " + id);
	}

	@Override
	public String libroReservado(Long id) {
		for (BookDTO b : bookList) {
			if (id == b.getId()) {
				b.setReservado(true);
				return "Se ha reservado el Libro " + b.getTitulo();
			}

		}
		throw new BookNotFoundException("No se ha encontrado ningún libro con el id: " + id);
	}

	@Override
	public String devuelto(Long id) {
		for (BookDTO b : bookList) {
			if (id == b.getId()) {
				b.setReservado(false);
			}
		}

		throw new BookNotFoundException("No se ha encontrado ningún libro con el id: " + id);
	}

}
