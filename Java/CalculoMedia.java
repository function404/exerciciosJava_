package Java;

import java.util.Scanner;

public class CalculoMedia {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite a primeira nota: ");
         double nota1 = scanner.nextDouble();
         System.out.println("Digite a segunda nota: ");
         double nota2 = scanner.nextDouble();
         System.out.println("Digite a terceira nota: ");
         double nota3 = scanner.nextDouble();

         double result = (nota1 + nota2 + nota3) / 3;
         System.out.println("A média do aluno é " + result);

         if (result >= 7) {
            System.out.println("O Aluno esta APROVADO");
         } else {
            System.out.println("O aluno esta REPROVADO");
         }
      } catch (Exception e) {
         System.out.println("Digite um numero válido");
      } finally {
         scanner.close(); 
      }
   }
}
