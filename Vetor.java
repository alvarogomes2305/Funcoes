
import java.util.Scanner;

public class Vetor {

    // Função (a): retorna o maior valor de um vetor de inteiros
    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    // Função (b): retorna o menor valor de um vetor de inteiros
    public static int menorValor(int[] vetor) {
        int menor = vetor[0];
        for (int num : vetor) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    // Função (c): retorna a média entre o maior e o menor valor
    public static double mediaMaiorEMenor(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);
        return (max + min) / 2.0; // Utiliza 2.0 para garantir que a divisão seja em ponto flutuante
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Maior valor: " + maiorValor(vetor));
        System.out.println("Menor valor: " + menorValor(vetor));
        System.out.println("Média entre maior e menor: " + mediaMaiorEMenor(vetor));

        scanner.close();
    }
}
