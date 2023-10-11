package decorator;

public class FoneDeOuvido extends PedidoDecorator {

    public FoneDeOuvido(Pedido pedido) {
        super(pedido);
    }

    public float getPrecoAdicional() {
        return 20.0f;
    }

    public String getDescricaoAdicional() {
        return "O fone de ouvido é muito bom";
    }
}