package com.codewithedison.SpringWebApp.controller;

import com.codewithedison.SpringWebApp.model.Product;
import com.codewithedison.SpringWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
@Autowired
    ProductService service;
@RequestMapping("/products")
    public List<Product> getProduct()
    {
        return service.getProduct();
    }
    @RequestMapping("/products/{prodId}")
    public Optional<Product> getProductById(@PathVariable int prodId){
    return  service.getProductById(prodId);
    }
    @PostMapping("/products")
    public String addProductt ( @RequestBody Product prod){
    service.addProduct(prod);
    return " product added succesfully";
    }
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod){
    service.updateProduct(prod);
    return "product updated succesfully";
    }

    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId){
    service.remove(prodId);
    return " product deleted succesfully";
    }
}
