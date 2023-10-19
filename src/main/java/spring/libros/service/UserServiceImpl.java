package spring.libros.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import spring.libros.exception.UserNotFoundException;
import spring.libros.model.UserDTO;

@Service
public class UserServiceImpl implements UserService{
	
	ArrayList<UserDTO> userList = new ArrayList<>(Arrays.asList(
			new UserDTO(1L,"María","maria@mail.com"),
			new UserDTO(2L,"Álvaro","alvaro@mail.com"),
			new UserDTO(3L,"Lucía","lucia@mail.com"),
			new UserDTO(4L,"Francico","fran@mail.com"),
			new UserDTO(5L,"Miriam","miri@mail.com"),
			new UserDTO(6L,"Paula","pau@mail.com")));

	@Override
	public UserDTO buscarUser(Long id) {
		
		for(UserDTO u: userList) {
			if (id==u.getId()) {
				return u;
			}
		}
		
		throw new UserNotFoundException("No se ha encontrado ningún usuario con el id: " + id);
	}

}
