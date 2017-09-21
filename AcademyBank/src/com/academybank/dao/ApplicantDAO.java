package com.academybank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.academybank.Applicant;

/**
 *
 * @author Administrator
 */
public class ApplicantDAO {
    
    private DataSource dataSource;
    
    public void setdataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void insert(Applicant applications) {

		String sql = "INSERT INTO Applicant "
				+ "( applfirstname, applmidname,  "
				+ "appllastname,  appaddrline1,"
				+ "appaddrline2,  city,state, zipCode)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, applications.getApplfirstname());
			ps.setString(2, applications.getApplmidname());
			ps.setString(3, applications.getAppllastname());
			ps.setString(4, applications.getAppaddrline1());
			ps.setString(5, applications.getAppaddrline2());
			ps.setString(6, applications.getCity());
			ps.setString(7, applications.getState());
			ps.setString(8, applications.getZipcode());
			ps.executeUpdate();
			ps.close();
			System.out.println("Adding Applicants Data - ApplicantDAO-insert - Successful");

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

    
}
