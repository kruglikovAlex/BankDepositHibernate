package com.brest.egbd.domain;

import org.junit.Before;
import org.junit.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    public void testGetApplicantName() throws Exception {
        String name = "Alex";
        LOGGER.debug("testGetApplicantName({})",name);
        applicant.setApplicantName(name);

        assertEquals(name, applicant.getApplicantName());
    }

    @Test
    public void testGetApplicantPatronymic() throws Exception {
        String patronymic = "S.";
        LOGGER.debug("testGetApplicantPatronymic({})",patronymic);
        applicant.setApplicantPatronymic(patronymic);

        assertEquals(patronymic, applicant.getApplicantPatronymic());
    }

    @Test
    public void testGetApplicantSurname() throws Exception {
        String surname = "Kruglikov";
        LOGGER.debug("testGetApplicantPatronymic({})",surname);
        applicant.setApplicantSurname(surname);

        assertEquals(surname, applicant.getApplicantSurname());
    }

    @Test
    public void tesGetApplicantDateOfBirth() throws ParseException {
        LOGGER.debug("esGetApplicantDateOfBirth({})","1977-05-28");
        applicant.setApplicantDateOfBirth(dateFormat.parse("1977-05-28"));

        assertEquals("1977-05-28",dateFormat.format(applicant.getApplicantDateOfBirth()));
        assertEquals(dateFormat.parse("1977-05-28"),applicant.getApplicantDateOfBirth());
        assertTrue(applicant.getApplicantDateOfBirth().compareTo(dateFormat.parse("1977-05-28")) == 0);
    }

    @Test
    public void testGetApplicantPlaceOfBirth() {
        LOGGER.debug("testGetApplicantPlaceOfBirth({})","Brest, Moscow str. 50");
        applicant.setApplicantPlaceOfBirth("Brest, Moscow str. 50");

        assertEquals("Brest, Moscow str. 50", applicant.getApplicantPlaceOfBirth());
    }

    @Test
    public void testGetApplicantPlaceOfResidence() {
        LOGGER.debug("testGetApplicantPlaceOfResidence({})","Brest, Moscow str. 50");
        applicant.setApplicantPlaceOfResidence("Brest, Moscow str. 50");

        assertEquals("Brest, Moscow str. 50", applicant.getApplicantPlaceOfResidence());
    }

    @Test
    public void testGetApplicantIdentificationNumber() {
        String identificationNumber = "234567890C05PB6";
        LOGGER.debug("testGetApplicantIdentificationNumber({})",identificationNumber);
        applicant.setApplicantIdentificationNumber(identificationNumber);

        assertEquals(identificationNumber, applicant.getApplicantIdentificationNumber());
    }

    @Test
    public void tesGetStatements() throws ParseException {
        Set statements = new HashSet<Statement>();
        statements.add(new Statement(1L,
                "K-1",
                dateFormat.parse("2021-11-12"),
                dateFormat.parse("2021-11-12"),
                dateFormat.parse("2021-11-12"),
                dateFormat.parse("2021-11-12"),
                "ИЦ7/00000001",
                new EgbdUser(1L, "TestUser", "123QWEasd","Ivan I. Ivanov", "+375(29)1111111"),
                "ст. 111 абвгд",
                true,
                false,
                "T01",
                "51/20/K-1 от 2021-11-12",
                new EgbdROVD(1L, "Барановичский РОВД"),
                new EgbdROVD(1L, "Барановичский РОВД"),
                new EgbdPayment(),
                StatementRequestedInformation.Criminal));

        LOGGER.debug("tesGetStatements({})",statements);
        applicant.setStatements(statements);

        assertEquals(statements, applicant.getStatements());
    }

    @Test
    public void testToString() {
        LOGGER.debug("testToString({})",applicant);

        assertEquals("Applicant{applicantId=null, applicantName='null', applicantPatronymic='null', applicantSurname='null'" +
                    ", applicantDateOfBirth='null', applicantPlaceOfBirth='null', applicantPlaceOfResidence='null'" +
                    ", applicantIdentificationNumber='null', statements=[]}", applicant.toString());
    }
}