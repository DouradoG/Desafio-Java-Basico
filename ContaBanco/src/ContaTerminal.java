import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private static final String Int = null;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite número da Conta");
        Integer conta = scanner.nextInt();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        String nomeCliente = "MARIO ANDRADE";

        Double saldo = 237.48;

        //String mensagem = 

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo de "+saldo+" já está disponível para saque.");
        
    }
}
