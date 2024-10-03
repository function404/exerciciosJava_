import java.util.Scanner;

public class ValoresAbaixoDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[20];
        double soma = 0;

        System.out.println("Digite 20 valores:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        double media = soma / valores.length;

        System.out.println("\nValores inferiores à média (" + media + "):");
        for (double valor : valores) {
            if (valor < media) {
                System.out.println(valor);
            }
        }

        scanner.close();
    }
}

