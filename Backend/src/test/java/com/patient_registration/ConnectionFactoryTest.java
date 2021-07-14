package com.patient_registration;


import lombok.ToString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * This is used to test the ConnectionFactory class
 */
@ToString
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ConnectionFactory.class,
        DriverManager.class
})
public class ConnectionFactoryTest {
    @Mock
    private ConnectionFactory connectionFactory;
    @Mock
    private Connection connection;
    @Mock
    private DriverManager driverManager;
    @Mock
    private ConnectionFactory mock;

    /**
     * This is used to test the Connection method
     * @throws SQLException
     */
    @Test
    public void testConnection() throws SQLException {
        PowerMockito.mockStatic(DriverManager.class);
        when(DriverManager.getConnection(any(String.class),any(String.class),any(String.class))).thenReturn(connection);
        Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
    }

    /**
     * This is used to test the catch block
     * @throws SQLException
     */
    @Test(expected = RuntimeException.class)
    public void testCatchStatement() throws SQLException{
        PowerMockito.mockStatic(DriverManager.class);
        when(DriverManager.getConnection(any(String.class),any(String.class),any(String.class))).thenThrow(new SQLException());
        Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
    }

}