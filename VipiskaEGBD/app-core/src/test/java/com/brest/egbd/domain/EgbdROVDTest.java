package com.brest.egbd.domain;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EgbdROVDTest {
    private static final Logger LOGGER = LogManager.getLogger();

    EgbdROVD egbdROVD;

    @Before
    public void setUp() throws Exception{
        egbdROVD = new EgbdROVD();
    }

    @Test
    public void testGetRovdId() {
        Long id = (long)(Math.random()*10);
        LOGGER.debug("testGetRovdId({})", id);
        egbdROVD.setRovdId(id);

        assertEquals(id, egbdROVD.getRovdId());
    }

    @Test
    public void testGetRovdName() {
        String name = "Ленинский РОВД г.Бреста";
        LOGGER.debug("testGetRovdName({})", name);
        egbdROVD.setRovdName(name);

        assertEquals("object EgbdROVD - test method getRovdName","Ленинский РОВД г.Бреста",
                egbdROVD.getRovdName());
    }

    @Test
    public void testToString() {
        LOGGER.debug("testToString({})", egbdROVD);

        assertEquals("EgbdROVD{rovdId=null, rovdName='null'}", egbdROVD.toString());
    }
}