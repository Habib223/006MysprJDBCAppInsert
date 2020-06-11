package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.Customer;

public class CustomerMapper  implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
	 
		Customer c=new Customer();
	    c.setCid(rs.getInt("cid"));
	    c.setCname(rs.getString("cname"));
	    c.setAddress(rs.getString("address"));		
		return c;
	}

}
