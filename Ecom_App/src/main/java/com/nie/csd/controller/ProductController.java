package com.nie.csd.controller;
import com.nie.csd.models.Products;
// import com.nie.csd.repositories.ProductRepository;
import com.nie.csd.services.ProductsService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProductController {
    @Autowired
    ProductsService service;

    @GetMapping("/products")
    public String getProducts(){
        return "List of Products  from the products path";

    }

    
    @GetMapping("/allproducts")
    public List<Products> getAllProducts(){
        return service.getAllProducts();
    }


    @GetMapping("/allproducts/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable String id) {
        List<Products> products = service.getAllProducts();
        for (Products p : products) {
            if (p.getId().equals(id)) {
                return ResponseEntity.ok(p);
            }
        }
        return ResponseEntity.notFound().build();
}
}