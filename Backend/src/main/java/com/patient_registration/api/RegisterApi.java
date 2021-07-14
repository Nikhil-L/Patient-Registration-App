package com.patient_registration.api;

import com.patient_registration.api.factories.RegisterApiServiceFactory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import com.patient_registration.model.PatientDetails;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * It is an entry point to call the API to register a patient.
 */
@Path("/register")

/**
 * This method is used to register patient details.
 * @param securityContext {@link SecurityContext} This the security context set.
 * @return string quoting the status of the operation.
 * @throws NotFoundException throws NotFoundException when the PatientDetailsDAO class is not found.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class RegisterApi  {

    /**
     *
     * @param body takes the body sent from post request
     * @param securityContext
     * @return response object quoting the status of the api
     * @throws NotFoundException
     */
    @POST
    
    @Consumes({ "application/json" })
    
    @Operation(summary = "", description = "This methods sends the patient registration details to the server.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error") })
    public Response registerPost(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) PatientDetails body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        RegisterApiService delegate = RegisterApiServiceFactory.getRegisterApi();
        return delegate.registerPost(body,securityContext);
    }
}
