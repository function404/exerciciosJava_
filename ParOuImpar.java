import java.util.Scanner;

public class ParOuImpar {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite um número: ");
         double numero = scanner.nextDouble();

         if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
         }  else {
            System.out.println("O número " + numero + " é ímpar.");
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
