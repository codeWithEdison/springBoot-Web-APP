package com.codewithedison.SpringWebApp.service;

import com.codewithedison.SpringWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101, "Iphone", 10000),
            new Product(102, "tecno", 1000),
            new Product(103, "COW", 1000000)

            ));

    public List<Product> getProduct() {
        return products;
    }

    public Optional<Product> getProductById(int prodId) {
        return products.stream().filter(p -> p.getId() == prodId).findFirst();
    }
    public void addProduct(Product prod){
         products.add(prod);
    }

    public void updateProduct(Product prod) {
    int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()== prod.getId()){
                index=i;
            }

        }
        products.set(index, prod);
    }

    public void remove(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()== prodId){
                index=i;
            }

        }
        products.remove(index);
    }

}

