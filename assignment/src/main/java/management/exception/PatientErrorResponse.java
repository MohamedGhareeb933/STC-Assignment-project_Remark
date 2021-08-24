package management.exception;

public class PatientErrorResponse {

    private int status;
    private String message;
    private long time;

    public PatientErrorResponse(){

    }
    public PatientErrorResponse(int status, String messege, long time) {
        this.status = status;
        this.message = messege;
        this.time = time;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
