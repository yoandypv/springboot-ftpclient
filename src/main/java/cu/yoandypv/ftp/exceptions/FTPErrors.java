package cu.yoandypv.ftp.exceptions;

/**
 * Created by Yoandy Pérez Villazón on 14/09/17.
 */
public class FTPErrors extends Exception {

    private ErrorMessage errorMessage;

    public FTPErrors(ErrorMessage errorMessage) {
        super(errorMessage.getErrormessage());
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }
}
