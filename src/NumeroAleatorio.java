import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int contador = 0;
        int numero = 0;
        int aleatorio = new Random().nextInt(3);


        System.out.println("== Jogo do número aleatório ==");

        while (contador != 5) {

            System.out.print("Qual é o número aleatório: ");
            numero = scanner.nextInt();

            if (numero == aleatorio) {
                System.out.println("Parabéns vc acertou, o número aleatório é " + aleatorio);
                break;
            } else if (aleatorio > numero) {
                System.out.println("O número e aleatório é maior");
            } else {
                System.out.println("O número aleatório e menor");
            }
            contador++;
        }

        if (contador == 5) {
            System.out.print("Fim de jogo o número aleatório é: " + aleatorio);
        }

    }
}
