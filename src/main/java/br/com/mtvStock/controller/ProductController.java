package br.com.mtvStock.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController("/product/v1")
public class ProductController {


    public ResponseEntity<String> createProduct() {

        return ResponseEntity.status(201).body("Product created");

    }


}
