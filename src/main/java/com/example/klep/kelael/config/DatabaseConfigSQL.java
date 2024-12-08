package com.example.klep.kelael.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfigSQL {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setUrl("jdbc:mysql://localhost:3306/tu_base");
        source.setUsername("usuario");
        source.setPassword("contraseña");
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");

        return source;
    }
}
