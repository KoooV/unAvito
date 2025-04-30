package org.example.bsmarket.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.bsmarket.models.Product;
import org.example.bsmarket.repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public List<Product> list(String title){
        List<Product> products = productRepo.findAll();
        return products;}

    public void saveProduct(Product product){
        log.info("Saving new {}", product);//в {} вставиться строковое представление product при помощи toString()
        productRepo.save(product);
    }

    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }

    public Product getItemById(Long id) {
        return productRepo.findById(id).orElse(null);//если товара не найден то вернется null

    }
}
