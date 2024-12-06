package br.com.mtvStock.controller;

import br.com.mtvStock.dto.ProductDto;
import br.com.mtvStock.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1") // Define o prefixo para os endpoints
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Object> createProduct(@RequestBody ProductDto productDto) {

        productService.createProduct(productDto);
        return ResponseEntity.status(201).body("Product created");

    }


}
