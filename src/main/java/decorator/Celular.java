package decorator;

public class Celular extends PedidoDecorator {

    public Celular(Pedido pedido) {
        super(pedido);
    }

    public float getPrecoAdicional() {
        return 1000.0f;
    }

    public String getDescricaoAdicional() {
        return "O celular acaba a bateria rápido";
    }
}