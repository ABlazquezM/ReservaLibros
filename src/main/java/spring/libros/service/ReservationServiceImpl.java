package spring.libros.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.libros.model.BookDTO;
import spring.libros.model.ReservationDTO;
import spring.libros.model.UserDTO;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	BookServiceImpl libro;
	@Autowired
	UserServiceImpl user;
	
	static Long contador = 0L;
	
	ArrayList<ReservationDTO> reservationList = new ArrayList<>();

	@Override
	public void reserveBook(Long bookId, Long userId) {
		libro.libroReservado(bookId);
		user.buscarUser(userId);
		ReservationDTO u = new ReservationDTO(contador,bookId,userId);
		reservationList.add(u);
	}

	@Override
	public BookDTO cancelReservation(Long bookId, Long userId) {
		for (ReservationDTO r : reservationList) {
			if (r.getLibroId()==userId) {
				
			}
			
		}
		return null;
	}

	@Override
	public ArrayList<?> getAllReservations(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
