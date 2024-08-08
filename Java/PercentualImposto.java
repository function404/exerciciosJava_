package Java;

import java.util.Scanner;

public class PercentualImposto {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite o valor do faturamento: ");
         double valorProduto = scanner.nextDouble();
         System.out.println("Digite o valor do imposto: ");
         double valorImposto = scanner.nextDouble();

         double percentualImposto = (valorImposto / valorProduto) * 100;
         System.out.println("O percentual de imposto é: " + percentualImposto + "%");
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
   
}
