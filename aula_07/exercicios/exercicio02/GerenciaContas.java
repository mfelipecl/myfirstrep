package exercicio02;

//import java.security.Key;
//import java.util.ArrayList;
import java.util.HashMap;

public class GerenciaContas {
    //private ArrayList<Conta> listaDeContas = new ArrayList<>();
    private HashMap<Integer, Conta> newlistaDeContas = new HashMap<>();

    public void novaContaCorrente(int numeroConta) {

        //listaDeContas.add(new ContaCorrente(numeroConta));
        newlistaDeContas.put(numeroConta, new ContaCorrente(numeroConta));

    }

    public void novaContaPoupanca(int numeroConta) {

        newlistaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {

        newlistaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public boolean depositar(int numeroConta, double valor) {

        if (valor <= 0) {
            return false;
        }
        //for (Conta conta : listaDeContas) {
            if (newlistaDeContas.containsKey(numeroConta)) {
                newlistaDeContas.get(numeroConta).depositar(valor);
                return true;
            }

        
        return false;
    }
    public boolean sacar(int numeroConta, double valor) {
        Conta conta = newlistaDeContas.get(numeroConta);
        if (conta != null) {
            return conta.sacar(valor);
        }
        
        return false;
    } public String listarContas() {
        String saida = "";
        for (Integer Key : newlistaDeContas.keySet()) {
            saida += newlistaDeContas.get(Key).exibir() + "\n";
        }
        return saida;
    }
}
