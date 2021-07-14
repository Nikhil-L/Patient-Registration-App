package com.patient_registration.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author NL089834
 * Test case for UserCredentials
 */
public class UserCredentialsTest {

    UserCredentials credentials;

    /**
     * This is used to initialize the object with values
     */
    @Before
    public void setUp()
    {
        credentials = new UserCredentials();
        credentials.setUsername("Arun_kumar");
        credentials.setPassword("Ark@234");
    }

    /**
     * This is used to test the hashcode method
     */
    @Test
    public void testHashcode()
    {
        assertNotEquals(124543, credentials.hashCode());
    }

    /**
     * This is used to test the toString method
     */
    @Test
    public void testToString()
    {
        assertNotEquals("", credentials.toString());
        credentials.password(null);
        assertNotEquals("", credentials.toString());
    }

    /**
     * This is used to test the equals method
     */
    @Test
    public void testEquals()
    {
        UserCredentials user = new UserCredentials();
        user.username(credentials.getUsername());
        user.password(credentials.getPassword());
        Object o = null;
        assertEquals(true, user.equals(credentials));
        assertEquals(false, credentials.equals(o));
        assertEquals(true, user.equals(user));
    }

}
