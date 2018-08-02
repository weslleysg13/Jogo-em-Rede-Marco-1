package disputadepenalty;

public class DisputadePenalty {
    private int chute;
    private int pulo;
    private String resultado;
    private int numGols;
    private int numDefesas;
    private int rodadaPar;
    private int rodadaImpar;

    public DisputadePenalty(int chute, int pulo) {
        this.chute = chute;
        this.pulo = pulo;
    }

    public int getChute() {
        return chute;
    }

    public int getPulo() {
        return pulo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado() {
        if (getChute() == 1 | getChute() == 2 | getChute() == 4 | getChute() == 5 && getPulo() == 16) {
            this.resultado = "Def";
        } else if (getChute() == 2 | getChute() == 3 | getChute() == 5 | getChute() == 6 && getPulo() == 17) {
            this.resultado = "Def";
        } else if (getChute() == 7 | getChute() == 8 && getPulo() == 18) {
            this.resultado = "Def";
        } else if (getChute() == 8 | getChute() == 9 && getPulo() == 19) {
            this.resultado = "Def";
        } else if (getChute() == 10 | getChute() == 11 | getChute() == 13 | getChute() == 14 && getPulo() == 20) {
            this.resultado = "Def";
        } else if (getChute() == 11 | getChute() == 12 | getChute() == 14 | getChute() == 15 && getPulo() == 21) {
            this.resultado = "Def";
        } else {
            this.resultado = "Gol";
        }
    }

    public int getNumGols() {
        return numGols;
    }

    public void setNumGols() {
        if (getResultado().equals("Gol")) {
            int gols = getNumGols();
            numGols = gols + 1;
        }
    }

    public int getNumDefesas() {
        return numDefesas;
    }

    public void setNumDefesas() {
        if (getResultado().equals("Def")) {
            int defesas = getNumDefesas();
            numDefesas = defesas + 1;
        }
    }

    public int getRodadaPar() {
        return rodadaPar;
    }

    public void setRodadaPar(int rodada) {
        if (rodada % 2 == 0) {
            if (getResultado().equals("Gol")) {
                int placar2 = getRodadaPar();
                rodadaPar = placar2 + 1;
            }
        }
    }

    public int getRodadaImpar() {
        return rodadaImpar;
    }

    public void setRodadaImpar(int rodada) {
        if (rodada % 2 != 0) {
            if (getResultado().equals("Gol")) {
                int placar1 = getRodadaImpar();
                rodadaImpar = placar1 + 1;
            }
        }
    }
}
