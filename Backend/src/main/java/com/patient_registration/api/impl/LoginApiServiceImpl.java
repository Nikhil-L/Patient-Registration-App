package com.patient_registration.api.impl;

import com.patient_registration.api.*;
import com.patient_registration.service.dao.UserCredentialsDAO;
import io.swagger.model.*;
import com.patient_registration.model.UserCredentials;
import java.util.Map;
import java.util.List;
import com.patient_registration.api.NotFoundException;
import java.io.InputStream;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

/**
 * It is an API service class to verify the authenticity of the user
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class LoginApiServiceImpl extends LoginApiService {
    @Override
    public Response loginPost(UserCredentials body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        UserCredentialsDAO dao = new UserCredentialsDAO();
        return Response.ok().entity(dao.validate(body)).build();
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
