public class appDepFunc {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("José funcionário");

        Dependente d1 = new Dependente(f1);
        Dependente abc = new Dependente(f1);

        d1.setNome("João da Silva");
        abc.setNome("Maria");

    }

}
