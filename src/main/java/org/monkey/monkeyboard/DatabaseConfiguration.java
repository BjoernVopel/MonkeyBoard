/*
package org.monkey.monkeyboard;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseConfiguration {

	@Bean
	public DataSource dataSource() {
		
		String host = "localhost";
		String port = "3306";
		String user = "bjanski";
		String password = "ThePassword";
		
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://" + host + "3306/bj");
		dataSourceBuilder.username(user);
		dataSourceBuilder.password(password);
		return dataSourceBuilder.build();
		
	}

}
*/

