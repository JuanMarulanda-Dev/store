package academy.digitallab.store.serviceproduct.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class})
    public ResponseEntity<ApiException> handlerApirequestException(IllegalArgumentException e){
        ApiException exception = new ApiException(
                e.getMessage(),
                LocalDateTime.now()
        );

        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }
}
