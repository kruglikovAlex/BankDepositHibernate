package com.brest.egbd.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class EgbdPaymentTest {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    EgbdPayment egbdPayment;

    @Before
    public void setUp(){
        egbdPayment = new EgbdPayment();
    }

    @Test
    public void testGetEgbdPaymentId() throws Exception {
        Long id = (long)(Math.random()*10);
        LOGGER.debug("testGetEgbdPaymentId({})", id);
        egbdPayment.setEgbdPaymentId(id);

        assertEquals(id, egbdPayment.getEgbdPaymentId());
    }

    @Test
    public void testGetEgbdPaymentSumma() {
        double summa = 10.5;
        LOGGER.debug("testGetEgbdPaymentSumma({})",summa);
        egbdPayment.setEgbdPaymentSumma(summa);

        assertEquals(summa, egbdPayment.getEgbdPaymentSumma(),0);
    }

    @Test
    public void testGetEgbdPaymentDate() throws ParseException {
        LOGGER.debug("testGetEgbdPaymentDate({})", "2021-11-17");
        egbdPayment.setEgbdPaymentDate(dateFormat.parse("2021-11-17"));

        assertEquals("2021-11-17",dateFormat.format(egbdPayment.getEgbdPaymentDate()));
        assertEquals(dateFormat.parse("2021-11-17"),egbdPayment.getEgbdPaymentDate());
        assertTrue(egbdPayment.getEgbdPaymentDate().compareTo(dateFormat.parse("2021-11-17")) == 0);
    }

    @Test
    public void testToString() {
        LOGGER.debug("testToString({})", egbdPayment);

        assertEquals("EgbdPayment{egbdPaymentId=null, egbdPaymentSumma=null, egbdPaymentDate=null}", egbdPayment.toString());
    }
}