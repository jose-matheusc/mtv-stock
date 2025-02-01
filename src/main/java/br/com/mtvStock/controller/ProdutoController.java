package br.com.mtvStock.controller;

import br.com.mtvStock.dto.ProdutoDto;
import br.com.mtvStock.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping("/create")
    public ResponseEntity<Object> createProduct(@RequestBody ProdutoDto produtoDto) {

        produtoService.criarProduto(produtoDto);
        return ResponseEntity.status(201).body("Product created");

    }


}
