package com.huangchuan.pojo;

import java.util.Date;

/**
 * Description:
 * User: HC
 * Date: 2020-05-05-18:12
 */
public class Message {
    private Integer id;
    private String msg;
    private Date sendTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
