package spring.libros.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDTO {

	private Long id;
	private String titulo;
	private String autor;
	private Boolean reservado;
}
