package exception;


public class InsufficientBalanceException extends Exception {
	private String msg;
	InsufficientBalanceException(String msg) {
		super(msg);	
		this.msg=msg;
			//super(this.msg);
	}
	InsufficientBalanceException() {
        super("Insufficient Balance");
        this.msg = msg;
    }
 
    public String getMessage() {
        return msg;
    }

}
