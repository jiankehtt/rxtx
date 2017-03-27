package com.rxtx.model;

import java.util.Date;

public class WsList {
    private String guid;

    private String rfid;

    private String comport;

    private Date addtime;


    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getComport() {
        return comport;
    }

    public void setComport(String comport) {
        this.comport = comport == null ? null : comport.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

}