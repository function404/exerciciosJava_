public class ArraysIntercalados {
    public static void main(String[] args) {
        // Criação dos dois arrays de 10 posições
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // Inicialização dos arrays com valores de exemplo
        System.out.println("Inicializando o array1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1; // Valores de 1 a 10
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("Inicializando o array2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (i + 1) * 10; // Valores de 10 a 100 (incrementos de 10)
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Criação do terceiro array para armazenar os valores intercalados
        int[] arrayIntercalado = new int[array1.length + array2.length];

        // Intercalando os valores dos dois arrays
        for (int i = 0; i < array1.length; i++) {
            arrayIntercalado[2 * i] = array1[i];
            arrayIntercalado[2 * i + 1] = array2[i];
        }

        // Imprimindo os três arrays
        System.out.println("Array 1:");
        for (int valor : array1) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("Array 2:");
        for (int valor : array2) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("Array Intercalado:");
        for (int valor : arrayIntercalado) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
