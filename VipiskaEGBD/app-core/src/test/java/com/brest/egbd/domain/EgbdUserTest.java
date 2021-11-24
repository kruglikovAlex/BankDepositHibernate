package com.brest.egbd.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EgbdUserTest {
    private static final Logger LOGGER = LogManager.getLogger();
    private static Validator validator  ;

    EgbdUser egbdUser;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Before
    public void getUp(){
        egbdUser = new EgbdUser();
    }

    @Test
    public void testGetEgbdUserId() throws Exception{
        Long id = (long)(Math.random()*10);
        LOGGER.debug("testGetEgbdUserId({})", id);
        egbdUser.setEgbdUserId(id);

        assertEquals("test EgbUser's method getEgbdUserId", id, egbdUser.getEgbdUserId());
        assertTrue(egbdUser.getEgbdUserId().longValue() == id);
    }

    @Test
    public void testEgbdUserIdIsNull() throws Exception{
        //test null egbdUserId = null
        egbdUser = new EgbdUser(null, "IIIvanov", "III", "Ivanov Ivan Ivanovich", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserIdIsNull({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("не должно равняться null",
                violationSet.iterator().next().getMessage());

        //assertFalse(violationSet.isEmpty());
    }

    @Test
    public void testGetEgbdUserLogin() throws Exception{
        String login = "KMV";
        LOGGER.debug("testGetEgbdUserLogin({})", login);
        egbdUser.setEgbdUserLogin(login);

        assertEquals("test EgbdUser's method getEgbdUserLogin", login, egbdUser.getEgbdUserLogin());
    }

    @Test
    public void testEgbdUserLoginIsNull() throws Exception{
        egbdUser = new EgbdUser(1L, null, "III", "Ivanov Ivan Ivanovich", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserLoginIsNull({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("не должно равняться null",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testEgbdUserLoginOutOfRange() throws Exception{
        egbdUser = new EgbdUser(1L, "I", "III", "Ivanov Ivan Ivanovich", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserLoginOutOfRange({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("размер должен находиться в диапазоне от 2 до 14",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testGetEgbdUserPassword() throws Exception{
        String password = "123QWEasd";
        LOGGER.debug("testGetEgbdUserPassword({})", password);
        egbdUser.setEgbdUserPassword(password);

        assertEquals(password, egbdUser.getEgbdUserPassword());
    }

    @Test
    public void testEgbdUserPasswordIsNull() throws Exception{
        //test null egbdUserId = null
        egbdUser = new EgbdUser(1L, "IIvanov", null, "Ivanov Ivan Ivanovich", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserPasswordIsNull({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("не должно равняться null",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testEgbdUserPasswordOutOfRange() throws Exception{
        egbdUser = new EgbdUser(1L, "IIvanov", "II", "Ivanov Ivan Ivanovich", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserPasswordOutOfRange({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("размер должен находиться в диапазоне от 3 до 14",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testGetEgbdUserFIO() throws Exception{
        String fio = "Test";
        LOGGER.debug("testGetEgbdUserFIO({})", fio);
        egbdUser.setEgbdUserFIO(fio);

        assertEquals(fio, egbdUser.getEgbdUserFIO());
        assertTrue(egbdUser.getEgbdUserFIO().compareTo(fio) == 0);
    }

    @Test
    public void testEgbdUserFIOIsNull() throws Exception{
        egbdUser = new EgbdUser(1L, "IIvanov", "III", null, "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserFIOIsNull({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("не должно равняться null",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testEgbdUserFIOOutOfRange() throws Exception{
        egbdUser = new EgbdUser(1L, "IIvanov", "III", "Iv", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserFIOOutOfRange({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("размер должен находиться в диапазоне от 3 до 25",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testGetEgbdUserPhoneNumber() throws Exception{
        String phoneNumber = "+375(29)8226011";
        LOGGER.debug("testGetEgbdUserPhoneNumber({})",phoneNumber);
        egbdUser.setEgbdUserPhoneNumber(phoneNumber);

        assertEquals(phoneNumber, egbdUser.getEgbdUserPhoneNumber());
    }

    @Test
    public void testEgbdUserPhoneNumberIsEmpty() throws Exception{
        egbdUser = new EgbdUser(1L, "IIvanov", "III", "Ivanov", "");

        LOGGER.debug("testEgbdUserPhoneNumberIsEmpty({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("не должно быть пустым",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testEgbdUserPhoneNumberIsNull() throws Exception{
        egbdUser = new EgbdUser(1L, "IIvanov", "III", "Ivanov", null);

        LOGGER.debug("testEgbdUserPhoneNumberIsNull({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 1, violationSet.size() );
        assertEquals("не должно быть пустым",
                violationSet.iterator().next().getMessage());
    }

    @Test
    public void testEgbdUserIsValid() {
        egbdUser = new EgbdUser(1L, "IIIvanov", "IIII", "Ivanov Ivan Ivanovich", "+375(29)822-60-11");

        LOGGER.debug("testEgbdUserIsValid({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet =
                validator.validate(egbdUser);

        assertEquals( 0, violationSet.size() );
    }

    @Test
    public void testToString() {
        LOGGER.debug("testToString({})",egbdUser);

        assertEquals("EgbdUser{egbdUserId='null', egbdUserLogin='null', egbdUserPassword='null', " +
                "egbdUserFIO='null', egbdUserPhoneNumber='null'}", egbdUser.toString());
    }
}