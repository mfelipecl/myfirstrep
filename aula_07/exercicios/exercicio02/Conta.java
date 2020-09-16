package exercicio02;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String exibir() {
        return numero + " : " + saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

}