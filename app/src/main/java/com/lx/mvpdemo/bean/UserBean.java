package com.lx.mvpdemo.bean;

public class UserBean {


    /**
     * id : 14
     * headPortrait : http://182.254.174.100:8080/pintuan/images/2315e499-8cde-4d67-a0d0-f87caf05c273.jpeg
     * age : 29
     * department : 计算机
     * registrationTime : 2020-08-08 10:34
     * hobbyTags : 打游戏
     * persSignature : null
     * creditRating : 100
     * nickName : 大大
     * password : 123456
     * sex : 女
     * phone : 15736779999
     * token : rJif6F4fOBphtI/ANhRVoQrUUsZyRUy7@tyfm.cn.rongnav.com;tyfm.cn.rongcfg.com
     */

    private int id;
    private String headPortrait;
    private int age;
    private String department;
    private String registrationTime;
    private String hobbyTags;
    private Object persSignature;
    private int creditRating;
    private String nickName;
    private String password;
    private String sex;
    private String phone;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getHobbyTags() {
        return hobbyTags;
    }

    public void setHobbyTags(String hobbyTags) {
        this.hobbyTags = hobbyTags;
    }

    public Object getPersSignature() {
        return persSignature;
    }

    public void setPersSignature(Object persSignature) {
        this.persSignature = persSignature;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", headPortrait='" + headPortrait + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", registrationTime='" + registrationTime + '\'' +
                ", hobbyTags='" + hobbyTags + '\'' +
                ", persSignature=" + persSignature +
                ", creditRating=" + creditRating +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
