public class Carro {

    private String nome;
    private Motor motor;

    public Carro() {
        this.setMotor(new Motor());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public class Motor {

        private Double potencia;

        public Double getPotencia() {
            return potencia;
        }

        public void setPotencia(Double potencia) {
            this.potencia = potencia;
        }
    }

}
