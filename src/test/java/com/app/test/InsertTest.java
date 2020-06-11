package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;

public class InsertTest {

	public static void main(String[] args) {
		
		
	 ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	 JdbcTemplate jt=(JdbcTemplate)ac.getBean("jtobj");
	 String sql="insert into customertable values(?,?,?)";
	 int count=jt.update(sql,6,"shaad","gaya");
	 System.out.println("==================Customer details=============");
	 System.out.println("Cutomer Details save successfully:"+count);
	
	}
}
