import java.util.ArrayList;
import java.util.List;

public class UnirListas {
    public static void main(String[] args) {
        // Criação das duas listas de inteiros
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        // Adicionando elementos à primeira lista
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        // Adicionando elementos à segunda lista
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        // Unindo as duas listas
        List<Integer> listaUnida = new ArrayList<>(lista1);
        listaUnida.addAll(lista2);

        // Imprimindo a lista unida
        System.out.println("Lista unida: " + listaUnida);
    }
}

