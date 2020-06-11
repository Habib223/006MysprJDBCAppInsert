package com.app.update;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;

public class Update {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt=(JdbcTemplate)ac.getBean("jtobj");
		String sql="update customertable set cname=?,address=? where cid=?";
		int count=jt.update(sql,"aftab","patna",4);
		System.out.println("Customer Details updated successfully:-"+count);
		
		
	}

}
