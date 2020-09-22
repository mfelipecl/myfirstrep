package exercicio02;

public class ContaPoupanca extends Conta {
    private static double taxa; //static: o mesmo atributo para todos os objetos pois é um atributo de CLASSE

    public ContaPoupanca(int numero){
        super(numero);
    }

    //o método que altera o atributo de classe deve ser static também
    public static void setTaxa(double taxaPoup){
        taxa = taxaPoup;
    }

    public double getTaxa(){
        return taxa;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() + taxa >= valor) {
            return super.sacar(valor + taxa);
        }else{
            return false;
        }
    }
    @Override
    public String exibir() {
        
        return "Poupança: " + super.exibir();
    }
}

