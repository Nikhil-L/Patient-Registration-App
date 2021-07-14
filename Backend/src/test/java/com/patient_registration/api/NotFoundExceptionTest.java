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
@RunWith(MockitoJUnitRunner.class)
public class NotFoundExceptionTest {

    /**
     * Test case for NotFoundException method.
     */
    @Test
    public void testNotFoundException() {
        NotFoundException notFoundException = new NotFoundException(1, "done");
        assertNotNull(notFoundException);
    }
}
