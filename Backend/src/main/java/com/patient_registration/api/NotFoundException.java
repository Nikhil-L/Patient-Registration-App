package com.patient_registration.api;

/**
 * The NotFoundException Class handles the exception generation while returning the api.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class NotFoundException extends ApiException {
    private int code;

    /**
     * Sets the code , message generated from the api response.
     * @param code this is the response code generated from the Api Response Message.
     * @param msg this is the message returned on entering a code.
     */
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
