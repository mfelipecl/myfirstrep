import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;



public class Fila {
    
    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++){
            fila.add(rnd.nextInt(11)); //adiciona na fila valores de 1 a 10 na fila

        }
        System.out.println(fila);

        while(!fila.isEmpty()){
            System.out.println(fila.remove());
        }
        System.out.println(fila);
        
    }

}
