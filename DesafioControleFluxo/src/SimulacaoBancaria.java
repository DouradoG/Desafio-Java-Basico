import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            /*System.out.println("Olá, escolha a opção desejada");
            System.out.println("");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");*/
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   // System.out.println("Por favor, insira o valor a depositar!");
                    double deposito = scanner.nextDouble();
                    saldo+=deposito;
                    System.out.println("Saldo atual: "+saldo);
                    break;
                 case 2:
                   // System.out.println("Por favor, insira o valor a sacar!");
                    double saque = scanner.nextDouble();
                    if (saldo>saque) {
                    saldo-=saque;
                    System.out.println("Saldo atual: "+saldo);}
                    else
                    System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}