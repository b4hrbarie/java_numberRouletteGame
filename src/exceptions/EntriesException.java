package exceptions;

public class EntriesException extends RuntimeException {

    private static final long serialVersionUID = 1L;
     
    public EntriesException(String message) {
      super(message);
    }
    
  }