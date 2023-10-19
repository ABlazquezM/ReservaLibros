package spring.libros.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import spring.libros.model.BookDTO;
import spring.libros.model.ReservationDTO;
import spring.libros.model.UserDTO;

@Service
public class ReservationServiceImpl implements ReservationService {

	
	ArrayList<UserDTO> userList = new ArrayList<>();
	ArrayList<ReservationDTO> reservationList = new ArrayList<>();

	@Override
	public BookDTO reserveBook(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO cancelReservation(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<?> getAllReservations(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
