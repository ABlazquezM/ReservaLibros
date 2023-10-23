package spring.libros.service;

import java.util.ArrayList;

import spring.libros.model.BookDTO;

public interface ReservationService {

	void reserveBook(Long bookId, Long userId);

	BookDTO cancelReservation(Long bookId, Long userId);

	ArrayList<?> getAllReservations(Long userId);

}
