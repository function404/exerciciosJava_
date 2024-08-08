package Java;

import java.util.Scanner;

public class MesQueRepresenta {
   public static void main(String[] arg) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("\nDigite um número de 1 a 12: ");
         int num = scanner.nextInt();

         if (num == 1) {
            System.out.println("O número " + num + " representa o mês de Janeiro");
         } else if (num == 2) {
            System.out.println("O número " + num + " representa o mês de Fevereiro");
         } else if (num == 3) {
            System.out.println("O número " + num + " representa o mês de Março");
         } else if (num == 4) {
            System.out.println("O número " + num + " representa o mês de Abril");
         } else if (num == 5) {
            System.out.println("O número " + num + " representa o mês de Maio");
         } else if (num == 6) {
            System.out.println("O número " + num + " representa o mês de Junho");
         } else if (num == 7) {
            System.out.println("O número " + num + " representa o mês de Julho");
         } else if (num == 8) {
            System.out.println("O número " + num + " representa o mês de Agosto");
         } else if (num == 9) {
            System.out.println("O número " + num + " representa o mês de Setembro");
         } else if (num == 10) {
            System.out.println("O número " + num + " representa o mês de Outubro");
         } else if (num == 11) {
            System.out.println("O número " + num + " representa o mês de Novembro");
         } else if (num == 12) {
            System.out.println("O número " + num + " representa o mês de Dezembro");
         } else if  (num > 12 && num < 1) {
            System.out.println("Eu pedi para Digitar um número de 1 a 12, tente novamente.");
         } else {
            System.out.println("Digite um número inteiro de 1 a 12");
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
