import java.util.Scanner;

public class CalculoMediaNotasNegativaEncerra {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double somaNotas = 0;
      int contadorNotas = 0;

      try {
         while (true) {
            System.out.println("Digite uma nota (ou um número negativo para encerrar): ");
            double nota = scanner.nextDouble();

            if (nota < 0) {
               break;
            }

            somaNotas += nota;
            contadorNotas++;
         }

         if (contadorNotas > 0) {
            double media = somaNotas / contadorNotas;
            System.out.println("A média das notas é: " + media);
         } else {
            System.out.println("Nenhuma nota foi digitada.");
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
