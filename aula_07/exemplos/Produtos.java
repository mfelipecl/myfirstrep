
public class Produtos {
    private int codigo;
    private String nome;

    public Produtos (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;

    }

    public Integer getCodigo() {
		return null;
	}

    @Override
    //toString não precisa ser chamado. É chamado automaticamente quando precisa transformar o objeto em String
    public String toString() {
        
        return codigo + " : " + nome;
    }

	

}
