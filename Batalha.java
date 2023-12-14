package Jogo;


public class Batalha {
    private Personagem jogador1;
    private Personagem jogador2;

    public Batalha(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void iniciarBatalha() {
        System.out.println("Batalha iniciada: " + jogador1.getNome() + " vs " + jogador2.getNome());
        
        while (jogador1.getVida() > 0 && jogador2.getVida() > 0) {
            realizarTurno(jogador1, jogador2);
            if (jogador2.getVida() <= 0) {
                System.out.println(jogador1.getNome() + " é o vencedor!");
                break;
            }

            realizarTurno(jogador2, jogador1);
            if (jogador1.getVida() <= 0) {
                System.out.println(jogador2.getNome() + " é o vencedor!");
                break;
            }
        }

        exibirResultado();
    }

    private void realizarTurno(Personagem atacante, Personagem defensor) {
        System.out.println("\nTurno de " + atacante.getNome());
        
        // Aqui você pode adicionar lógica para que o jogador escolha a arma antes de atacar
        int indiceArma = escolherArma(atacante);
        
        atacante.atacar(defensor, indiceArma);

        // Exibindo informações de vida após o ataque
        System.out.println("Vida restante de " + defensor.getNome() + ": " + defensor.getVida());
    }

    private int escolherArma(Personagem jogador) {
       
    }

    private void exibirResultado() {
        System.out.println("\n--- Resultado da Batalha ---");
        System.out.println(jogador1.getNome() + " - Vida restante: " + jogador1.getVida());
        System.out.println(jogador2.getNome() + " - Vida restante: " + jogador2.getVida());
    }
}
