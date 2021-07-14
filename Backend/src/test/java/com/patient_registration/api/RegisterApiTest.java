package com.patient_registration.api;

import static org.junit.Assert.assertEquals;
import com.patient_registration.model.PatientDetails;
import com.patient_registration.model.UserCredentials;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import javax.servlet.ServletConfig;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.io.IOException;
import java.sql.Date;

/**
 * @author NL089834
 * Test case for {@link RegisterApi}
 */
@RunWith(MockitoJUnitRunner.class)
public class RegisterApiTest {

    private @Mock SecurityContext securityContext;

    private @Mock ServletConfig servletContext;

    /**
     * Test to check whether the response of  is returned successfully.
     * @throws NotFoundException if patientId not found.
     */
    @Test
    public void testRegisterPost() throws com.patient_registration.api.NotFoundException, IOException {
        PatientDetails body = new PatientDetails();
        body.setFirstName("Arun");
        body.setLastName("Kumar");
        body.setGender("Male");
        body.setRegistrationDate(Date.valueOf("2021-05-03"));
        body.setDateOfBirth(Date.valueOf("1998-03-07"));
        Response response = new RegisterApi().registerPost(body, securityContext);
        System.out.println(response);
        assertEquals(200, response.getStatus());

    }
}
