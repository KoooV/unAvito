package org.example.bsmarket.repositories;

import org.example.bsmarket.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//JpaRepository - класс для упрощенной работы с бд
public interface ProductRepo extends JpaRepository<Product, Long> {// Long - тип id
    List<Product> findByTitle(String title);

}
