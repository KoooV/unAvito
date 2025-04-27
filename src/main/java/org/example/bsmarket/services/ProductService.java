package org.example.bsmarket.services;

import org.example.bsmarket.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {//нестатический блок инициализации, выполняется при создании объекта класса, до вызоыв конструктора
        products.add(new Product(++ID,"Iphone 16", "abcd", 60000, "Moscow"));
        products.add(new Product(+ID,"Iphone 16pro", "abcd", 85000, "Moscow"));
        products.add(new Product(++ID,"Pixel 9", "abcd", 50000, "Moscow"));
        products.add(new Product(++ID,"Galaxy S25", "abcd", 60000, "Moscow"));
    }

    public List<Product> list(){return products;}

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getItemById(Long id) {
        for (Product product : products){
            if(product.getId().equals(id)){return product;}
        }
        return null;

    }
}
