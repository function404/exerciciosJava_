package Java;

public class StringParaInteiro {
   public static void main(String[] args) {
      String str = "22.22";

      String strSemPonto = str.replace(".", "");
      int numero = Integer.parseInt(strSemPonto);

      System.out.println(numero);
   }
}
