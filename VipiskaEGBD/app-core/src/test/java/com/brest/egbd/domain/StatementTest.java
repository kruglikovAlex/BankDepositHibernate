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
    public void getStatementDateRegistration() {
    }

    @Test
    public void getStatementDateExecution() {
    }

    @Test
    public void getStatementDateReceipt() {
    }

    @Test
    public void getStatementNumberBlank() {
    }

    @Test
    public void getStatementExecutor() {
    }

    @Test
    public void getStatementStory() {
    }

    @Test
    public void getStatementCriminalRecord() {
    }

    @Test
    public void getStatementAdministrativeInquiry() {
    }

    @Test
    public void getStatementNomenclatureVolume() {
    }

    @Test
    public void getStatementOutgoingNumber() {
    }

    @Test
    public void getStatementROVDin() {
    }

    @Test
    public void getStatementROVDout() {
    }

    @Test
    public void getStatementPayment() {
    }

    @Test
    public void getStatementRequestedInformation() {
    }

    @Test
    public void testToString() {
    }
}