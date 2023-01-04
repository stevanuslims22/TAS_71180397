package tas.rplbo.simplenotes;

public class NotesException extends Throwable {
    private String message;


    public NotesException(String message){
        super();
        this.message = "Error";
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
