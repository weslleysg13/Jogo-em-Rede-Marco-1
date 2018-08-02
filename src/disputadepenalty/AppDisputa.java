package disputadepenalty;

/* Jogo Disputa de Penalty...
    Estou em dúvida se precisa de duas classes jogador por ser um jogo em rede e com dificuldade
    para implementar o placar e o numéro de gols e defesas para a frase do final.
    está em DisputadePenalty */

import java.util.Scanner;

public class AppDisputa {
    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println("                                          ");
        System.out.println("           Disputa de Penaltys           ");
        System.out.println("                                          ");
        System.out.println("------------------------------------------");

        Scanner digitado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nomeJogador = digitado.nextLine();
        System.out.print("Digite a perna que você chuta (Direita ou esquerda): ");
        String perna = digitado.nextLine();

        Jogador jogador = new Jogador(nomeJogador, perna);
        for (int i = 1; i <= 10; i++) {
            int j = 0;
            System.out.printf("%dª Rodada", i);
            System.out.println("\n  ----Números de Chute----\n");
            System.out.println(" ---------------------------" +
                    "\n|1     4     7     10     13|" +
                    "\n|                           |" +
                    "\n|2     5     8     11     14|" +
                    "\n|                           |" +
                    "\n|3     6     9     12     15|");
            System.out.print("\nDigite o número do Chute: ");
            int canto = digitado.nextInt();
            System.out.printf("Perna que chuta: %s\n", jogador.getPernaqueChuta());
            System.out.println(" ----------------------------" +
                    "\n|                            |" +
                    "\n| 16          18          20 |" +
                    "\n|                            |" +
                    "\n| 17          19          21 |" +
                    "\n|                            |");
            System.out.print("\nDigite o número do Pulo: ");
            int defesa = digitado.nextInt();
            DisputadePenalty disputadePenalty = new DisputadePenalty(canto, defesa);
            disputadePenalty.setResultado();
            if (disputadePenalty.getResultado().equals("Gol")) {
                System.out.print("\nGoooooooool!\n");
                disputadePenalty.setNumGols();
                System.out.printf("Número de Gols: %d\n", disputadePenalty.getNumGols());
            } else {
                System.out.println("\nDefendeeeeu!\n");
                disputadePenalty.setNumDefesas();
                System.out.printf("Número de Defesas: %d\n", disputadePenalty.getNumDefesas());
            }
            disputadePenalty.setRodadaImpar(i);
            disputadePenalty.setRodadaPar(i);
            System.out.printf("%s %d X %d %s\n", jogador.getNome(), disputadePenalty.getRodadaImpar(), disputadePenalty.getRodadaPar(), jogador.getNome());
            if (i == 10) {
                if (disputadePenalty.getNumGols() > disputadePenalty.getNumDefesas()) {
                    System.out.println("Você é um bom Chutador!");
                } else {
                    System.out.println("Você é um bom Goleiro!");
                }
            }
        }
    }
}