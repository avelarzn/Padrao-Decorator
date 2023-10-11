package decorator;

public class PedidoInformacao implements Pedido {

    public float preco;

    public PedidoInformacao() {
    }

    public PedidoInformacao(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Informações dos pedidos";
    }

}