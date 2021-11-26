package com.brest.egbd.dao;

import com.brest.egbd.domain.Applicant;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.List;

public interface ApplicantDao {
    //--- connection
    public void setSession(SessionFactory sessionFactory);
    //---- get
        //---- all
    public List<Applicant> getApplicantsCriteria();
        //---- part
    public List<Applicant> getApplicantByApplicantSurnameCriteria(String applicantSurname);
    public List<Applicant> getApplicantsByDateOfBirthCriteria(Date dateOfBirth);
    public List<Applicant> getApplicantByApplicantNameCriteria(String applicantName);
    public List<Applicant> getApplicantByApplicantSurnameAndNameCriteria(String applicantSurname, String applicantName);
    public List<Applicant> getApplicantByApplicantFIOCriteria(String applicantSurname, String applicantName, String applicantPatronymic);
    //---- single
    public Applicant getApplicantByIdCriteria(Long applicantId);
    public Applicant getApplicantByIdentificationNumberCriteria(String applicantIdentificationNumber);
        //---- create
    public void addApplicant(Applicant applicant);
        //---- update
    public void updateApplicant(Applicant applicant);
        //---- delete
    public void deleteApplicant(Long applicantId);


}
