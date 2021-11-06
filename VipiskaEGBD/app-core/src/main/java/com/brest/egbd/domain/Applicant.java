package com.brest.egbd.domain;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import java.text.SimpleDateFormat;

public class Applicant {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private Long    applicantId;
    private String 	applicantName;
    private String  applicantPatronymic;
    private String  applicantSurname;
    private Date    applicantDateOfBirth;
    private String  applicantPlaceOfBirth;
    private String  applicantPlaceOfResidence;
    private String  applicantIdentificationNumber;
    private Set statements = new HashSet(); // for link tables

    public Applicant() {}

    public Applicant(Long   applicantId,
                     String applicantName,
                     String applicantPatronymic,
                     String applicantSurname,
                     Date   applicantDateOfBirth,
                     String applicantPlaceOfBirth,
                     String applicantPlaceOfResidence,
                     String applicantIdentificationNumber,
                     Set    statements
                     ){
        this.applicantId                    = applicantId;
        this.applicantName                  = applicantName;
        this.applicantPatronymic            = applicantPatronymic;
        this.applicantSurname               = applicantSurname;
        this.applicantDateOfBirth           = applicantDateOfBirth;
        this.applicantPlaceOfBirth          = applicantPlaceOfBirth;
        this.applicantPlaceOfResidence      = applicantPlaceOfResidence;
        this.applicantIdentificationNumber  = applicantIdentificationNumber;
        this.statements                     = statements;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantPatronymic() {
        return applicantPatronymic;
    }

    public void setApplicantPatronymic(String applicantPatronymic) {
        this.applicantPatronymic = applicantPatronymic;
    }

    public String getApplicantSurname() {
        return applicantSurname;
    }

    public void setApplicantSurname(String applicantSurname) {
        this.applicantSurname = applicantSurname;
    }

    public Date getApplicantDateOfBirth() {
        return applicantDateOfBirth;
    }

    public void setApplicantDateOfBirth(Date applicantDateOfBirth) {
        this.applicantDateOfBirth = applicantDateOfBirth;
    }

    public String getApplicantPlaceOfBirth() {
        return applicantPlaceOfBirth;
    }

    public void setApplicantPlaceOfBirth(String applicantPlaceOfBirth) {
        this.applicantPlaceOfBirth = applicantPlaceOfBirth;
    }

    public String getApplicantPlaceOfResidence() {
        return applicantPlaceOfResidence;
    }

    public void setApplicantPlaceOfResidence(String applicantPlaceOfResidence) {
        this.applicantPlaceOfResidence = applicantPlaceOfResidence;
    }

    public String getApplicantIdentificationNumber() {
        return applicantIdentificationNumber;
    }

    public void setApplicantIdentificationNumber(String applicantIdentificationNumber) {
        this.applicantIdentificationNumber = applicantIdentificationNumber;
    }

    //--- get/set one-to-many link
    public Set getStatements() {
        return statements;
    }

    public void setStatements(Set statements) {
        this.statements = statements;
    }
    public void setToStatements(Statement statement){
        this.getStatements().add(statement);
        //depositor.setDeposit(this);
    }

    @Override
    public String toString() {
        String dateOfBirth;
        if (applicantDateOfBirth != null) dateOfBirth = dateFormat.format(applicantDateOfBirth);
        else dateOfBirth = "null";
        return "Applicant{" +
                "applicantId=" + applicantId +
                ", applicantName='" + applicantName + '\'' +
                ", applicantPatronymic='" + applicantPatronymic + '\'' +
                ", applicantSurname='" + applicantSurname + '\'' +
                ", applicantDateOfBirth=" + dateOfBirth + '\'' +
                ", applicantPlaceOfBirth='" + applicantPlaceOfBirth + '\'' +
                ", applicantPlaceOfResidence='" + applicantPlaceOfResidence + '\'' +
                ", applicantIdentificationNumber='" + applicantIdentificationNumber + '\'' +
                ", statements=" + statements +
                '}';
    }
}
