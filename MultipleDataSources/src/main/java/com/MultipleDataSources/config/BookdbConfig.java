package com.MultipleDataSources.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "bookEntityManagerFactory", transactionManagerRef = "bookTransactionManager",basePackages = {"com.MultipleDataSources.bookrepo"})
public class BookdbConfig
{

    @Bean(name="bookdatasource")
    @ConfigurationProperties(prefix = "spring.book.datasource")
    public DataSource dataSource(){

        return DataSourceBuilder.create().build();
    }

    @Bean(name = "bookEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
                                                                           @Qualifier("bookdatasource")DataSource dataSource){
        Map<String, Object> properties = new HashMap<>();

        properties.put("spring.jpa.hibernate.ddl-auto"," update");
        properties.put("spring.jpa.properties.hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");

        return builder.dataSource(dataSource).properties(properties).packages(" com.MultipleDataSources.book").persistenceUnit("Book").build();
    }
    @Primary
    @Bean(name = "bookTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("bookEntityManagerFactory") EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);

    }

}
