import java.util.Scanner;

public class InformeANota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];
        double soma = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];  // Soma as notas
        }

        double media = soma / quantidadeNotas;

        System.out.printf("A média das notas é: %.2f\n", media);

        scanner.close();
    }
}