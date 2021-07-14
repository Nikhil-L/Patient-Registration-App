package com.patient_registration.service.dao;

import com.patient_registration.model.UserCredentials;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * This class is used to test the working of LoginApiServiceImpl and UserCredentialsDAO implementation.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserCredentialsDAOTest {

    @Mock
    UserCredentialsDAO mock;

    private UserCredentials user1;

    private UserCredentials user2;

    /**
     * To setup the values and connection before testing
     */
    @Before
    public void setUp(){
        mock = org.mockito.Mockito.mock(UserCredentialsDAO.class);

        user1 = new UserCredentials();
        user1.setUsername("Arun_kumar");
        user1.setPassword("Ark@234");

        user2 = new UserCredentials();
        user2.setUsername("Nikhil");
        user2.setPassword("Hello@123");

        when(mock.validate(user1)).thenReturn(true);
        when(mock.validate(user2)).thenReturn(false);
    }

    /**
     * This is used to test the validate method of UserCredentialsDAO class
     */
    @Test
    public void validateTest() {
        assertEquals(true, mock.validate(user1));
        assertEquals(false, mock.validate(user2));
    }



}
