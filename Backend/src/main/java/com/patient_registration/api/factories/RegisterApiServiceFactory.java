package com.patient_registration.api.factories;

import com.patient_registration.api.RegisterApiService;
import com.patient_registration.api.impl.RegisterApiServiceImpl;

/**
 * This is the factory class to create a instance of RegisterApiServiceImpl
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class RegisterApiServiceFactory {
    private final static RegisterApiService service = new RegisterApiServiceImpl();

    public static RegisterApiService getRegisterApi() {
        return service;
    }
}
