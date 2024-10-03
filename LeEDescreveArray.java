import java.util.Scanner;

public class LeEDescreveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar 10 valores do tipo double
        double[] valores = new double[10];

        // Lê os 10 valores e armazena no array
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Imprime os valores do array
        System.out.println("\nOs valores informados são:");
        for (double valor : valores) {
            System.out.println(valor);
        }

        scanner.close();
    }
}

