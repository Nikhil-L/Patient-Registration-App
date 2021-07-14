package com.patient_registration.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;
import java.sql.Date;


/**
 * @author NL089834
 * Test case for PatientDetails
 */
public class PatientDetailsTest {

    PatientDetails details = new PatientDetails();

    @Before
    public void setUp()
    {
        details.setFirstName("Arun");
        details.setLastName("Kumar");
        details.setGender("Male");
        details.setRegistrationDate(Date.valueOf("2021-06-03"));
        details.setDateOfBirth(Date.valueOf("1998-06-07"));
    }

    /**
     * This is used to test the Equals method
     */
    @Test
    public void testPatientDetailsEquals()
    {
        PatientDetails d = new PatientDetails();
        d.setFirstName(details.getFirstName());
        d.setLastName(details.getLastName());
        d.setGender(details.getGender());
        d.setRegistrationDate(details.getRegistrationDate());
        d.setDateOfBirth(Date.valueOf("1999-06-03"));
        assertEquals(false, details.equals(0));
        assertEquals(true, details.equals(details));
        assertEquals(false, details.equals(d));

    }

    /**
     * This is used to test the toString method
     */
    @Test
    public void testToString() {
        String str = "class PatientDetails {\n" +
                "    firstName: Arun\n" +
                "    lastName: Kumar\n" +
                "    gender: Male\n" +
                "    registrationDate: 2021-06-03\n" +
                "    dateOfBirth: 1998-06-07\n" +
                "}";
        assertEquals(str, details.toString());
        PatientDetails o = new PatientDetails();
        assertNotEquals(null, o.toString());
    }

    /**
     * This is used to test the hashcode method
     */
    @Test
    public void testHashCode()
    {
        assertNotEquals(12345, details.hashCode());
    }

    /**
     * This is used to test the getter and setters
     */
    @Test
    public void testGetters()
    {
        PatientDetails detail = new PatientDetails();
        detail.firstName("Arvind");
        detail.lastName("Kumar");
        detail.gender("Male");
        detail.registrationDate(details.getRegistrationDate());
        detail.dateOfBirth(details.getDateOfBirth());

        assertEquals(false, detail.equals(details));
    }
}
