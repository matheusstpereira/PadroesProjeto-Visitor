package padroescomportamentais.visitor;

public class Policial implements Visitable{

    private String nome;
    private String endereco;
    private String funcao;


    public Policial(String nome, String endereco, String funcao) {
        this.nome = nome;
        this.endereco = endereco;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getFuncao(){
        return funcao;
    }


    @Override
    public void aceitaVisita(Visitor visitor){
        visitor.visitaPolicial(this);
    }

}
