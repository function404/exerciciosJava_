package Java;

import java.util.Scanner;

public class CalculoImc {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite o peso: por exemplo 76,2");
         double peso = scanner.nextDouble();
         System.out.println("Digite a altura: por exemplo 1,75");
         double altura = scanner.nextDouble();

         double imc = peso / (altura * altura);
         System.out.println("O IMC é: " + imc);

         if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
         } else if (imc <= 18.6 || imc <= 24.9) {
            System.out.println("Peso ideal.");
         } else if (imc <= 25.0 || imc <= 29.9) {
            System.out.println("levemente acima do peso.");
         } else if (imc <= 30.0 || imc <= 34.9) {
            System.out.println("Obesidade grau I.");
         } else if (imc <= 35.0 || imc <= 39.9) {
            System.out.println("Obesidade grau II.");
         } else if (imc < 40) {
            System.out.println("Obesidade grau III.");
         } else {
            System.out.println("Obesidade grau III.");
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
