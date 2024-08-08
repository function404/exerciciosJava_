public class SomaImparesMultiplosDeSete {
   public static void main(String[] args) {
      int soma = 0;
      for (int i = 1; i <= 500; i++) {
         if (i % 2 != 0 && i % 7 == 0) {
            soma += i;
         }
      }
      System.out.println("A soma dos números ímpares múltiplos de 7 entre 1 e 1000 é: " + soma);
   }  
}
