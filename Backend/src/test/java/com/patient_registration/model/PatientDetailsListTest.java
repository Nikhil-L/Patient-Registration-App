package com.patient_registration.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;


/**
 * @author NL089834
 * Test case for PatientDetailsList
 */
public class PatientDetailsListTest {

    PatientDetailsList patientDetails;


    /**
     * This method is used to initialize all the values and objects
     */
    @Before
    public void setUp()
    {
        patientDetails= new PatientDetailsList();

    }

    /**
     * This method is used to test the Equals method
     */
    @Test
    public void testEquals()
    {
        Object o = null;
        assertEquals(false, patientDetails.equals(o));
        assertEquals(true, patientDetails.equals(patientDetails));
        PatientDetailsList pd = new PatientDetailsList();
        assertEquals(true, patientDetails.equals(pd));
    }

    /**
     * This is used to test the HashCode method
     */
    @Test
    public void testHashCode()
    {
        assertNotEquals(1245332, patientDetails.hashCode());
    }


    /**
     * This is used to test the toString method
     */
    @Test
    public void testToString()
    {
        assertNotEquals("", patientDetails.toString());
    }

}
