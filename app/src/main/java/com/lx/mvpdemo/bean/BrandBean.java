package com.lx.mvpdemo.bean;

public class BrandBean {


    /**
     * id : 51
     * entName : 中铝国际（天津）建设有限公司
     * entShortName : 中铝国际
     * entLogoHot : ""
     */

    private int id;
    private String entName;
    private String entShortName;
    private String entLogoHot;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getEntShortName() {
        return entShortName;
    }

    public void setEntShortName(String entShortName) {
        this.entShortName = entShortName;
    }

    public String getEntLogoHot() {
        return entLogoHot;
    }

    public void setEntLogoHot(String entLogoHot) {
        this.entLogoHot = entLogoHot;
    }

    @Override
    public String toString() {
        return "BrandBean{" +
                "id=" + id +
                ", entName='" + entName + '\'' +
                ", entShortName='" + entShortName + '\'' +
                ", entLogoHot='" + entLogoHot + '\'' +
                '}';
    }
}
