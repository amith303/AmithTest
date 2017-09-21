package com.academybank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.academybank.Eligibilty;

public class EligibilityDAO {
    
    private DataSource dataSource;
    
    public void setdataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void insert(Eligibilty eligb) {

		String sql = "INSERT INTO eligibility"
				+ "( accounttype, intialDeposit,"
				+ "directDepositMonthly,  debitCardVisaMaster,"
				+ "loanRequirement,creditscore)"
				+ "VALUES (?, ?, ?, ?, ?,?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, eligb.getAccountype());
			ps.setString(2, eligb.getInitialdeposit());
			ps.setString(3, eligb.getDirectdeposit());
			ps.setString(4, eligb.getCardtype());
			ps.setString(5, eligb.getLoanamount());
			ps.setString(6, eligb.getCreditscore());			
			ps.executeUpdate();
			ps.close();
			System.out.println("Adding Eligibility Data - EligibilityDAO-insert - Successful");
			

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
