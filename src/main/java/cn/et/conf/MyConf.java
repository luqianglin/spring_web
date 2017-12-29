package cn.et.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class MyConf {
	@Value("${url}")
	private String url;
	@Value("${driverClass}")
	private String drdiverClassName;
	@Value("${username1}")
	private String userName;
	@Value("${password}")
	private String password;
	/**
	 * 相当于配置文件中的jdbcTemplate
	 * @param dataSource
	 * @return
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	/**
	 * 相当于配置文件中的dataSouce获取连接
	 * @return
	 */
	@Bean
	public DataSource dataSouce(){
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(url);
		dmds.setDriverClassName(drdiverClassName);
		dmds.setUsername(userName);
		dmds.setPassword(password);
		return dmds;
	}
}
