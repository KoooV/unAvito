package org.example.bsmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,       // Отключает автонастройку DataSource
        JpaRepositoriesAutoConfiguration.class,  // Отключает сканирование репозиториев JPA
        SecurityAutoConfiguration.class //Отключает стандартную страницу входа Spring security
})
public class BSmarketApplication {
    public static void main(String[] args) {
        SpringApplication.run(BSmarketApplication.class, args);
    }
}
