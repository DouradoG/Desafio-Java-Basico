import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (; limiteDiario >= 0 ; ) {
            double valorSaque = scanner.nextDouble();
            limiteDiario-=valorSaque;

            if (valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            }
            else if (limiteDiario >= 0) {
                System.out.println("Saque realizado. Limite restante: "+limiteDiario);
                
            } 
            
            else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");} 
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}