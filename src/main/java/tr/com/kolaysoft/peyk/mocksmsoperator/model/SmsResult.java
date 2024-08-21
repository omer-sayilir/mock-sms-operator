package tr.com.kolaysoft.peyk.mocksmsoperator.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.LocalDateTime;


public class SmsResult {

    private String id;
    private String msg;
    private String error;
    private int state;
    private Integer credit;
    private String sender;
    private String target;
    private int setState;
    private LocalDateTime sendingDate;
    private LocalDateTime processingDate;
    private LocalDateTime deliveryDate;


    @JsonCreator
    public SmsResult(@JsonProperty("id") String id, @JsonProperty("msg") String msg,
                     @JsonProperty("error") String error, @JsonProperty("state") int state, @JsonProperty("credit") Integer credit, @JsonProperty("setState") int setState,
                     @JsonProperty("sender") String sender, @JsonProperty("target") String target, @JsonProperty("sendingDate") LocalDateTime sendingDate, @JsonProperty("processingDate") LocalDateTime processingDate
            , @JsonProperty("deliveryDate") LocalDateTime deliveryDate) {
        this.id = id;
        this.msg = msg;
        this.error = error;
        this.state = state;
        this.credit = credit;
        this.sender = sender;
        this.setState = setState;
        this.target = target;
        this.sendingDate = sendingDate;
        this.processingDate = processingDate;
        this.deliveryDate = deliveryDate;


    }

    public SmsResult() {
    }

    private SmsState convertToState(int value) {
        for (SmsState state : SmsState.values()) {
            if (state.getValue() == value) return state;
        }
        return SmsState.NO_STATUS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getSetState() {
        return setState;
    }

    public void setSetState(int setState) {
        this.setState = setState;
    }

    public LocalDateTime getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(LocalDateTime sendingDate) {
        this.sendingDate = sendingDate;
    }

    public LocalDateTime getProcessingDate() {
        return processingDate;
    }

    public void setProcessingDate(LocalDateTime processingDate) {
        this.processingDate = processingDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
