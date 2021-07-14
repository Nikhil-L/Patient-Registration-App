/*
 * Patient Registration App
 * This server contains services like authentication of user, getting patient details and also storing patient details.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.patient_registration.model;

import java.util.Objects;
import  com.patient_registration.model.PatientDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;

/**
 * Contains array of patient registration details.
 */
@Schema(description = "Contains array of patient registration details.")
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class PatientDetailsList extends ArrayList<PatientDetails>  {

  /**
   * It compares two objects and returns true if the contents are equal else false
   * @param Object
   * @return a boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  /**
   * It returns a integer hash value of the object
   * @return integer
   */
  @Override
  public int hashCode() {
    return Objects.hash();
  }


  /**
   * This method returns the value in string format
   * @return String
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientDetailsList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}