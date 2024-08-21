package tr.com.kolaysoft.peyk.mocksmsoperator.model;

public enum SmsState {

    NO_STATUS(99), CANCELLED(-2), REJECTED(-1), PENDING(0), SENDING(1), SEND(2), DELIVERED(3), NOT_DELIVERED(4), TIME_OUT(5);
    private final int value;

    SmsState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
