package academy.digitallab.store.serviceproduct.handler;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiException {
    private String message;
    //private final Throwable throwable;
    //private HttpStatus httpStatus;
    private LocalDateTime timestamp;
}
