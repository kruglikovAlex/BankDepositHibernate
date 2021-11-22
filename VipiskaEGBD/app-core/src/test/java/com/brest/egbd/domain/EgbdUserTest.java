package com.brest.egbd.domain;

import jakarta.validation.ConstraintViolation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
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
    public void testEgbdUserIdIsNull(){
        //test null egbdUserId = null
        egbdUser.setEgbdUserFIO("Ivanov Ivan Ivanovich");
        egbdUser.setEgbdUserLogin("IIIvanov");
        egbdUser.setEgbdUserPassword("III");
        egbdUser.setEgbdUserPhoneNumber("+375(29)822-60-11");
        LOGGER.debug("testEgbdUserIdIsNull({})", egbdUser);
        Set<ConstraintViolation<EgbdUser>> violationSet = validator.validate(egbdUser);

        assertEquals( 2, violationSet.size() );
        assertEquals("должно быть не меньше 3",
                violationSet.iterator().next().getMessage()
        );
        assertFalse(violationSet.isEmpty());
    }

    @Test
    public void testGetEgbdUserId() throws Exception{
        Long id = (long)(Math.random()*10);
        LOGGER.debug("testGetEgbdUserId({})", id);
        egbdUser.setEgbdUserId(id);

        assertEquals("test EgbUser's method getEgbdUserId", id, egbdUser.getEgbdUserId());
    }

    @Test
    public void testGetEgbdUserLogin() throws Exception{
        String login = "KMV";
        LOGGER.debug("testGetEgbdUserLogin({})", login);
        egbdUser.setEgbdUserLogin(login);

        assertEquals("test EgbdUser's method getEgbdUserLogin", login, egbdUser.getEgbdUserLogin());
    }

    @Test
    public void getEgbdUserPassword() {
    }

    @Test
    public void getEgbdUserFIO() {
    }

    @Test
    public void getEgbdUserPhoneNumber() {
    }

    @Test
    public void testToString() {
    }
}