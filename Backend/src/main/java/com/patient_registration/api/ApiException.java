package com.patient_registration.api;

/**
 * This class handles exception.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class ApiException extends Exception{
    private int code;

    /**
     * ApiException method sets the message based on generated code.
     * @param code This is the response code generated from the Api Response Message.
     * @param message  This is the message returned on entering a code.
     */
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
