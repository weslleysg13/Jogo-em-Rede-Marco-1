package disputadepenalty;

public class Jogador {
    private String nome;
    private String pernaqueChuta;

    public Jogador(String nome, String pernaqueChuta) {
        this.nome = nome;
        this.pernaqueChuta = pernaqueChuta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPernaqueChuta() {
        return pernaqueChuta;
    }

    public void setPernaqueChuta(String pernaqueChuta) {
        this.pernaqueChuta = pernaqueChuta;
    }
}
