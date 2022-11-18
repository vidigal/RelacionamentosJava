import java.util.Collection;

public class TimeFutebol {

    private String nome;
    private Collection<Jogador> jogadores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Collection<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
