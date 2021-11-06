package com.brest.egbd.domain;

public class EgbdUser {
    private Long egbdUserId;
    private String egbdUserLogin;
    private String egbdUserPassword;
    private String egbdUserFIO;
    private String egbdUserPhoneNumber;

    public EgbdUser() {
    }

    public EgbdUser(Long egbdUserId,
                    String egbdUserLogin,
                    String egbdUserPassword,
                    String egbdUserFIO,
                    String egbdUserPhoneNumber) {
        this.egbdUserId = egbdUserId;
        this.egbdUserLogin = egbdUserLogin;
        this.egbdUserPassword = egbdUserPassword;
        this.egbdUserFIO = egbdUserFIO;
        this.egbdUserPhoneNumber = egbdUserPhoneNumber;
    }

    public Long getEgbdUserId() {
        return egbdUserId;
    }

    public void setEgbdUserId(Long egbdUserId) {
        this.egbdUserId = egbdUserId;
    }

    public String getEgbdUserLogin() {
        return egbdUserLogin;
    }

    public void setEgbdUserLogin(String egbdUserLogin) {
        this.egbdUserLogin = egbdUserLogin;
    }

    public String getEgbdUserPassword() {
        return egbdUserPassword;
    }

    public void setEgbdUserPassword(String egbdUserPassword) {
        this.egbdUserPassword = egbdUserPassword;
    }

    public String getEgbdUserFIO() {
        return egbdUserFIO;
    }

    public void setEgbdUserFIO(String egbdUserFIO) {
        this.egbdUserFIO = egbdUserFIO;
    }

    public String getEgbdUserPhoneNumber() {
        return egbdUserPhoneNumber;
    }

    public void setEgbdUserPhoneNumber(String egbdUserPhoneNumber) {
        this.egbdUserPhoneNumber = egbdUserPhoneNumber;
    }

    @Override
    public String toString() {
        return "EgbdUser{" +
                "egbdUserId=" + egbdUserId +
                ", egbdUserLogin='" + egbdUserLogin + '\'' +
                ", egbdUserPassword='" + egbdUserPassword + '\'' +
                ", egbdUserFIO='" + egbdUserFIO + '\'' +
                ", egbdUserPhoneNumber='" + egbdUserPhoneNumber + '\'' +
                '}';
    }
}
