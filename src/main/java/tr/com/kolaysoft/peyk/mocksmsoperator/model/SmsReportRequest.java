package tr.com.kolaysoft.peyk.mocksmsoperator.model;


public class SmsReportRequest {
    public String pkgID;
    public String customID;
    public String target;
    public String uuid;
    public Integer state;
    public Integer pageIndex;
    public Integer pageSize;

    public SmsReportRequest() {
    }

    public String getPkgID() {
        return pkgID;
    }

    public void setPkgID(String pkgID) {
        this.pkgID = pkgID;
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    @Override
    public String toString() {
        return "Sms Report Request {" +
                "pkgID='" + pkgID + '\'' +
                ", customID='" + customID + '\'' +
                ", target='" + target + '\'' +
                ", uuid='" + uuid + '\'' +
                ", state=" + state +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }
}

