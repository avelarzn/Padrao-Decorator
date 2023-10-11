package decorator;

public class Computador extends PedidoDecorator {

    public Computador(Pedido pedido) {
        super(pedido);
    }

    public float getPrecoAdicional() {return 5000.0f;}

    public String getDescricaoAdicional() {
        return "O computador precisa de mais memória";
    }
}
