

import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String palavra = "java";
            char[] letras = new char[palavra.length()];
            for (int i = 0; i < palavra.length(); i++) {
                letras[i] = '_';
            }

            int tentativas = 0;
            while (tentativas < 6) {
                System.out.println("Dica: " + palavra.length() + " letras\n");
                System.out.print("Digite uma letra: ");
                char letra = scanner.next().charAt(0);

                boolean acertou = false;
                for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    letras[i] = letra;
                    acertou = true;
                }
                }

                if (!acertou) {
                tentativas++;
                }

                System.out.println(letras);
                if (palavra.equals(String.valueOf(letras))) {
                System.out.println("\tParabéns, você acertou a palavra!");
                break;
                }
            }

            if (tentativas == 6) {
                System.out.println("Você perdeu! A palavra era " + palavra);
            }
        } catch (Exception e) {
            System.out.println("Digite uma letra válida.");
        } finally {
            scanner.close();
        }
    } 
}
