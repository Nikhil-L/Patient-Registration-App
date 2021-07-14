package com.patient_registration.api;

import javax.xml.bind.annotation.XmlTransient;

/**
 * The ApiResponseMessage class is used to define the code, message and type of the response.
 */
@javax.xml.bind.annotation.XmlRootElement
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class ApiResponseMessage {
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int INFO = 3;
    public static final int OK = 4;
    public static final int TOO_BUSY = 5;

    int code;
    String type;
    String message;

    /**
     *  The various response message is defined using switch statement.
     */
    public ApiResponseMessage(){}

    /**
     * This constructor sets the code and message.
     * @param code this is the response code generated from the Api Response Message.
     * @param message this is the message returned on entering a code.
     */
    public ApiResponseMessage(int code, String message){
        this.code = code;
        switch(code){
        case ERROR:
            setType("error");
            break;
        case WARNING:
            setType("warning");
            break;
        case INFO:
            setType("info");
            break;
        case OK:
            setType("ok");
            break;
        case TOO_BUSY:
            setType("too busy");
            break;
        default:
            setType("unknown");
            break;
        }
        this.message = message;
    }

    /**
     * Returns the code of the response.
     * @return code. The code of the response is returned.
     */
    @XmlTransient
    public int getCode() {
        return code;
    }

    /**
     * Sets the code of the response.
     * @param code the code to be set.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Returns the type of the response.
     * @return type The type of the message is returned.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the response.
     * @param type the type to be set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the message of the response.
     * @return message Returns the message of the response.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message of the response.
     * @param message the message to be set.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
