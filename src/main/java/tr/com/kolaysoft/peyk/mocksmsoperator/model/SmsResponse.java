package tr.com.kolaysoft.peyk.mocksmsoperator.model;


import java.io.Serializable;
import java.util.ArrayList;

public class SmsResponse implements Serializable {
    public SmsError err;
    public Data data;

    public SmsResponse(SmsError err, Data data) {
        this.err = err;
        this.data = data;
    }

    public SmsResponse() {
    }


    public SmsError getErr() {
        return err;
    }

    public void setErr(SmsError err) {
        this.err = err;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public static class Data {
        public int pkgID;
        public Stats stats;
        public ArrayList<SmsResult> list;

        public Data() {
        }

        public Data(int pkgID) {
            this.pkgID = pkgID;
        }

        public int getPkgID() {
            return pkgID;
        }

        public void setPkgID(int pkgID) {
            this.pkgID = pkgID;
        }

        public ArrayList<SmsResult> getList() {
            return list;
        }

        public void setList(ArrayList<SmsResult> list) {
            this.list = list;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "pkgID=" + pkgID +
                    ", stats=" + stats +
                    ", list=" + list +
                    '}';
        }

        public static class Stats {
            public int totalRecord;
        }
    }
}
