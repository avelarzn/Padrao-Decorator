package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPrecoPedido() {
        Pedido pedido = new PedidoInformacao(1000.0f);

        assertEquals(1000.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoCelular() {
        Pedido pedido = new Celular(new PedidoInformacao(1000.0f));

        assertEquals(2000.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComputador() {
        Pedido pedido = new Computador(new PedidoInformacao(1000.0f) {
        });

        assertEquals(6000.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoFoneDeOuvido() {
        Pedido pedido = new FoneDeOuvido(new PedidoInformacao(1000.0f));

        assertEquals(1020.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoCelularMaisComputador() {
        Pedido pedido = new Celular(new Computador(new PedidoInformacao(1000.0f)));

        assertEquals(7000.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoCelularMaisFoneDeOuvido() {
        Pedido pedido = new Celular(new FoneDeOuvido(new PedidoInformacao(1000.0f)));

        assertEquals(2020.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComputadorMaisFoneDeOuvido() {
        Pedido pedido = new Computador(new FoneDeOuvido(new PedidoInformacao(1000.0f)));

        assertEquals(6020.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoCelularMaisComputadorMaisFoneDeOuvido() {
        Pedido pedido = new Celular(new Computador(new FoneDeOuvido(new PedidoInformacao(1000.0f))));

        assertEquals(7020.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoPedido() {
        Pedido pedido = new PedidoInformacao();

        assertEquals("Informações dos pedidos", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoCelular() {
        Pedido pedido = new Celular(new PedidoInformacao());

        assertEquals("Informações dos pedidos / O celular acaba a bateria rápido", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComputador() {
        Pedido pedido = new Computador(new PedidoInformacao());

        assertEquals("Informações dos pedidos / O computador precisa de mais memória", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoFoneDeOuvido() {
        Pedido pedido = new FoneDeOuvido(new PedidoInformacao());

        assertEquals("Informações dos pedidos / O fone de ouvido é muito bom", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoCelularMaisComputador() {
        Pedido pedido = new Celular(new Computador (new PedidoInformacao()));

        assertEquals("Informações dos pedidos / O computador precisa de mais memória / O celular acaba a bateria rápido", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoCelularMaisFoneDeOuvido() {
        Pedido pedido = new Celular(new FoneDeOuvido (new PedidoInformacao()));

        assertEquals("Informações dos pedidos / O fone de ouvido é muito bom / O celular acaba a bateria rápido", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComputadorMaisFoneDeOuvido() {
        Pedido pedido = new Computador(new FoneDeOuvido (new PedidoInformacao()));

        assertEquals("Informações dos pedidos / O fone de ouvido é muito bom / O computador precisa de mais memória", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoCelularMaisComputadorMaisFoneDeOuvido() {
        Pedido pedido = new Celular (new Computador(new FoneDeOuvido (new PedidoInformacao())));

        assertEquals("Informações dos pedidos / O fone de ouvido é muito bom / O computador precisa de mais memória / O celular acaba a bateria rápido", pedido.getDescricao());
    }
}