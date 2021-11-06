package com.brest.egbd.domain;

public class EgbdROVD {
    private Long rovdId;
    private String rovdName;

    public EgbdROVD() {}

    public EgbdROVD(Long rovdId, String rovdName) {
        this.rovdId = rovdId;
        this.rovdName = rovdName;
    }

    public Long getRovdId() {
        return rovdId;
    }

    public void setRovdId(Long rovdId) {
        this.rovdId = rovdId;
    }

    public String getRovdName() {
        return rovdName;
    }

    public void setRovdName(String rovdName) {
        this.rovdName = rovdName;
    }

    @Override
    public String toString() {
        return "EgbdROVD{" +
                "rovdId=" + rovdId +
                ", rovdName='" + rovdName + '\'' +
                '}';
    }
}
