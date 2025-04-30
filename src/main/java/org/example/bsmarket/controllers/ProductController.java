package org.example.bsmarket.controllers;

import org.example.bsmarket.models.Product;
import org.example.bsmarket.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping ("/")
    public String products(@RequestParam(name = "title", required = false)String title , Model model){
        model.addAttribute("products", productService.list(title));
        return "products";
    }
    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/"; //перезагрузка страницы
    }
    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){//берет id из post и преобразует в Long
        productService.deleteProduct(id);
        return "redirect:/";

    }
    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAttribute("item", productService.getItemById(id));
        return "product-info";
    }
}
