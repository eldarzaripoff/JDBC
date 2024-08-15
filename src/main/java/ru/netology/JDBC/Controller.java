package ru.netology.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final ProductRepository productRepository;

    @Autowired
    public Controller(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}
