package exemplos.exemplo02;

public class AppPessoa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Marcos", 34);
        Pessoa p3 = new Pessoa("Aline");

        System.out.println(p1.dados());
        System.out.println(p2.dados());
        System.out.println(p3.dados(','));

    }
}
