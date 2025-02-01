package br.com.mtvStock.service;

import br.com.mtvStock.dto.ProductDto;
import br.com.mtvStock.model.ProductModel;
import br.com.mtvStock.repository.ProductRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(@NonNull ProductDto productDto) {

        ProductModel productModel = createProductModel(productDto);

        save(productModel);

    }

    private ProductModel createProductModel(ProductDto productDto) {
        ProductModel productModel = new ProductModel();
        productModel.setNome(productDto.getName());
        productModel.setCodigo(productDto.getSku());
        productModel.setDescricao(productDto.getDescription());
        productModel.setPreco(productDto.getPrice());
        productModel.setQuantidade(productDto.getQuantity());
        productModel.setCategoria(productDto.getCategory());
        productModel.setCriadoEm(LocalDateTime.now());
        return productModel;
    }

    public void save(ProductModel productModel){
        productRepository.save(productModel);
    }
}
