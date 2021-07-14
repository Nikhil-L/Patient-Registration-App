package com.patient_registration.api;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import com.patient_registration.model.UserCredentials;
import java.util.Map;
import java.util.List;
import com.patient_registration.api.NotFoundException;
import java.io.InputStream;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


/**
 * This is an abstract class where the methods of class LoginApi is defined.
 * This abstract class helps to check for the authenticity of the user.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public abstract class LoginApiService {

    /**
     *
     * @param body takes the input body with login credentials
     * @param securityContext
     * @return a boolean value stating the authenticity of the user
     * @throws NotFoundException when the implementation class is not found
     */
    public abstract Response loginPost(UserCredentials body,SecurityContext securityContext) throws NotFoundException;
}
