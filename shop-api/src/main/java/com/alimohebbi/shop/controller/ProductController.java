package com.alimohebbi.shop.controller;


import com.alimohebbi.shop.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductController {
        @GetMapping("/products")
        public List<Product> getProducts() {

                List<Product> products = new ArrayList<>();
                Product p1 = new Product();
                p1.id = 1;
                p1.name = "30 watt lamp";
                p1.price = 106000;
                p1.stock = 24;

                Product p2 = new Product();
                p2.id = 2;
                p2.name = "40 watt lamp";
                p2.price = 177000;
                p2.stock = 24;

                Product p3 = new Product();
                p3.id = 3;
                p3.name = "50 watt lamp";
                p3.price = 213000;
                p3.stock = 36;



                products.add(p1);
                products.add(p2);
                products.add(p3);



                return products;
        }
}
