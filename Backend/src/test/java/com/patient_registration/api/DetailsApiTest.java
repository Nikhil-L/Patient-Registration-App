package com.patient_registration.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.io.IOException;

/**
 * @author NL089834
 * Test case for {@link DetailsApi}
 */
@RunWith(MockitoJUnitRunner.class)
public class DetailsApiTest {

    private @Mock SecurityContext securityContext;


    /**
     * Test to check whether the response of detailsGet is returned successfully.
     * @throws NotFoundException if patientId not found.
     */
    @Test
    public void testDetailsGet() throws com.patient_registration.api.NotFoundException, IOException {
        Response response = new DetailsApi().detailsGet(securityContext);
        assertEquals(200, response.getStatus());

    }
}
