import java.util.Scanner;

public class bankBank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        String nome = "Luis Henrique";
        String conta = "Corrente";
        double saldo = 5000.0;
        double deposito = 0;
        double saque = 0;

        System.out.println(String.format("""
                ===================================
                
                Nome:               %s
                Tipo da conta:      %s
                Saldo inicial:      %.2f
                ===================================
                """, nome, conta, saldo));

        while(contador != 4) {

            System.out.println("""
                    Operações
                                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Tranferir valor
                    4- Sair
                    """);
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.print("Deposito: ");
                    deposito = scanner.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.print("sacar: ");
                    saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("saldo insuficiente :(");
                    } else {
                        saldo -= saque;
                    }
                    break;
                case 4:
                    contador = 4;
                    break;
            }
        }

        System.out.println("Obrigado, até mais :D");
    }
}
