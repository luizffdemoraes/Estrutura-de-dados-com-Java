import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {
    public static void main(String[] args) {
        /*
        Tanto o Vactor quanto o ArrayList ele por padrão não é sincronizado não deve ser usado em ambiente multi tread
        Como sincronizar esses tipos de dados
        2 maneiras de utilizar de maneira sincronizada:
         -> Por meio de método Sincronized List
         -> Variavel TreadSafe copiar e escrever o mesmo dado dentro da Array List
         Garantindo a segurança do tread safe, garantindo menor volume de código e mais seguro
         */

//        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        List<String> list = new CopyOnWriteArrayList<String>();

        list.add("Leonan");
        list.add("Erik");
        list.add("Luiz");

//        synchronized (list) {
//            Iterator<String> iterator = list.iterator();
//
//            while(iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//        }

    }
}
