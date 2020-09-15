package exemplos.exemplo02;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        nome="Não cadastrado";
        //idade = 0; já é o padrão
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 18;
    }

    //Overload do construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    
    public String dados(char separador){
        return nome + separador + idade;
    }
    
    //overload do método dados
    public String dados(){
        return dados(':');
    }
}
