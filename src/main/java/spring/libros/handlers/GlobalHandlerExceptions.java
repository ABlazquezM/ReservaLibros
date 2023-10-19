package spring.libros.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import spring.libros.exception.BookNotFoundException;
import spring.libros.exception.UserNotFoundException;

public class GlobalHandlerExceptions {

	
	@ExceptionHandler(BookNotFoundException.class)
	public ProblemDetail handlerCocheNotFoundException(BookNotFoundException e) {
		
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Coustom Exception Occuder");
		problemDetail.setType(URI.create("http://localhost/8080/libros"));
		problemDetail.setProperty("errorCategory", "Libro");
		problemDetail.setProperty("timeStamp", Instant.now());
		
		return problemDetail;
	}
	
	
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public ProblemDetail handlerCocheNotFoundException(UserNotFoundException e) {
		
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Coustom Exception Occuder");
		problemDetail.setType(URI.create("http://localhost/8080/libros"));
		problemDetail.setProperty("errorCategory", "Libro");
		problemDetail.setProperty("timeStamp", Instant.now());
		
		return problemDetail;
	}
}
