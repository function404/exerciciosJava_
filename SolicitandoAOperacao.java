import java.util.Scanner;

public class SolicitandoAOperacao {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.print("Digite o primeiro número: ");
         double num1 = scanner.nextDouble();

         System.out.print("Digite o segundo número: ");
         double num2 = scanner.nextDouble();

         System.out.print("Digite a operação (+, -, *, /): ");
         char operacao = scanner.next().charAt(0);

         double resultado = 0;
         switch (operacao) {
            case '+':
               resultado = num1 + num2;
               break;
            case '-':
               resultado = num1 - num2;
               break;
            case '*':
               resultado = num1 * num2;
               break;
            case '/':
               resultado = num1 / num2;
               break;
            default:
               System.out.println("Operação inválida.");
               break;
         }

         System.out.println("O resultado da operação é: " + resultado);
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}