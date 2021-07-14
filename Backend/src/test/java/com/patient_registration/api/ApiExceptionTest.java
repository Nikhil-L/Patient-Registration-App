package com.patient_registration.api;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

/**
 * @author NL089834
 * Test case for ApiException class.
 */
@RunWith(MockitoJUnitRunner.class)
public class ApiExceptionTest {

    /**
     * Test case for NotFoundException method.
     */
    @Test
    public void testNotFoundException() {
        NotFoundException notFoundException = new NotFoundException(1, "done");
        assertNotNull(notFoundException);
    }
}
