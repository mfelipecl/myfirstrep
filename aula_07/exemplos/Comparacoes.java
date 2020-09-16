import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comparacoes {
    
    public static void main(String[] args) {
        ArrayList<Produtos> lista = new ArrayList<>();
        HashSet<Produtos> set = new HashSet<>();
        HashMap<Integer, Produtos> mapa = new HashMap<>();

        Produtos p1 = new Produtos(1, "Arroz");
        Produtos p2 = new Produtos(2, "Feijão");

        lista.add(p1);
        lista.add(p1);

        System.out.println("Tamanho da lista: " + lista.size()); //p1.toString
        System.out.println(lista);

        set.add(p1);
        set.add(p1);

        System.out.println("Tamanho do set: " + set.size());
        System.out.println(set);

        mapa.put(p1.getCodigo(), p1);
        mapa.put(p2.getCodigo(), p2);

        System.out.println("Tamanho do mapa " + mapa.size());
        
        
    }
    
}
