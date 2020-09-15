package exemplos.exemplo03;

public class Funcionario {
    //atributos
    private String nome;
    private double salario;

    //construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    /* demais métodos */

    public String imprimir(){
        return nome + " : " + salario;
    }

    public void aumentarSalario(double perc){
        //salario = salario + (salario * perc);
        salario += salario * perc; 
    }

    public double getSalario(){
        return salario;
    }

    protected void setSalario(double salario){
        if(salario > this.salario){
            this.salario = salario;
        }
    }

}
