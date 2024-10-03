import java.util.Scanner;

public class FilaBancoComArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho máximo da fila
        int tamanhoMaximoFila = 5;
        String[] fila = new String[tamanhoMaximoFila];
        int fimFila = 0; // Índice que controla o final da fila

        while (true) {
            System.out.println("\n1. Adicionar cliente à fila");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    if (fimFila < tamanhoMaximoFila) {
                        System.out.print("Digite o nome do cliente: ");
                        String cliente = scanner.nextLine();
                        fila[fimFila] = cliente;
                        fimFila++;
                    } else {
                        System.out.println("A fila está cheia.");
                    }
                    break;

                case 2:
                    if (fimFila > 0) {
                        System.out.println("Atendendo " + fila[0]);
                        // Movendo a fila para frente
                        for (int i = 0; i < fimFila - 1; i++) {
                            fila[i] = fila[i + 1];
                        }
                        fila[fimFila - 1] = null; // Último elemento agora é nulo
                        fimFila--;
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                    }
                    break;

                case 3:
                    System.out.println("Fila atual:");
                    for (int i = 0; i < fimFila; i++) {
                        System.out.println((i + 1) + ". " + fila[i]);
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
