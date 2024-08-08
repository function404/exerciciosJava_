import java.util.Scanner;

public class CalculoVelocidade {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite a distância percorrida (em metros): ");
         double distancia = scanner.nextDouble();
         System.out.println("Digite o tempo gasto (em segundos): ");
         double tempo = scanner.nextDouble();

         double velocidade = distancia / tempo;
         System.out.println("A velocidade média é: " + velocidade + " m/s");
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
