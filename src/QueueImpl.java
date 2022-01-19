import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

    public static void main(String[] args) {

        /*
        Filas - FIFO (First in, First out) – traduzindo do inglês: “primeiro que entra, primeiro que sai”.
        Exemplo de uso:
        Spool de impressão sobre qual arquivo foi enviado para impressão e gerado uma fila nesse processo do primeiro ao último
        E possivel utilizar generic
         */

        Queue queue = new LinkedList<>();

        // Adicionar
        System.out.println("Push: " + queue.add("a"));
        System.out.println("Push: " + queue.add("b"));

        System.out.println("Element: " + queue.element()); //Capturar o primeiro da fila

        // Remoção de itens
//        System.out.println("Remove: " + queue.remove()); // Pode gerar uma exception
        System.out.println("Poll: " + queue.poll()); // Ele gera um retorno de true ou false caso não consiga realizar remoção

        System.out.println("Element: " + queue.element()); // Caso a fila esteja vazia ele retorna uma exception
        System.out.println("Peek: " + queue.peek());






    }
}
