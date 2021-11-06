package com.brest.egbd.domain;

import java.util.Date;

public class Statement {

    public static enum StatementRequestedInformation {Criminal, Administrative, CriminalAndAdministrative};

    private Long statementId;
    private String statementNumber; //номер заявления
    private Date statementDateOfSubmission; //дата подачи заявления
    private Date statementDateRegistration;     //дата регистрации заявления
    private Date statementDateExecution; //дата исполнения заявления
    private Date statementDateReceipt;  //дата получения заявителем выписки
    private String statementNumberBlank;  //номер бланка
    private EgbdUser statementExecutor;   //исполнитель
    private String statementStory;
    private Boolean statementCriminalRecord;
    private Boolean statementAdministrativeInquiry;
    private String statementNomenclatureVolume;
    private String statementOutgoingNumber;
    private EgbdROVD statementROVDin;
    private EgbdROVD statementROVDout;
    private EgbdPayment statementPayment;
    private StatementRequestedInformation statementRequestedInformation;

    public Statement() {
    }

    public Statement(Long statementId,
                     String statementNumber,
                     Date statementDateOfSubmission,
                     Date statementDateRegistration,
                     Date statementDateExecution,
                     Date statementDateReceipt,
                     String statementNumberBlank,
                     EgbdUser statementExecutor,
                     String statementStory,
                     Boolean statementCriminalRecord,
                     Boolean statementAdministrativeInquiry,
                     String statementNomenclatureVolume,
                     String statementOutgoingNumber,
                     EgbdROVD statementROVDin,
                     EgbdROVD statementROVDout,
                     EgbdPayment statementPayment,
                     StatementRequestedInformation statementRequestedInformation) {
        this.statementId = statementId;
        this.statementNumber = statementNumber;
        this.statementDateOfSubmission = statementDateOfSubmission;
        this.statementDateRegistration = statementDateRegistration;
        this.statementDateExecution = statementDateExecution;
        this.statementDateReceipt = statementDateReceipt;
        this.statementNumberBlank = statementNumberBlank;
        this.statementExecutor = statementExecutor;
        this.statementStory = statementStory;
        this.statementCriminalRecord = statementCriminalRecord;
        this.statementAdministrativeInquiry = statementAdministrativeInquiry;
        this.statementNomenclatureVolume = statementNomenclatureVolume;
        this.statementOutgoingNumber = statementOutgoingNumber;
        this.statementROVDin = statementROVDin;
        this.statementROVDout = statementROVDout;
        this.statementPayment = statementPayment;
        this.statementRequestedInformation = statementRequestedInformation;
    }

    public Long getStatementId() {
        return statementId;
    }

    public void setStatementId(Long statementId) {
        this.statementId = statementId;
    }

    public String getStatementNumber() {
        return statementNumber;
    }

    public void setStatementNumber(String statementNumber) {
        this.statementNumber = statementNumber;
    }

    public Date getStatementDateOfSubmission() {
        return statementDateOfSubmission;
    }

    public void setStatementDateOfSubmission(Date statementDateOfSubmission) {
        this.statementDateOfSubmission = statementDateOfSubmission;
    }

    public Date getStatementDateRegistration() {
        return statementDateRegistration;
    }

    public void setStatementDateRegistration(Date statementDateRegistration) {
        this.statementDateRegistration = statementDateRegistration;
    }

    public Date getStatementDateExecution() {
        return statementDateExecution;
    }

    public void setStatementDateExecution(Date statementDateExecution) {
        this.statementDateExecution = statementDateExecution;
    }

    public Date getStatementDateReceipt() {
        return statementDateReceipt;
    }

    public void setStatementDateReceipt(Date statementDateReceipt) {
        this.statementDateReceipt = statementDateReceipt;
    }

    public String getStatementNumberBlank() {
        return statementNumberBlank;
    }

    public void setStatementNumberBlank(String statementNumberBlank) {
        this.statementNumberBlank = statementNumberBlank;
    }

    public EgbdUser getStatementExecutor() {
        return statementExecutor;
    }

    public void setStatementExecutor(EgbdUser statementExecutor) {
        this.statementExecutor = statementExecutor;
    }

    public String getStatementStory() {
        return statementStory;
    }

    public void setStatementStory(String statementStory) {
        this.statementStory = statementStory;
    }

    public Boolean getStatementCriminalRecord() {
        return statementCriminalRecord;
    }

    public void setStatementCriminalRecord(Boolean statementCriminalRecord) {
        this.statementCriminalRecord = statementCriminalRecord;
    }

    public Boolean getStatementAdministrativeInquiry() {
        return statementAdministrativeInquiry;
    }

    public void setStatementAdministrativeInquiry(Boolean statementAdministrativeInquiry) {
        this.statementAdministrativeInquiry = statementAdministrativeInquiry;
    }

    public String getStatementNomenclatureVolume() {
        return statementNomenclatureVolume;
    }

    public void setStatementNomenclatureVolume(String statementNomenclatureVolume) {
        this.statementNomenclatureVolume = statementNomenclatureVolume;
    }

    public String getStatementOutgoingNumber() {
        return statementOutgoingNumber;
    }

    public void setStatementOutgoingNumber(String statementOutgoingNumber) {
        this.statementOutgoingNumber = statementOutgoingNumber;
    }

    public EgbdROVD getStatementROVDin() {
        return statementROVDin;
    }

    public void setStatementROVDin(EgbdROVD statementROVDin) {
        this.statementROVDin = statementROVDin;
    }

    public EgbdROVD getStatementROVDout() {
        return statementROVDout;
    }

    public void setStatementROVDout(EgbdROVD statementROVDout) {
        this.statementROVDout = statementROVDout;
    }

    public EgbdPayment getStatementPayment() {
        return statementPayment;
    }

    public void setStatementPayment(EgbdPayment statementPayment) {
        this.statementPayment = statementPayment;
    }

    public StatementRequestedInformation getStatementRequestedInformation() {
        return statementRequestedInformation;
    }

    public void setStatementRequestedInformation(StatementRequestedInformation statementRequestedInformation) {
        this.statementRequestedInformation = statementRequestedInformation;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "statementId=" + statementId +
                ", statementNumber='" + statementNumber + '\'' +
                ", statementDateOfSubmission=" + statementDateOfSubmission +
                ", statementDateRegistration=" + statementDateRegistration +
                ", statementDateExecution=" + statementDateExecution +
                ", statementDateReceipt=" + statementDateReceipt +
                ", statementNumberBlank='" + statementNumberBlank + '\'' +
                ", statementExecutor=" + statementExecutor +
                ", statementStory='" + statementStory + '\'' +
                ", statementCriminalRecord=" + statementCriminalRecord +
                ", statementAdministrativeInquiry=" + statementAdministrativeInquiry +
                ", statementNomenclatureVolume='" + statementNomenclatureVolume + '\'' +
                ", statementOutgoingNumber='" + statementOutgoingNumber + '\'' +
                ", statementROVDin=" + statementROVDin +
                ", statementROVDout=" + statementROVDout +
                ", statementPayment=" + statementPayment +
                ", statementRequestedInformation=" + statementRequestedInformation +
                '}';
    }
}
