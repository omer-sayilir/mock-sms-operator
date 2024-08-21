package tr.com.kolaysoft.peyk.mocksmsoperator.model;

public class SmsError {
    public int status;
    public SmsErrorCode code;
    public String message;

    public SmsError() {
    }

    public SmsError(int status, SmsErrorCode code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public SmsErrorCode getCode() {
        return code;
    }

    public void setCode(SmsErrorCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Err{" +
                "status=" + status +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
