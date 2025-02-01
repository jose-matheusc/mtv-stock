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
        productModel.setName(productDto.getName());
        productModel.setSku(productDto.getSku());
        productModel.setDescription(productDto.getDescription());
        productModel.setPrice(productDto.getPrice());
        productModel.setQuantity(productDto.getQuantity());
        productModel.setCategory(productDto.getCategory());
        productModel.setCreatedAt(LocalDateTime.now());
        return productModel;
    }

    public void save(ProductModel productModel){
        productRepository.save(productModel);
    }
}
