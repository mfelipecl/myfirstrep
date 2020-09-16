package exercicios.exercicio02;

public class Conta {
    //atributos
    private int numero;
    private double saldo;

    //contrutor
    public Conta (int numero){
        this.numero = numero;
        this.saldo = 0;

    }

    //metodos
    public double getSaldo(){
        return saldo;
    }
    public String exibir(){
        return "conta " + numero + " saldo: " + saldo;

    }

    public void depositar(double valor){
        if (valor > 0){
        saldo = saldo + valor;
        }
    }
    public void sacar(double valor){
        saldo = saldo - valor;
    }


}
