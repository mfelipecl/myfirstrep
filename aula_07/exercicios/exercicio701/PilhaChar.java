package exercicio701;

import java.util.Stack;

public class PilhaChar {

    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        String frase = "Este exercício é muito fácil";

        for (int i = 0; i < frase.length(); i++){
            pilha.push(frase.charAt(i));
        }

        while (!pilha.isEmpty()){
            System.out.print(pilha.pop());

        }
        System.out.println();

    }
    
}
