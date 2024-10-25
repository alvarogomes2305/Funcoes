
import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt(); // Lê um número inteiro do usuário

        // Chama o método calcularFatorial e armazena o resultado
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + fatorial); // Exibe o resultado

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Método que calcula o fatorial de um número inteiro
    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo."); // Lança exceção para números negativos
        }

        long resultado = 1; // Inicializa o resultado como 1
        for (int i = 1; i <= n; i++) {
            resultado *= i; // Multiplica o resultado pelo número atual
        }
        return resultado; // Retorna o fatorial calculado
    }
}

