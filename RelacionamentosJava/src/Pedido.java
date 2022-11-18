public class Pedido {

    private String numero;
    private String data;
    private Double valor;

    public Pedido(String numero, String data, Double valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
