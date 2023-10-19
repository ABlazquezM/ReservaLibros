package spring.libros.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{

	
	String msg;

	public UserNotFoundException(String msg) {
		super(msg);
	}
	
}
