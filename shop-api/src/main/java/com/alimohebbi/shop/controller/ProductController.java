package com.alimohebbi.shop.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
        @GetMapping("/products")
        public String getProducts() {
            return "Just buy from our store."; // This corresponds to a Thymeleaf template named "hello.html"
        }

}
