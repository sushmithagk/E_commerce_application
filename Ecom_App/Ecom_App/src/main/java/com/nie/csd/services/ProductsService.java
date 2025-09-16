package com.nie.csd.services;

import com.nie.csd.models.Products;
import com.nie.csd.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductsService {

    @Autowired
    ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }

}
