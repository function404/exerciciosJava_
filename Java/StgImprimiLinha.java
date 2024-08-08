package Java;

import java.util.Scanner;

public class StgImprimiLinha {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      try {
         System.out.print("Digite uma string: ");
         String linhas = scanner.nextLine();
         
         for (int i = 0; i < linhas.length(); i++) {
            System.out.println(linhas.charAt(i));
         }
      } catch (Exception e) {
         System.out.println("Digite um número válido.");
      } finally {
         scanner.close();
      }
   }   
}