package com.patient_registration.api;

import com.patient_registration.api.factories.DetailsApiServiceFactory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import com.patient_registration.model.PatientDetailsList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * It is an entry point to call the API to display all the patient details.
 */
@Path("/details")


@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class DetailsApi  {

    @GET

    /**
     * This method is used to get the response of DetailsApi for fetch opertion
     * @param securityContext {@link SecurityContext} This the security context set.
     * @return The response object quoting the status of the api operation.
     * @throws NotFoundException throws NotFoundException when the PatientDetailsListDAO class is not found.
     */
    @Produces({ "application/json" })
    @Operation(summary = "", description = "To obtain list of patient registration details from database.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Gets a list of patient registration details.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PatientDetailsList.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error - Fault at server end") })
    public Response detailsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        DetailsApiService delegate = DetailsApiServiceFactory.getDetailsApi();
        return delegate.detailsGet(securityContext);
    }
}
