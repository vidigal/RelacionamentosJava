public class Principal {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Victor");

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero("123456789");
        cc.setCliente(c);

    }

}
