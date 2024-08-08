package Java;

import java.util.Scanner;

public class CompareDoisValores {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite o primeiro número: ");
         String primeiroNumero = scanner.nextLine();
         System.out.println("Digite o segundo número: ");
         String segundoNumero = scanner.nextLine();

         if (primeiroNumero.equals(segundoNumero)) {
            System.out.println("Os números são iguais.");
         } else {
            System.out.println("Os números são diferentes.");
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}