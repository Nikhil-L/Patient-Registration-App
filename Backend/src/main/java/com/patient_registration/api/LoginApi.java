package com.patient_registration.api;

import com.patient_registration.api.factories.LoginApiServiceFactory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import com.patient_registration.model.UserCredentials;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;



/**
 * It is an entry point to call the API to verify login credentials.
 */
@Path("/login")

/**
 * This method is used to verify login credentials
 * @param securityContext {@link SecurityContext} This the security context set.
 * @return a boolean value.
 * @throws NotFoundException throws NotFoundException when the UserCredentialsDAO class is not found.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class LoginApi  {

    /**
     *
     * @param body takes the input body
     * @param securityContext {@link SecurityContext}
     * @return api response object quoting the status of the api
     * @throws NotFoundException if implementation class is not found.
     */
    @POST
    
    @Consumes({ "application/json" })
    
    @Operation(summary = "", description = "This method sends the user login details to verfiy the authenticity of the user.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully Verification"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error") })
    public Response loginPost(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) UserCredentials body,
                              @Context SecurityContext securityContext)
    throws NotFoundException {
        LoginApiService delegate = LoginApiServiceFactory.getLoginApi();
        return delegate.loginPost(body,securityContext);
    }
}
