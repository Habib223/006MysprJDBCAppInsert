package com.app.delete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;

public class DeleteTest {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt=(JdbcTemplate)ac.getBean("jtobj");
		String sql="delete from customertable where cid=?";
		int count=jt.update(sql,10);
		System.out.println("Customer record No:-"+count+ " Deleted successfully");
		

	}

}
