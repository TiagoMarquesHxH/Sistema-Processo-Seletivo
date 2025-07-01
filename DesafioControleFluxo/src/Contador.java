import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int p1 = terminal.nextInt();
        System.out.println("Insira o segundo número: ");
        int p2 = terminal.nextInt();
        
        try{
                
            contar(p1,p2);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        }
    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        
        if (p1 >= p2) {
            throw new ParametrosInvalidosException("Inválido, o segundo parâmetro deve ser maior que o primeiro");
        }

        int calculo = p2 - p1;
        for (int i = 1;i<calculo; i++){
            System.out.printf("Imprimindo o número %s \n", i);
        }
    }
}

