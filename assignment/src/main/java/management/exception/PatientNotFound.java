package management.exception;

public class PatientNotFound extends RuntimeException {

    public PatientNotFound(String message) {
        super(message);
    }

    public PatientNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public PatientNotFound(Throwable cause) {
        super(cause);
    }

}
