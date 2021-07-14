package com.patient_registration.api;

import com.patient_registration.model.PatientDetails;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * This is an abstract class where the methods of class RegisterApi is defined.
 * This abstract class is used to register patient details to the database.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public abstract class RegisterApiService {

    /**
     *
     * @param body takes the body sent from post request
     * @param securityContext
     * @return a string quoting the status of the register operation
     * @throws NotFoundException
     */
    public abstract Response registerPost(PatientDetails body,SecurityContext securityContext) throws NotFoundException;
}
