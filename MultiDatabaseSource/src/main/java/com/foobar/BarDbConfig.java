package com.foobar;




import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "barEntityManagerFactory",
        transactionManagerRef = "barTransactionManager",
        basePackages = { "com.foobar.bar.repo" }
)
public class BarDbConfig {

    @Bean(name = "barDataSource")
    @ConfigurationProperties(prefix = "spring.bar.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "barEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    barEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("barDataSource") DataSource dataSource
    ) {
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "update");
        //spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
        //spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL95Dialect
        properties.put("spring.jpa.database-platform","org.hibernate.dialect.PostgreSQL95Dialect");
        properties.put("spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults","true");
        //properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
      //  properties.put("spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation","true");
       // properties.put("hibernate.dialect","org.postgresql.Driver");
        //properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

        return
                builder
                        .dataSource(dataSource)
                        .properties(properties)
                        .packages("com.foobar.bar.domain")
                        .persistenceUnit("domain")
                        .build();
    }
    @Bean(name = "barTransactionManager")
    public PlatformTransactionManager barTransactionManager(
            @Qualifier("barEntityManagerFactory") EntityManagerFactory
                    barEntityManagerFactory
    ) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}
