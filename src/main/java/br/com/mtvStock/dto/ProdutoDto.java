package br.com.mtvStock.dto;

import br.com.mtvStock.model.CategoriaModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {
    private String nome;
    private String codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    private CategoriaModel categoria;

}
