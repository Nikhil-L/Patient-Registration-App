package com.patient_registration.api;

import static org.junit.Assert.assertEquals;
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

/**
 * @author NL089834
 * Test case for {@link LoginApi}
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginApiTest {

    private @Mock SecurityContext securityContext;

    private @Mock ServletConfig servletContext;

    /**
     * Test to check whether the response of loginPost is returned successfully.
     * @throws NotFoundException if patientId not found.
     */
    @Test
    public void testLoginPost() throws com.patient_registration.api.NotFoundException, IOException {
        UserCredentials body = new UserCredentials();
        body.setUsername("Arun_kumar");
        body.setPassword("Ark@234");
        Response response = new LoginApi().loginPost(body, securityContext);
        System.out.println(response);
        assertEquals(200, response.getStatus());

    }
}
