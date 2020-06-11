package com.app.select;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.Customer;
import com.app.config.AppConfig;
import com.app.mapper.CustomerMapper;

public class SelectTest {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jt=(JdbcTemplate)ac.getBean("jtobj");
        String sql="Select * from customertable where cid=?";
        CustomerMapper rm=new CustomerMapper();
        Customer c=jt.queryForObject(sql, rm,3);
        System.out.println("cutomer details"+c);
	}

}
