import java.util.Random;
import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) {

        /*
         Pilha ela pode receber um generic bem parecido com Vector
         O que é pilha estrutura de dados do tipo:
         -> LIFO (last in, first out) – nesse sistema o último que entra é o primeiro a sair.

         Exemplo de uso:
         Uso de funções recursivas dentro do compilador ou seja estou empilahdno a cada passagem da função recursiva
         É possível trabalhar com pilhas com valores estaticos e dinamicos.
         */

        Stack stack = new Stack();

        Random random = new Random();

        int i = 5;

        // Insira um novo elemento dentro da pilha.
        while (i != 0) {
            System.out.println("Push: " + stack.push(random.nextInt(20)));
            i--;
        }

        System.out.println("");
        // Realizar a remoção do primeiro item da pilha.
        while(!stack.isEmpty()){
//      for (int c = 0; c < 5; c++) {
                System.out.println("Pop: " + stack.pop());
        }

//        System.out.println(stack.get(0));
    }
}
