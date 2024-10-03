import java.util.Scanner;

public class TemperaturaAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar a temperatura média de cada mês
        double[] temperaturas = new double[12];
        double somaTemperaturas = 0;

        // Recebe a temperatura média de cada mês
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            somaTemperaturas += temperaturas[i];
        }

        // Calcula a temperatura média do ano
        double mediaAnual = somaTemperaturas / 12;

        // Exibe a temperatura média do ano
        System.out.printf("A temperatura média anual é: %.2f\n", mediaAnual);

        scanner.close();
    }
}

