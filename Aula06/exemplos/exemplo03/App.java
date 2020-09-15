package exemplos.exemplo03;

public class App {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Ana Rita", 5000);
        Gerente g1 = new Gerente("Landri", 10000, 10);

        System.out.println(f1.imprimir());
        System.out.println(g1.imprimir());

        f1.aumentarSalario(0.1);
        g1.aumentarSalario(0.1);

        System.out.println(f1.imprimir());
        System.out.println(g1.imprimir());

    }
}
