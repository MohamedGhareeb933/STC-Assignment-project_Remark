package management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {

    // exception handler for Patient ID NOT FOUND
    @ExceptionHandler
    public ResponseEntity<PatientErrorResponse> handleException(PatientNotFound exc) {

        PatientErrorResponse error  = new PatientErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTime(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // exception handler for any bad request or input
    @ExceptionHandler
    public ResponseEntity<PatientErrorResponse> handleException(Exception exc) {

        PatientErrorResponse error  = new PatientErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTime(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
