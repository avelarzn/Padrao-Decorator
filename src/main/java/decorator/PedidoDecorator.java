package decorator;

public abstract class PedidoDecorator implements Pedido {

    private Pedido pedido;
    public String descricaoAdicional;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract float getPrecoAdicional();

    public float getPreco() {
        return this.pedido.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getDescricaoAdicional();

    public String getDescricao() {
        return this.pedido.getDescricao() + " / " + this.getDescricaoAdicional();
    }

    public void setDescricaoAdicional(String descricaoAdicional) {
        this.descricaoAdicional = descricaoAdicional;
    }
}