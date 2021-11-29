package com.brest.egbd.dao;

import com.brest.egbd.domain.Applicant;
import com.brest.egbd.domain.BankDeposit;
import com.brest.egbd.domain.Statement;
import com.brest.egbd.util.HibernateUtil;

import com.brest.egbd.util.HibernateUtil;
import org.apache.logging.log4j.core.jackson.ListOfMapEntryDeserializer;
import org.hibernate.Session;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class ApplicantDaoImp implements ApplicantDao{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private Applicant applicant;
    private List<Applicant> applicants;
    private Session session;
    private SessionFactory sessionFactory;
    private Statement statement;

    @Override
    public void setSession(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
        this.session = this.sessionFactory.getCurrentSession();
        this.session.beginTransaction();
        LOGGER.debug("ApplicantDaoImp session: {}", session.toString());
    }
    //---- get
        //---- all applicants with Criteria
    @Override
    public List<Applicant> getApplicantsCriteria(){
        LOGGER.debug("getApplicantsCriteria()");
        applicants = new ArrayList<Applicant>();
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        for(Object d: HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class).list()){
            applicants.add((Applicant) d);
        }
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicants:{}", applicants);
        return applicants;
    }
        //---- part
    @Override
    public List<Applicant> getApplicantsByDateOfBirthCriteria(Date dateOfBirth){
        LOGGER.debug("getApplicantsByDateOfBirthCriteria(dateOfBirth = {})", dateOfBirth);
        applicants = new ArrayList<Applicant>();
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        for(Object d: HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.eq("applicantDateOfBirth", dateOfBirth))
                .list()){
            applicants.add((Applicant) d);
        }
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicants;{}", applicants);
        return applicants;
    }

    @Override
    public List<Applicant> getApplicantByApplicantSurnameCriteria(String applicantSurname){
        LOGGER.debug("getApplicantByApplicantSurnameCriteria(applicantSurname = {})", applicantSurname);
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        for(Object d: HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.eq("applicantSurname", applicantSurname))
                .list()){
            applicants.add((Applicant) d);
        }
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicants:{}", applicants);
        return applicants;
    }

    public List<Applicant> getApplicantByApplicantNameCriteria(String applicantName){
        LOGGER.debug("getApplicantByApplicantNameCriteria(applicantName = {})", applicantName);
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        for(Object d: HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.eq("applicantName", applicantName))
                .list()){
            applicants.add((Applicant) d);
        }
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicants: {}", applicants);
        return applicants;
    }

    public List<Applicant> getApplicantByApplicantSurnameAndNameCriteria(String applicantSurname,
                                                                         String applicantName) {
        LOGGER.debug("getApplicantByApplicantSurnameAndNameCriteria(applicantSurname = {},applicantName = {})",
                applicantSurname,applicantName);
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        for(Object d: HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.and(Restrictions.eq("applicantSurname",applicantSurname), Restrictions.eq("applicantName", applicantName)))
                .list()) {
            applicants.add((Applicant) d);
        }
        //or .add(Restrictions.eq("applicantSurname",applicantSurname)).add(Restrictions.eq("applicantName", applicantName));
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicants: {}", applicants);
        return applicants;
    }

    public List<Applicant> getApplicantByApplicantFIOCriteria(String applicantSurname,
                                                              String applicantName, String applicantPatronymic) {
        LOGGER.debug("getApplicantByApplicantFIOCriteria(applicantSurname = {},applicantName = {}, applicantPatronymic = {})",
                applicantSurname, applicantName, applicantPatronymic);
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        for(Object d: HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.and(Restrictions.eq("applicantSurname", applicantSurname),
                        Restrictions.eq("applicantName", applicantName),
                        Restrictions.eq("applicantPatronymic", applicantPatronymic))).list()){
            applicants.add((Applicant) d);
        }

        LOGGER.debug("applicants: {}", applicants);
        return applicants;
    }

        //---- single
    @Override
    public Applicant getApplicantByIdCriteria(Long applicantId){
        LOGGER.debug("getApplicantByIdCriteria({})", applicantId);
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        applicant = (Applicant) HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.eq("applicantId", applicantId)).uniqueResult();
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicant:{}", applicant);
        return applicant;
    }

    public Applicant getApplicantByIdentificationNumberCriteria(String applicantIdentificationNumber) {
        LOGGER.debug("getApplicantByIdentificationNumberCriteria({})", applicantIdentificationNumber);
        //--- open session
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        //--- query
        applicant = (Applicant) HibernateUtil.getSessionFactory().getCurrentSession()
                .createCriteria(Applicant.class)
                .add(Restrictions.eq("applicantIdentificationNumber", applicantIdentificationNumber))
                .uniqueResult();
        //--- close session
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        LOGGER.debug("applicant = {}", applicant);
        return applicant;
    }

        //---- create
    public void addApplicant(Applicant applicant){
        LOGGER.debug("addApplicant({})", applicant);
        assertNotNull(applicant);
        try{
            //--- open session
            HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            //--- save object
            HibernateUtil.getSessionFactory()
                    .getCurrentSession().save(applicant);
            //--- close session
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        }catch (Exception e){
            LOGGER.error("error - addApplicant({}) - {}", applicant, e.toString());
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
            throw new IllegalArgumentException("error - addApplicant() " + e.toString());
        }
    }
        //---- update
    public void updateApplicant(Applicant applicant){
        LOGGER.debug("updateApplicant({})", applicant);
        assertNotNull(applicant);
        try{
            //--- open session
            HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            //--- update
            HibernateUtil.getSessionFactory()
                    .getCurrentSession().update(applicant);
            //--- close session
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        }catch (Exception e){
            LOGGER.error("error - updateApplicant({}) - {}", applicant, e.toString());
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
            throw new IllegalArgumentException("error - updateApplicant() " + e.toString());
        }
    }
        //---- delete
    public void deleteApplicant(Long applicantId){
        LOGGER.debug("deleteApplicant({})",applicantId);
        assertNotNull(applicantId);
        try{
            //--- open session
            HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            //--- query
            Applicant applicant = (Applicant) HibernateUtil.getSessionFactory().getCurrentSession()
                    .createCriteria(Applicant.class)
                    .add(Restrictions.eq("applicantId", applicantId)).uniqueResult();
            //--- delete
            HibernateUtil.getSessionFactory().getCurrentSession().delete(applicant);
        }catch (Exception e){
            LOGGER.error("error - deleteApplicant({}) - {}", applicant, e.toString());
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
            throw new IllegalArgumentException("error - deleteApplicant() " + e.toString());
        }
    }
}
