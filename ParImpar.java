
import java.util.Scanner;

public class ParImpar {
    
    // Método que verifica se um número é par
    public static boolean isPar(int numero) {
        return numero % 2 == 0; // Retorna true se o número for par
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Laço para solicitar números ao usuário
        while (true) {
            System.out.print("Digite um número (ou '0' para sair): ");
            numero = scanner.nextInt();

            // Condição para sair do loop
            if (numero == 0) {
                break;
            }

            // Verifica se o número é par ou ímpar
            if (isPar(numero)) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
