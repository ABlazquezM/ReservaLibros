package spring.libros.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

	private Long id;
	private String nombre;
	private String correoElectronico;

}
