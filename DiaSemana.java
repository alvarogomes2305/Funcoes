

import java.util.Scanner;

public class DiaSemana {

    public static String exibirDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Dia da semana inválido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();

        String resultado = exibirDiaSemana(dia);
        System.out.println(resultado);

        scanner.close();
    }
}

