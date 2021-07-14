package com.patient_registration.api;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

/**
 * This is used to test JacksonJsonProvider class
 */
public class JacksonJsonProviderTest {

    /**
     * This to test the JacksonJsonProvider constructor
     */
    @Test
    public void testJacksonJsonProvider()
    {
        JacksonJsonProvider json = new JacksonJsonProvider();
        assertNotNull(json);
    }
}