package com.patient_registration.api;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * @author NL089834
 * Test cases for ApiResponseMessageTest class.
 */
public class ApiResponseMessageTest {

    ApiResponseMessage apiResponseMessage = new ApiResponseMessage();

    /**
     * Test case for getCode method.
     */
    @Test
    public void testGetCode() {
        apiResponseMessage.setCode(1);
        assertEquals(1, apiResponseMessage.getCode());
    }

    /**
     * Test case for setCode method.
     */
    @Test
    public void testSetCode() {
        apiResponseMessage.setCode(1);
        assertNotNull(apiResponseMessage.getCode());
    }

    /**
     * Test case for getType method.
     */
    @Test
    public void testGetType() {
        apiResponseMessage.setType("error");
        assertEquals("error", apiResponseMessage.getType());
    }

    /**
     * Test case for setType method.
     */
    @Test
    public void testSetType() {
        apiResponseMessage.setType("error");
        assertNotNull(apiResponseMessage.getType());
    }

    /**
     * Test case for getMessage method.
     */
    @Test
    public void testGetMessage() {
        apiResponseMessage.setMessage("Unavailable");
        assertEquals("Unavailable", apiResponseMessage.getMessage());
    }

    /**
     * Test case for setMessage method.
     */
    @Test
    public void testSetMessage() {
        apiResponseMessage.setMessage("Unavailable");
        assertNotNull(apiResponseMessage.getMessage());
    }

    /**
     *  Test case for switch statement case ERROR.
     */
    @Test
    public void testSwitchStatementCaseError() {
        apiResponseMessage.setType("ERROR");
        assertEquals("ERROR",(String) new ApiResponseMessage(1,"ERROR").message);
    }

    /**
     *  Test case for switch statement case WARNING.
     */
    @Test
    public void testSwitchStatementCaseWarning() {
        apiResponseMessage.setType("WARNING");
        assertEquals("WARNING",(String) new ApiResponseMessage(2,"WARNING").message);
    }

    /**
     *  Test case for switch statement case INFO.
     */
    @Test
    public void testSwitchStatementCaseInfo() {
        apiResponseMessage.setType("INFO");
        assertEquals("INFO",(String) new ApiResponseMessage(3,"INFO").message);
    }

    /**
     *  Test case for switch statement case OK.
     */
    @Test
    public void testSwitchStatementCaseOk() {
        apiResponseMessage.setType("INFO");
        assertEquals("OK",(String) new ApiResponseMessage(4,"OK").message);
    }

    /**
     *  Test case for switch statement case TOO_BUSY.
     */
    @Test
    public void testSwitchStatementCaseTooBusy() {
        apiResponseMessage.setType("TOO_BUSY");
        assertEquals("TOO_BUSY",(String) new ApiResponseMessage(5,"TOO_BUSY").message);
    }

    /**
     *  Test case for switch statement case Default.
     */
    @Test
    public void testSwitchStatementCaseDefault() {
        apiResponseMessage.setType("unknown");
        assertEquals("unknown",(String) new ApiResponseMessage(6,"unknown").message);
    }
}
