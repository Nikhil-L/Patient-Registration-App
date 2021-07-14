package com.patient_registration.api.impl;

import com.patient_registration.api.*;
import com.patient_registration.model.*;
import com.patient_registration.model.PatientDetails;
import java.util.Map;
import java.util.List;
import com.patient_registration.api.NotFoundException;
import java.io.InputStream;
import com.patient_registration.service.dao.PatientDetailsDAO;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;


/**
 * It is an API service class to register patient details.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class RegisterApiServiceImpl extends RegisterApiService {
    @Override
    public Response registerPost(PatientDetails body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        PatientDetailsDAO dao = new PatientDetailsDAO();
        return Response.ok().entity(dao.insetToDb(body)).build();
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
