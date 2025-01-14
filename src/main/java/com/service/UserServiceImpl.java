package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void userSignup(User user) {
		 
		String sql = "insert into user(fname,lname,username,password)values(?,?,?,?)";
		try {
			PreparedStatement pstm = DB.getConn().prepareStatement(sql);
			  pstm.setString(1, user.getFname());
			  pstm.setString(2, user.getLname());
			  pstm.setString(3, user.getUsername());
			  pstm.setString(4, user.getPassword());
			  
			  pstm.execute();
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean userLogin(String un, String psw) {
		
		String sql = "select * from user where username='"+un+"' and password ='"+psw+"' ";
		try {
			Statement stm = DB.getConn().createStatement();
			ResultSet  rs =stm.executeQuery(sql);
			
			if(rs.next())
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		     
		return false;
	}

}
