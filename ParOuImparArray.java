import java.util.Scanner;

public class ParOuImparArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar 10 valores inteiros
        int[] valores = new int[10];

        // Lê os 10 valores e armazena no array
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        // Verifica e imprime se cada valor é par ou ímpar
        System.out.println("\nResultado:");
        for (int valor : valores) {
            if (valor % 2 == 0) {
                System.out.println(valor + " é par");
            } else {
                System.out.println(valor + " é ímpar");
            }
        }

        scanner.close();
    }
}
