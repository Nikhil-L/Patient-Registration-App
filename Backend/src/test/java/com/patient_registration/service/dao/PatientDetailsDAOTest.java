package com.patient_registration.service.dao;

import com.patient_registration.model.PatientDetails;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java.sql.Date;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * This class is used to test the working ofn RegisterAPiServiceImpl and PatientDetailsDAO implementation.
 */
@RunWith(MockitoJUnitRunner.class)
public class PatientDetailsDAOTest {

    @Mock
    PatientDetailsDAO mock;

    private PatientDetails details;

    /**
     * To setup the values and connection before testing
     */
    @Before
    public void setUp()
    {
        mock = org.mockito.Mockito.mock(PatientDetailsDAO.class);

        details = new PatientDetails();
        details.setFirstName("Johannes");
        details.setLastName("Smythe");
        details.setGender("Male");
        String regDate = "2021-05-06";
        details.setRegistrationDate(Date.valueOf(regDate));
        String dob = "2000-02-02";
        details.setDateOfBirth(Date.valueOf(dob));

        when(mock.insetToDb(details)).thenReturn("Success");
    }

    /**
     * This is used to test the insertToDb method of the PatientDetailsDAO class
     */
    @Test
    public void insertToDbTest()
    {
        assertEquals("Success", mock.insetToDb(details));
    }

}