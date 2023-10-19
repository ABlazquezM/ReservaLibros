package spring.libros.service;

import spring.libros.model.BookDTO;

public interface BookService {

	
	Boolean estaReservado(Long id);
	
	String libroReservado(Long id);
	
	String devuelto(Long id);
	
}
