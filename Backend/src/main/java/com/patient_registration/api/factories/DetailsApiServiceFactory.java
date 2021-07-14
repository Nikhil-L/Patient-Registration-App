package com.patient_registration.api.factories;

import com.patient_registration.api.DetailsApiService;
import com.patient_registration.api.impl.DetailsApiServiceImpl;

/**
 * This is the factory class to create a instance of DetailsApiServiceImpl
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class DetailsApiServiceFactory {
    private final static DetailsApiService service = new DetailsApiServiceImpl();

    /**
     *
     * @return
     */
    public static DetailsApiService getDetailsApi() {
        return service;
    }
}
