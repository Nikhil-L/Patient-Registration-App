package com.patient_registration.api.factories;

import com.patient_registration.api.LoginApiService;
import com.patient_registration.api.impl.LoginApiServiceImpl;

/**
 * This is the factory class to create a instance of LoginApiServiceImpl
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class LoginApiServiceFactory {
    private final static LoginApiService service = new LoginApiServiceImpl();

    public static LoginApiService getLoginApi() {
        return service;
    }
}
