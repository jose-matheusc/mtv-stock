package br.com.mtvStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class CategoriaModel {

    private Long id;

    @Column(name = "product")
    @OneToMany
    private ProductModel productModel;

    private String nome;
}
