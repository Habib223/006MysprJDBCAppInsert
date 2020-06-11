package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("jdbc.properties")
@Configuration
public class AppConfig {

	@Autowired
	 private Environment env;
	 
	 public DriverManagerDataSource dsobj(){
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("dc"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("un"));
		ds.setPassword(env.getProperty("pwd"));
		
		return ds;	 
	 }
	 @Bean
	public JdbcTemplate jtobj() {
		JdbcTemplate jt=new JdbcTemplate ();
		jt.setDataSource(dsobj());
		
		return jt;
		
	}
	
}
