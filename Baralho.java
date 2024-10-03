import java.util.ArrayList;
import java.util.List;

public class Baralho {
    public static void main(String[] args) {
        // Definindo os naipes e valores das cartas
        String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
        String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        // Criando uma lista para armazenar as cartas do baralho
        List<String> baralho = new ArrayList<>();

        // Montando as 52 cartas (combinação de valor e naipe)
        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.add(valor + " de " + naipe);
            }
        }

        // Imprimindo todas as cartas do baralho
        System.out.println("Cartas do baralho:");
        for (String carta : baralho) {
            System.out.println(carta);
        }
    }
}
