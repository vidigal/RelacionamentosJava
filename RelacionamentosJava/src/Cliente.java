import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private Endereco endereco;

    private Collection<Pedido> pedidos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public Double valorTotalPedidos() {
        Double total = 0.0;
        for (Pedido p: this.pedidos) {
            total += p.getValor();
        }
        return total;
    }

}
