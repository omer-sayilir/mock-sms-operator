package tr.com.kolaysoft.peyk.mocksmsoperator.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

/**
 * @author omersayilir
 */
@Entity(name = "sms_record")
public class SmsRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sms_record_seq")
    @SequenceGenerator(name = "sms_record_seq", sequenceName = "SMS_RECORD_SEQ", allocationSize = 1)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;
    @Column(name = "receiver")
    private String receiver;
    @Column(name = "state")
    private int state;
    @Column(name = "received_date")
    private LocalDateTime receivedDate;
    @Column(name = "sending_date")
    private LocalDateTime sendingDate;
    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;
    @Column(name = "credit")
    private int credit;

    public SmsRecord() {
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public LocalDateTime getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(LocalDateTime sendingDate) {
        this.sendingDate = sendingDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
