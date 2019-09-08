package com.springboot.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

	@Configuration
	@EnableTransactionManagement
	public class DBConfiguration {
	    @Value("${spring.datasource.driver}")
	    private String DRIVER;

	    @Value("${spring.datasource.password}")
	    private String PASSWORD;

	    @Value("${spring.datasource.url}")
	    private String URL;

	    @Value("${spring.datasource.username}")
	    private String USERNAME;

	    @Value("${spring.jpa.properties.hibernate.dialect}")
	    private String DIALECT;

	    @Value("${spring.jpa.show-sql}")
	    private String SHOW_SQL;

	    @Value("${spring.jpa.hibernate.ddl-auto}")
	    private String HBM2DDL_AUTO;

	    /*
	    @Value("${entitymanager.packagesToScan}")
	    private String PACKAGES_TO_SCAN;
	    */

	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(DRIVER);
	        dataSource.setUrl(URL);
	        dataSource.setUsername(USERNAME);
	        dataSource.setPassword(PASSWORD);
	        return dataSource;
	    }

	    private Properties properties() {
	    	
	    	 Properties hibernateProperties = new Properties();
		        hibernateProperties.put("hibernate.dialect", DIALECT);
		        hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
		        hibernateProperties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
		        
		        return hibernateProperties;
	    }
	    
	    @Bean
	    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	          LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	          em.setDataSource(dataSource());
	          em.setPackagesToScan(new String[] {"com.springboot.dao"});
	          JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	          em.setJpaVendorAdapter(vendorAdapter);
	          em.setJpaProperties(properties());

	          return em;
	    }
	    
	    /*
	    @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	    	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	       
	       sessionFactory.setDataSource(dataSource());	        
	        sessionFactory.setHibernateProperties(properties());
	        sessionFactory.setPackagesToScan(new String[] {"com.springboot.dao"});

	        return sessionFactory;
	    }

	    
	    @Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	        HibernateTransactionManager txManager = new HibernateTransactionManager();
	        txManager.setSessionFactory(sessionFactory);
	        return txManager;
	    }
	    
	    @Bean
	    public HibernateEntityManager transactionManager() {
	        org.springframework.orm.hibernate5.HibernateTransactionManager transactionManager = new org.springframework.orm.hibernate5.HibernateTransactionManager();
	        transactionManager.setSessionFactory(((Object) sessionFactory()).getObject());
	        return transactionManager;
	    }
	    */
	}

