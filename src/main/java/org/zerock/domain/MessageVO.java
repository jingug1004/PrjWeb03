package org.zerock.domain;

import java.util.Date;

/**
 * Created by macbookpro on 2017. 2. 19. PM 2:07
 * sp4chap11-Project / org.zerock.domain
 * No pain, No gain!
 */


public class MessageVO {
    private Integer mno;
    private String targetid;
    private String sender;
    private String message;
    private Date opendate;
    private Date senddate;


    public Integer getMno() {
        return mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public String getTargetid() {
        return targetid;
    }

    public void setTargetid(String targetid) {
        this.targetid = targetid;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getOpendate() {
        return opendate;
    }

    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    @Override
    public String toString() {
        return "MessageVO{" +
                "mno=" + mno +
                ", targetid='" + targetid + '\'' +
                ", sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", opendate=" + opendate +
                ", senddate=" + senddate +
                '}';
    }
}
