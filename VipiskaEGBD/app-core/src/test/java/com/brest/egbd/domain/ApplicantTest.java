package com.brest.egbd.domain;

import org.junit.Before;
import org.junit.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.text.SimpleDateFormat;
import java.util.HashSet;

import static org.junit.Assert.*;

public class ApplicantTest {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Applicant applicant;

    @Before
    public void setUp() throws Exception {
        applicant = new Applicant();
    }

    @Test
    public void testGetApplicantId() throws Exception {
        Long id = (long)(Math.random()*10);
        LOGGER.debug("testGetApplicantId({})", id);
        applicant.setApplicantId(id);

        assertEquals(id, applicant.getApplicantId());
    }

    @Test
    public void testGetApplicantName() {
        String name = "Alex";
        LOGGER.debug("testGetApplicantName({})",name);
        applicant.setApplicantName(name);

        assertEquals(name, applicant.getApplicantName());
    }

    @Test
    public void getApplicantPatronymic() {
    }

    @Test
    public void getApplicantSurname() {
    }

    @Test
    public void getApplicantDateOfBirth() {
    }

    @Test
    public void getApplicantPlaceOfBirth() {
    }

    @Test
    public void getApplicantPlaceOfResidence() {
    }

    @Test
    public void getApplicantIdentificationNumber() {
    }

    @Test
    public void getStatements() {
    }

    @Test
    public void testToString() {
    }
}