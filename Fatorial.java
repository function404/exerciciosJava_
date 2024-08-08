import java.util.Scanner;

public class Fatorial {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   
      try {
         System.out.println("Digite um número: ");
         int num = scanner.nextInt();
   
         if (num < 0) {
            System.out.println("Digite um número positivo.");
         } else {
            int fatorial = 1;
            for (int i = 1; i <= num; i++) {
               fatorial *= i;
            }
   
            System.out.println("O fatorial de " + num + " é: " + fatorial);
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
