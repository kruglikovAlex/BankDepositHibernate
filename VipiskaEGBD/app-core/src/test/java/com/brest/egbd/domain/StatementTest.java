package com.brest.egbd.domain;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatementTest {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Statement statement;

    @Before
    public void setUp() {
        statement = new Statement();
    }

    @Test
    public void testGetStatementId() throws Exception{
        Long id = (long)(Math.random()*10);
        LOGGER.debug("testGetStatementId({})", id);
        statement.setStatementId(id);

        assertEquals(id, statement.getStatementId());
        assertTrue(statement.getStatementId().compareTo(id) == 0);
    }

    @Test
    public void testGetStatementNumber() throws Exception{
        String number = "51/20/U-1";
        LOGGER.debug("testGetStatementNumber({})", number);
        statement.setStatementNumber(number);

        assertEquals(number, statement.getStatementNumber());
    }

    @Test
    public void testGetStatementDateOfSubmission() throws ParseException{
        LOGGER.debug("testGetStatementDateOfSubmission({})", "2021-11-24");
        statement.setStatementDateOfSubmission(dateFormat.parse("2021-11-24"));

        assertEquals("2021-11-24", dateFormat.format(statement.getStatementDateOfSubmission()));
        assertEquals(dateFormat.parse("2021-11-24"), statement.getStatementDateOfSubmission());
        assertTrue(statement.getStatementDateOfSubmission().compareTo(dateFormat.parse("2021-11-24")) == 0);
    }

    @Test
    public void testGetStatementDateRegistration() throws ParseException{
        LOGGER.debug("testGetStatementDateRegistration({})", "2021-11-25");
        statement.setStatementDateRegistration(dateFormat.parse("2021-11-25"));

        assertEquals("2021-11-25", dateFormat.format(statement.getStatementDateRegistration()));
        assertEquals(dateFormat.parse("2021-11-25"), statement.getStatementDateRegistration());
        assertTrue(statement.getStatementDateRegistration().compareTo(dateFormat.parse("2021-11-25"))==0);
    }

    @Test
    public void testGetStatementDateExecution() throws ParseException{
        LOGGER.debug("testGetStatementDateExecution({})", "2021-11-25");
        statement.setStatementDateExecution(dateFormat.parse("2021-11-25"));

        assertEquals("2021-11-25", dateFormat.format(statement.getStatementDateExecution()));
        assertEquals(dateFormat.parse("2021-11-25"), statement.getStatementDateExecution());
        assertTrue(statement.getStatementDateExecution().compareTo(dateFormat.parse("2021-11-25"))==0);
    }

    @Test
    public void testGetStatementDateReceipt() throws ParseException{
        LOGGER.debug("testGetStatementDateReceipt({})", "2021-11-25");
        statement.setStatementDateReceipt(dateFormat.parse("2021-11-25"));

        assertEquals("2021-11-25", dateFormat.format(statement.getStatementDateReceipt()));
        assertEquals(dateFormat.parse("2021-11-25"), statement.getStatementDateReceipt());
        assertTrue(statement.getStatementDateReceipt().compareTo(dateFormat.parse("2021-11-25"))==0);
    }

    @Test
    public void testGetStatementNumberBlank() {
        String numberBlank = "IC7/0000001";
        LOGGER.debug("testGetStatementNumberBlank({})", numberBlank);
        statement.setStatementNumberBlank(numberBlank);

        assertEquals(numberBlank, statement.getStatementNumberBlank());
    }

    @Test
    public void testGetStatementExecutor() {
        EgbdUser egbdUser = new EgbdUser(1L, "KMV", "KMV", "Kruglikova", "+375(29)7777777");
        LOGGER.debug("testGetStatementExecutor({})", egbdUser);
        statement.setStatementExecutor(egbdUser);

        assertEquals(egbdUser, statement.getStatementExecutor());
    }

    @Test
    public void testGetStatementStory() {
        LOGGER.debug("testGetStatementStory({})", "qweasdzxc");
        statement.setStatementStory("qweasdzxc");

        assertEquals("qweasdzxc", statement.getStatementStory());
    }

    @Test
    public void testGetStatementCriminalRecord() {
        LOGGER.debug("testGetStatementCriminalRecord({}) ", true);
        statement.setStatementCriminalRecord(true);

        assertEquals(true, statement.getStatementCriminalRecord());

        LOGGER.debug("testGetStatementCriminalRecord({}) ", false);
        statement.setStatementCriminalRecord(false);

        assertEquals(false, statement.getStatementCriminalRecord());
    }

    @Test
    public void testGetStatementAdministrativeInquiry() {
        LOGGER.debug("testGetStatementAdministrativeInquiry({}) ", true);
        statement.setStatementAdministrativeInquiry(true);

        assertEquals(true, statement.getStatementAdministrativeInquiry());

        LOGGER.debug("testGetStatementAdministrativeInquiry({}) ", false);
        statement.setStatementAdministrativeInquiry(false);

        assertEquals(false, statement.getStatementAdministrativeInquiry());

    }

    @Test
    public void testGetStatementNomenclatureVolume() {
        String number = "T1/1234";
        LOGGER.debug("testGetStatementNomenclatureVolume({})", number);
        statement.setStatementNomenclatureVolume(number);

        assertEquals(number, statement.getStatementNomenclatureVolume());
    }

    @Test
    public void testGetStatementOutgoingNumber() {
        String number = "51/20/I-1";
        LOGGER.debug("testGetStatementOutgoingNumber({})", number);
        statement.setStatementOutgoingNumber(number);

        assertEquals(number, statement.getStatementOutgoingNumber());
    }

    @Test
    public void testGetStatementROVDin() {
        EgbdROVD rovd = new EgbdROVD(1L, "Leninskiy ROVD");
        LOGGER.debug("testGetStatementROVDin({})", rovd);
        statement.setStatementROVDin(rovd);

        assertEquals(rovd, statement.getStatementROVDin());
    }

    @Test
    public void testGetStatementROVDout() {
        EgbdROVD rovd = new EgbdROVD(1L, "Leninskiy ROVD");
        LOGGER.debug("testGetStatementROVDout({})", rovd);
        statement.setStatementROVDout(rovd);

        assertEquals(rovd, statement.getStatementROVDout());
    }

    @Test
    public void testGetStatementPayment() throws ParseException{
        EgbdPayment payment = new EgbdPayment(1L, 10.5, dateFormat.parse("2021-11-25"));
        LOGGER.debug("testGetStatementPayment({})", payment);
        statement.setStatementPayment(payment);

        assertEquals(payment, statement.getStatementPayment());
    }

    @Test
    public void testGetStatementRequestedInformation() {
        LOGGER.debug("testGetStatementRequestedInformation({})",StatementRequestedInformation.Criminal);
        statement.setStatementRequestedInformation(StatementRequestedInformation.Criminal);

        assertEquals(StatementRequestedInformation.Criminal, statement.getStatementRequestedInformation());
    }

    @Test
    public void testToString() {
        LOGGER.debug("testToString({})",statement);

        assertEquals("Statement{statementId=null, statementNumber='null', statementDateOfSubmission=null, "+
                "statementDateRegistration=null, statementDateExecution=null, statementDateReceipt=null, "+
                "statementNumberBlank='null', statementExecutor=null, statementStory='null', "+
                "statementCriminalRecord=null, statementAdministrativeInquiry=null, "+
                "statementNomenclatureVolume='null', statementOutgoingNumber='null', statementROVDin=null, "+
                "statementROVDout=null, statementPayment=null, statementRequestedInformation=null}", statement.toString());
    }
}