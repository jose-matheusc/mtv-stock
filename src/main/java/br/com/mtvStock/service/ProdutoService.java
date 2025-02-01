package br.com.mtvStock.service;

import br.com.mtvStock.dto.ProdutoDto;
import br.com.mtvStock.model.ProdutoModel;
import br.com.mtvStock.repository.ProdutoRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public void criarProduto(@NonNull ProdutoDto produtoDto) {

        ProdutoModel produtoModel = criarProdutoModel(produtoDto);

        salvar(produtoModel);

    }


    public void excluirProduto(Long produtoId){

        excluirPeloId(produtoId);

    }

    private ProdutoModel criarProdutoModel(ProdutoDto produtoDto) {
        ProdutoModel produtoModel = new ProdutoModel();
        produtoModel.setNome(produtoDto.getNome());
        produtoModel.setCodigo(produtoDto.getCodigo());
        produtoModel.setDescricao(produtoDto.getDescricao());
        produtoModel.setPreco(produtoDto.getPreco());
        produtoModel.setQuantidade(produtoDto.getQuantidade());
        produtoModel.setCategoria(produtoDto.getCategoria());
        produtoModel.setCriadoEm(LocalDateTime.now());
        return produtoModel;
    }

    public void excluirPeloId(Long produtoId){
        produtoRepository.deleteById(produtoId);

    }

    public void salvar(ProdutoModel produtoModel){
        produtoRepository.save(produtoModel);
    }
}
