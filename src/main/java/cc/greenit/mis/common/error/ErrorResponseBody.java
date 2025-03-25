package cc.greenit.mis.common.error;

import lombok.Getter;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : cc.greenit.cms.common.error
 * fileName       : ErrorResponseBody
 * author         : soonhyeong
 * date           : 2023/09/04
 * description    :
 */
@Getter
public class ErrorResponseBody {
    private int status;
    private String code;
    private String message;
    private List<FieldError> errors;

    private ErrorResponseBody(ErrorCode code, List<FieldError> errors) {
        this.status  = code.getStatus();
        this.code    = code.getCode();
        this.message = code.getMessage();
        this.errors  = errors;
    }

    private ErrorResponseBody(ErrorCode code) {
        this.status  = code.getStatus();
        this.code    = code.getCode();
        this.message = code.getMessage();
        this.errors  = new ArrayList<>();
    }

    public static ErrorResponseBody of(ErrorCode code, BindingResult bindingResult) {
        return new ErrorResponseBody(code, FieldError.of(bindingResult));
    }

    public static ErrorResponseBody of(ErrorCode code) {
        return new ErrorResponseBody(code);
    }

    public static ErrorResponseBody of(ErrorCode code, List<FieldError> errors) {
        return new ErrorResponseBody(code, errors);
    }

    @Getter
    public static class FieldError {
        private String field;
        private String value;
        private String reason;

        private FieldError(String field, String value, String reason) {
            this.field = field;
            this.value = value;
            this.reason = reason;
        }

        public static List<FieldError> of(String field, String value, String reason) {
            List<FieldError> errors = new ArrayList<>();
            errors.add(new FieldError(field, value, reason));
            return errors;
        }

        private static List<FieldError> of(BindingResult bindingResult) {
            return bindingResult.getFieldErrors().stream()
                    .map(error -> new FieldError(
                            error.getField(),
                            error.getRejectedValue() == null ? "" : error.getRejectedValue().toString(),
                            error.getDefaultMessage()))
                    .collect(Collectors.toList());
        }
    }
}
