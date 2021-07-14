package com.patient_registration.api.impl;

import com.patient_registration.api.*;
import com.patient_registration.model.PatientDetails;
import com.patient_registration.service.dao.PatientDetailsDAO;
import com.patient_registration.service.dao.PatientDetailsListDAO;
import io.swagger.model.*;

import com.patient_registration.model.PatientDetailsList;

import java.sql.ResultSet;
import java.util.Map;
import java.util.List;
import com.patient_registration.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

/**
 * It is an API service class to display the list of patients details.
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
        date = "2021-06-13T13:28:49.771Z[GMT]")
public class DetailsApiServiceImpl extends DetailsApiService {
    @Override
    public Response detailsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        PatientDetailsListDAO pdao= new PatientDetailsListDAO();
        return Response.ok().entity(pdao.getPatients()).build();
    }
}
