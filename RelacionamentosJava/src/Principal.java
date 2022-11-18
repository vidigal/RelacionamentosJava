public class Principal {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Victor");
        c.setCpf("55555555");

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero("123456789");
        cc.setCliente(c);

        Endereco e = new Endereco();
        e.setLogradouro("Av. Rio Branco");
        e.setNumero("123");
        e.setComplemento("Casa 01");
        e.setCliente(c);
        c.setEndereco(e);

        c.setNome("Augusto");

        System.out.println(cc.getCliente().getCpf());

        System.out.println(e.getCliente().getNome());
        System.out.println(c.getEndereco().getLogradouro());

    }

}
