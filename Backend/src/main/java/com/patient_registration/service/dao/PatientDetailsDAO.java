package com.patient_registration.service.dao;

import com.patient_registration.api.NotFoundException;
import com.patient_registration.model.PatientDetails;
import com.patient_registration.ConnectionFactory;
import io.swagger.transform.migrate.ApiArrayMigrator;
import javax.ws.rs.core.SecurityContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This class used to store the patient details to the database
 */
public class PatientDetailsDAO {

    /**
     * This method is used to store patient details to the database
     * @param body which is obtained from the api post request
     * @return string quoting the status of the operation.
     * @throws SQLException throws SQLException when the operation raises and exception
     */
    public String insetToDb(PatientDetails body)
    {
        Connection connection = ConnectionFactory.getConnection();
        String query = "INSERT INTO `patient_registration_app`.`patient_details` " +
                "(`first_name`, `last_name`, `gender`, `registration_date`, `date_of_birth`) " +
                "VALUES (?,?,?,?,?);";
        PreparedStatement pStmt = null;
        try{
            pStmt = connection.prepareStatement(query);
            pStmt.setString(1, body.getFirstName());
            pStmt.setString(2, body.getLastName());
            pStmt.setString(3, body.getGender());
            pStmt.setDate(4, body.getRegistrationDate());
            pStmt.setDate(5, body.getDateOfBirth());
            pStmt.executeUpdate();
            return "Success";
        }
        catch(SQLException e){
            e.printStackTrace();
            return "Failure";
        }
    }


}
