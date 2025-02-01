package br.com.mtvStock.repository;

import br.com.mtvStock.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProdutoModel, Long> {
}
