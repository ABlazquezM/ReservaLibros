package spring.libros.model;

import java.time.LocalDate;

public class ReservationDTO {

	private Long id;
	private Long libroId;
	private Long usuarioId;
	private LocalDate fechaReserva;
	private LocalDate returnDate;

}
