package com.klimov.__SimpleWebApp.service;

import com.klimov.__SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon",70000),
            new Product(103,"Shure Mic", 10000)));

    public List<Product> getProducts (){
        return products;
    }
    public Product getProductByID(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
    public  void addProduct(Product prod){
        products.add(prod);
    }
}
