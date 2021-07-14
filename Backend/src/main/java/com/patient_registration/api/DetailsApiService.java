package com.patient_registration.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * This is an abstract class where the methods of class DetailsApi is defined.
 * This abstract class helps to get the list of patient details from the database.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public abstract class DetailsApiService {

    /**
     * This is the abstract method to get the list of patient details
     * @param securityContext takes SecurityContext as parameter
     * @return a list of PatientDetials
     * @throws NotFoundException when impl class not found
     */
    public abstract Response detailsGet(SecurityContext securityContext) throws NotFoundException;
}
