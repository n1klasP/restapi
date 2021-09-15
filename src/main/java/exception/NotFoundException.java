package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NotFoundException {
    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "user not found")
    public static class UserNotFoundException extends RuntimeException{
    }

}
