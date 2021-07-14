package com.patient_registration.service.dao;

import com.patient_registration.model.UserCredentials;
import com.patient_registration.ConnectionFactory;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class used to validate the authenticity of the user.
 */
public class UserCredentialsDAO {

    private static ResultSet result;
    public UserCredentialsDAO(){
        Connection connection = ConnectionFactory.getConnection();
        String query = "Select * from patient_registration_app.login_credentials";
        try{
            PreparedStatement pStmt = connection.prepareStatement(query);
            result = pStmt.executeQuery();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * This method is used to validate the authenticity of the user.
     * @param body which is obtained from the api post request
     * @return a boolean value quoting the authenticity of the user.
     * @throws SQLException throws SQLException when the operation raises and exception
     */
    public boolean validate(UserCredentials body) {
        String username = body.getUsername();
        String password = body.getPassword();

       try{
           while(result.next())
           {
                if(username.equals(result.getString("username")))
                {
                    if(password.equals(result.getString("password")))
                    {
                        return true;
                    }
                }
           }
           result.first();
       }
       catch(SQLException e){
           e.printStackTrace();
       }

       return false;
    }


}
