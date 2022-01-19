import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {

        /*
        TreeSet ela vai prover uma implementação baseado na interface Set, ela trabalha com uma arvore para armazenamento
        os elementos são armazenados de forma ask, além disso para adição e recuperação de itens e bastante rapido
        é uma excelente escolha para um grande armazenamento de dados.

        first() Capturar o primeiro item.
        last() Capturar o último item.
        pool() Remover item
        poolFirst() Remover o primeiro item.
        poolLast() Remover o último item.

        Ela não e sincronizada.
         */

        TreeSet<Integer> tree = new TreeSet<Integer>();

        tree.add(2);
        tree.add(7);
        tree.add(8);
        tree.add(10);
        tree.add(20);

        System.out.println(tree);

        Iterator<Integer> iterator = tree.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree.isEmpty());
    }
}
