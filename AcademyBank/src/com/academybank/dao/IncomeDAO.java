package com.academybank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.academybank.Income;

public class IncomeDAO {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public void insert(Income vehicles){
		String sql = "INSERT INTO income " 
					+ "(ssn , incomemode, annual, housemode, rent)"
					+ " VALUES (?,?,?,?,?)";
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vehicles.getSsnum());
			ps.setString(2, vehicles.getIncomemode());
			ps.setString(3,  vehicles.getAnnualincome());
			ps.setString(4, vehicles.getHouseinfo());
			ps.setString(5, vehicles.getLeaseamount());
			
			ps.executeUpdate();
			ps.close();			
			System.out.println("Adding Income Data - IncomeDAO-insert - Successful");
		}catch(SQLException e){
			throw new RuntimeException (e);
		}finally{
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}
