import java.util.Scanner;

public class SalarioImposto {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite o valor do salrio: ");
         double salario = scanner.nextDouble();

         if (salario <= 1903.98) {
            System.out.println("Isento de imposto de renda.");
         } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Alíquota de 7,5%");
         } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Alíquota de 15%");
         } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Alíquota de 22,5%");
         } else {
            System.out.println("Alíquota de 27,5%");
         } 
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
