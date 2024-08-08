import java.util.Scanner;

public class Tabuada {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try{
         System.out.println("Digite um número: ");
         int num = scanner.nextInt();

         if (num < 1 || num > 10) {
            System.out.println("Digite um número de 1 a 10.");
         } else {
            for (int i = 1; i <= 10; i++) {
               System.out.println(num + " x " + i + " = " + (num * i));
            }
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }
}
