package com.skyhospital.pojo;

import java.util.Date;

public class Vip {
    private String vid;

    private String vipName;

    private Integer sex;

    private String phonese;

    private String address;

    private Date createDate;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid == null ? null : vid.trim();
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhonese() {
        return phonese;
    }

    public void setPhonese(String phonese) {
        this.phonese = phonese == null ? null : phonese.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}