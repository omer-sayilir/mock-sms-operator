package tr.com.kolaysoft.peyk.mocksmsoperator.model;

public enum SmsPkgState {

    NO_STATUS(99),
    CANCELLED(-4),
    UNSUCCESSFUL_SEND(-3),
    UNSUCCESSFUL_PACKAGE_CREATE(-2),
    PACKAGE_REJECTED(-2),
    SAVING(-1),
    PENDING(0),
    QUEUED(1),
    SENDING(2),
    SEND(3),
    PARTIAL_REPORTED(4),
    COMPLETE(6);
    private final int value;

    SmsPkgState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
