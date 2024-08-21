package tr.com.kolaysoft.peyk.mocksmsoperator.model;

import java.util.ArrayList;


public class SmsRequest {
    public int type;
    public int sendingType;
    public String title;
    public String content;
    public ArrayList<String> number;
    public int encoding;
    public String sender;
    public Boolean skipAhsQuery=true;
    public String sendingDate;
    public int validity;
    public PushSettings pushSettings;

    public SmsRequest(int type, int sendingType, String title, String content, ArrayList<String> number, int encoding, String sender, String sendingDate, int validity, PushSettings pushSettings) {
        this.type = type;
        this.sendingType = sendingType;
        this.title = title;
        this.content = content;
        this.number = number;
        this.encoding = encoding;
        this.sender = sender;
        this.sendingDate = sendingDate;
        this.validity = validity;
        this.pushSettings = pushSettings;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSendingType() {
        return sendingType;
    }

    public void setSendingType(int sendingType) {
        this.sendingType = sendingType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<String> number) {
        this.number = number;
    }

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(int encoding) {
        this.encoding = encoding;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Boolean getSkipAhsQuery() {
        return skipAhsQuery;
    }

    public void setSkipAhsQuery(Boolean skipAhsQuery) {
        this.skipAhsQuery = skipAhsQuery;
    }

    public String getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(String sendingDate) {
        this.sendingDate = sendingDate;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public PushSettings getPushSettings() {
        return pushSettings;
    }

    public void setPushSettings(PushSettings pushSettings) {
        this.pushSettings = pushSettings;
    }

    public SmsRequest() {
    }

    public static class PushSettings {
        public String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public PushSettings(String url) {
            this.url = url;
        }

        public PushSettings() {
        }
        @Override
        public String toString() {
            return "Push Settings {" +
                    "url='" + url + '\'' +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "Sms Send Request {" +
                "type=" + type +
                ", sendingType=" + sendingType +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", number=" + number +
                ", encoding=" + encoding +
                ", sender='" + sender + '\'' +
                ", skipAhsQuery=" + skipAhsQuery +
                ", sendingDate='" + sendingDate + '\'' +
                ", validity=" + validity +
                ", pushSettings=" + pushSettings +
                '}';
    }
}
