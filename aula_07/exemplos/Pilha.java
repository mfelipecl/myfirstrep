import java.util.Stack;

/**
 * Exemplo de Pilha em Java
 */
public class Pilha {

    /*
     * Tipos básicos - Classe que representa o tipo int Integer float Float char
     * Character double Double boolean Boolean
     * 
     */
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // empilhar os valores
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        // while( pilha.isEmpty() != true) // while( pilha.isEmpty() == false)
        while (!pilha.isEmpty()) { // enquanto a pilha não estiver vazia
            int numero = pilha.pop();  // desempiha
            System.out.println(numero); // exibe o número que foi desempilhado
        }

    }
}