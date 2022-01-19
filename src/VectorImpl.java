import java.util.Vector;

public class VectorImpl {

    public static void main(String[] args) {

        /*
            E usado quando ha necessidade de utilizar array acesso e toda implementação.
            Não é necessário informar a quantidade de itens que serão alocados.
            Permite trabalhar com qualquer tipo.
            Diferencial:
            -> Crescimento dinâmico

            Adicionar novo elemento diferença:
            add(); Retorna caso utilize verificação retorna um booleano
            addElement(); Retornar Vazio ou algo nulo

            Comparação:
            int[] arr = new int[10]; É necessário ao instanciar definir o tamanho fixo.

            arr[0] = 1;
            arr[1] = "5"; Erro pois o tipo diverge


         */

        // Construtor sem nada e segundo tipo definindo tamanho
        Vector v = new Vector<>(2, 3);
        System.out.println(v.capacity());

        v.addElement(1);
        v.addElement("5");


        System.out.println(v.size());
        v.addElement("bc");
        System.out.println(v.capacity());
//        v.remove(0); Remove elemento pela posição.
//        System.out.println(v.size());

        // Realizar iteração 2 formas :

//        while (v.elements().hasMoreElements()) {
//            System.out.println(v.elements().nextElement());
//        }
//
//        while (v.iterator().hasNext()) {
//            System.out.println(v.iterator().next());
//        }
    }
}
