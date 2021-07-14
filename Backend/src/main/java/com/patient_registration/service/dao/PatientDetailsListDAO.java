package com.patient_registration.service.dao;

import com.patient_registration.model.PatientDetails;
import com.patient_registration.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class used to get the list of patient details from the database.
 */
public class PatientDetailsListDAO {

    /**
     * This method is used to store patient details to the database
     * @return List of PatientDetails
     * @throws SQLException throws SQLException when the operation raises and exception
     */
    public List<PatientDetails> getPatients(){
        PatientDetails patientDetails=null;
        List<PatientDetails> patientDetailsList=new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        String query = "Select * from patient_registration_app.patient_details order by details_id desc;";
        try{
            PreparedStatement pStmt = connection.prepareStatement(query);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                patientDetails=new PatientDetails();
                patientDetails.setFirstName(rs.getString("first_name"));
                patientDetails.setLastName(rs.getString("last_name"));
                patientDetails.gender(rs.getString("gender"));
                patientDetails.setRegistrationDate(rs.getDate("registration_date"));
                patientDetails.setDateOfBirth(rs.getDate("date_of_birth"));
                patientDetailsList.add(patientDetails);

            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return patientDetailsList;
    }
}
