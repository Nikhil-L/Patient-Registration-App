package com.patient_registration.service.dao;

import com.patient_registration.model.PatientDetails;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * This class is used to test the working of DetailsApiServiceImpl and PatientDetailsListDAO implementation.
 */
@RunWith(MockitoJUnitRunner.class)
public class PatientDetailsListDAOTest {

    @Mock
    private PatientDetailsListDAO mock;

    private List<PatientDetails> patientDetails;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet resultSet;

    private PatientDetails details;

    /**
     * To setup the values and connection before testing
     */
    @Before
    public void setUp() throws Exception {
        details = new PatientDetails();
        details.setFirstName("Johannes");
        details.setLastName("Smythe");
        details.setGender("Male");
        String regDate = "2021-05-06";
        details.setRegistrationDate(Date.valueOf(regDate));
        String dob = "2000-02-02";
        details.setDateOfBirth(Date.valueOf(dob));
        patientDetails = new ArrayList<>();
        patientDetails.add(details);
        mock = org.mockito.Mockito.mock(PatientDetailsListDAO.class);
        when(mock.getPatients()).thenReturn(patientDetails);
        when(resultSet.first()).thenReturn(true);
        when(resultSet.getString(1)).thenReturn(details.getFirstName());
        when(resultSet.getString(2)).thenReturn(details.getLastName());
        when(resultSet.getString(3)).thenReturn(details.getGender());
        when(resultSet.getDate(4)).thenReturn(details.getRegistrationDate());
        when(resultSet.getDate(5)).thenReturn(details.getDateOfBirth());
        when(stmt.executeQuery()).thenReturn(resultSet);
    }

    /**
     * This is used to test the getPatients details of the PatientDetailsDAO class
     */
    @Test
    public void getPatientsTest()
    {
        List <PatientDetails> result = mock.getPatients();
        assertEquals(patientDetails, result);
    }

}
