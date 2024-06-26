import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
    try {
        Scanner terminal = new Scanner(System.in); 
        System.out.println("Insira os números correspondentes a etapa de loop");
        int numeroForUm = terminal.nextInt();
        int numeroForDois = terminal.nextInt();
        String valida = Excecao(numeroForUm, numeroForDois);
        
        for(int conta = 1; 
        numeroForUm < numeroForDois; 
        conta++) {
            System.out.println("Impressão número "+conta);
              numeroForUm++;
        }
    } catch (ParametrosInvalidosException e) {
        System.out.println("É necessário que a variável numeroForDois receba valor numérico maior que a variável numeroForUm!");
    }
    finally {System.out.println("Tente novamente!");};
    terminal.close;
    
    }

    static String Excecao (int num1,int num2) throws ParametrosInvalidosException {
        if (num1 > num2)
        throw new ParametrosInvalidosException()
        ;
        return null;     
    }


   
}
