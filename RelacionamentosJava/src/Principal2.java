public class Principal2 {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("João");
        c.setCpf("123456");

        Pedido p1 = new Pedido("123", "01/01/2020", 1.0);
        Pedido p2 = new Pedido("333", "10/02/2021", 2.0);
        Pedido p3 = new Pedido("987", "20/03/2022", 3.0);

        c.addPedido(p1);
        c.addPedido(p2);
        c.addPedido(p3);

        System.out.println(c.valorTotalPedidos());

    }

}
