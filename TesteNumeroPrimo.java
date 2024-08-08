import java.util.Scanner;

public class TesteNumeroPrimo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Digite um número: ");
         int num = scanner.nextInt();

         if (num <= 1) {
            System.out.println("O número " + num + " não é primo.");
         } else {
            boolean primo = true;
            for (int i = 2; i < num; i++) {
               if (num % i == 0) {
                  primo = false;
                  break;
               }
            }

            if (primo) {
               System.out.println("O número " + num + " é primo.");
            } else {
               System.out.println("O número " + num + " não é primo.");
            }
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
