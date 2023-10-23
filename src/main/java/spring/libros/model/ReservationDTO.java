package spring.libros.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationDTO {

	private Long id;
	private Long libroId;
	private Long usuarioId;
//	private LocalDate fechaReserva;
//	private LocalDate returnDate;

}
