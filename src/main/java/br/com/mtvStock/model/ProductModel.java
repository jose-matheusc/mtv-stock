package br.com.mtvStock.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;


    /**
     * Column code product
     */
    @Column(name = "codigo", unique = true, nullable = false)
    private String codigo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "preco", nullable = false)
    private double preco;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel model = (ProductModel) o;
        return Double.compare(preco, model.preco) == 0 && quantidade == model.quantidade && Objects.equals(id, model.id) && Objects.equals(nome, model.nome) && Objects.equals(codigo, model.codigo) && Objects.equals(descricao, model.descricao) && Objects.equals(categoria, model.categoria) && Objects.equals(criadoEm, model.criadoEm) && Objects.equals(atualizadoEm, model.atualizadoEm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, codigo, descricao, preco, quantidade, categoria, criadoEm, atualizadoEm);
    }
}
