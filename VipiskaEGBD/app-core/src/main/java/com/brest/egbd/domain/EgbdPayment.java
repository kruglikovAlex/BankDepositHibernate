package com.brest.egbd.domain;

import java.util.Date;

public class EgbdPayment {
    private Long egbdPaymentId;
    private Float egbdPaymentSumma;
    private Date egbdPaymentDate;

    public EgbdPayment() {}

    public EgbdPayment(Long egbdPaymentId, Float egbdPaymentSumma, Date egbdPaymentDate) {
        this.egbdPaymentId = egbdPaymentId;
        this.egbdPaymentSumma = egbdPaymentSumma;
        this.egbdPaymentDate = egbdPaymentDate;
    }

    public Long getEgbdPaymentId() {
        return egbdPaymentId;
    }

    public void setEgbdPaymentId(Long egbdPaymentId) {
        this.egbdPaymentId = egbdPaymentId;
    }

    public Float getEgbdPaymentSumma() {
        return egbdPaymentSumma;
    }

    public void setEgbdPaymentSumma(Float egbdPaymentSumma) {
        this.egbdPaymentSumma = egbdPaymentSumma;
    }

    public Date getEgbdPaymentDate() {
        return egbdPaymentDate;
    }

    public void setEgbdPaymentDate(Date egbdPaymentDate) {
        this.egbdPaymentDate = egbdPaymentDate;
    }

    @Override
    public String toString() {
        return "EgbdPayment{" +
                "egbdPaymentId=" + egbdPaymentId +
                ", egbdPaymentSumma=" + egbdPaymentSumma +
                ", egbdPaymentDate=" + egbdPaymentDate +
                '}';
    }
}
