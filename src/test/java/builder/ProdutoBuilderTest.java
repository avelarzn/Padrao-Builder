package builder;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBuilderTest {

    @Test
    void deveRetornarExcecaoParaProdutoSemCodigo() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Date dataFabricacao = new Date();
            Produto produto = produtoBuilder
                    .setNome("Produto 1")
                    .setDataFabricacao(dataFabricacao)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProdutoSemNome() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setCodigo(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoValido() {
        ProdutoBuilder produtoBuilder = new ProdutoBuilder();
        Date dataFabricacao = new Date();
        Produto produto = produtoBuilder
                .setCodigo(1)
                .setNome("Produto 1")
                .setDescricao("Muito bom")
                .setDataFabricacao(dataFabricacao)
                .build();

        assertNotNull(produto);
    }

}